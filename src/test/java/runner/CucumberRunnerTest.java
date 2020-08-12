package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.DriverLoading;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/java/features", glue = "stepDefinitions")

public class CucumberRunnerTest extends DriverLoading {

}
