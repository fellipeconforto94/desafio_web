package bean.dsl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverLoading;

public class Commands extends DriverLoading {

	private static final long DEFAULT_TIME_WAIT = 10;

	public static WebDriver getDriver() {
		return DriverLoading.driver;
	}

	protected void abrirUrl(String url) {
		getDriver().get(url);
	}


	protected void escrever(String datatype, By locator) {
		isVisible(locator);
		getElement(locator).clear();
		this.waitForTextInElement(locator, "");
		getElement(locator).sendKeys(datatype);
	}

	protected void clicar(By locator) {
		isClickable(locator);
		getElement(locator).click();
	}

	protected WebElement waitElement(By locator) {
		return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
				.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	protected boolean isVisible(By locator) {
		new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT).until(ExpectedConditions.visibilityOf(getElement(locator)));
		return getElement(locator).isDisplayed();
	}

	protected boolean isClickable(By locator) {
		new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
				.until(ExpectedConditions.elementToBeClickable(getElement(locator)));
		return getElement(locator).isDisplayed() && getElement(locator).isEnabled();

	}

	protected void waitForTextInElement(By locator, String textToBeWait) {
		new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT).until(ExpectedConditions.textToBe(locator, textToBeWait));
	}

	protected boolean isAttachedToHtml(By locator) {
		try {
			waitElement(locator);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	protected void pressionarEnter(By locator) {
		isVisible(locator);
		getElement(locator).sendKeys(Keys.ENTER);
	}

	protected String getTextFromLabel(By locator) {
		return getElement(locator).getText().trim();
	}

	protected WebElement getElement(By locator) {
		return waitElement(locator);
	}

}
