package bean.pages;

import org.openqa.selenium.By;

public class GuiaMedicoElements {

	public final By inputPesquisa = By.id("campo_pesquisa");
	public final By btnPesquisar = By.id("btn_pesquisar");
	public final By inputEstado = By.id("react-select-2-input");
	public final By inputCidade = By.id("react-select-3-input");
	public final By inputEstadoClick = By.xpath("//*[@class='css-151xaom-placeholder' and text()='Estado']");
	public final By inputCidadeClick = By.xpath("//*[@class='css-151xaom-placeholder' and text()='Cidade']");
	public final By rdUnimedPreferencia = By.cssSelector("form[class*='escolher-unimed'] input");
	public final By btnContinuar = By.cssSelector("button[class='btn btn-success']");
	public final By resultEspecialidade = By.xpath("//*[@id=\"resultado0\"]/div[1]/p/span[2]");
	public final By resultEndereco = By.id("txt_endereco");
}
