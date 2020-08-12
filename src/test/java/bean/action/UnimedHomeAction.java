package bean.action;

import org.openqa.selenium.By;

import bean.dsl.Commands;
import bean.pages.UnimedHomeElements;

public class UnimedHomeAction extends Commands {

	UnimedHomeElements unimedHome = new UnimedHomeElements();

	public void acessarMenuUnimed(String menu) {
		By btnMenuGuiaMedico = By.linkText(menu);
		isAttachedToHtml(unimedHome.navBarMenu);
		clicar(btnMenuGuiaMedico);
	}
}
