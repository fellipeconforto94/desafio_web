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
		escrever(especialidade, guiaMedico.inputPesquisa);
		clicar(guiaMedico.btnPesquisar);
	}

	private void pesquisarEstadoCidade(String estado, String cidade) {
		isAttachedToHtml(guiaMedico.inputEstado);
		clicar(guiaMedico.inputEstadoClick);
		escrever(estado, guiaMedico.inputEstado);
		pressionarEnter(guiaMedico.inputEstado);
		clicar(guiaMedico.inputCidadeClick);
		escrever(cidade, guiaMedico.inputCidade);
		pressionarEnter(guiaMedico.inputCidade);
	}

	private void selecionarRegiaoAtendida() {
		isAttachedToHtml(guiaMedico.rdUnimedPreferencia);
		clicar(guiaMedico.rdUnimedPreferencia);
	}

	private void clickContinuar() {
		clicar(guiaMedico.btnContinuar);
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