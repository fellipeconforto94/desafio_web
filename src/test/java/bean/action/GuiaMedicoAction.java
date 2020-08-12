package bean.action;

import bean.dsl.Commands;
import bean.pages.GuiaMedicoElements;

public class GuiaMedicoAction extends Commands {

	GuiaMedicoElements guiaMedico = new GuiaMedicoElements();

	public void pesquisarMedicos(String especialidade, String estado, String cidade) {
		pesquisarEspecialidade(especialidade);
		pesquisarEstadoCidade(estado, cidade);
		selecionarRegiaoAtendida();
		clickContinuar();
	}

	private void pesquisarEspecialidade(String especialidade) {
		sendKeys(especialidade, guiaMedico.inputPesquisa);
		click(guiaMedico.btnPesquisar);
	}

	private void pesquisarEstadoCidade(String estado, String cidade) {
		isAttachedToHtml(guiaMedico.inputEstado);
		click(guiaMedico.inputEstadoClick);
		sendKeys(estado, guiaMedico.inputEstado);
		pressionarEnter(guiaMedico.inputEstado);
		click(guiaMedico.inputCidadeClick);
		sendKeys(cidade, guiaMedico.inputCidade);
		pressionarEnter(guiaMedico.inputCidade);
	}

	private void selecionarRegiaoAtendida() {
		isAttachedToHtml(guiaMedico.rdUnimedPreferencia);
		click(guiaMedico.rdUnimedPreferencia);
	}

	private void clickContinuar() {
		click(guiaMedico.btnContinuar);
	}

	public boolean verificarEspecialidade(String especialidade) {
		isAttachedToHtml(guiaMedico.resultEspecialidade);
		return getTextFromLabel(guiaMedico.resultEspecialidade).equals(especialidade);
	}

	public boolean verificarEndereco(String cidade) {
		isAttachedToHtml(guiaMedico.resultEspecialidade);
		return getTextFromLabel(guiaMedico.resultEndereco).contains(cidade);
	}

}