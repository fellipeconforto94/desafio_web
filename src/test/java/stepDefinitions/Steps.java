package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Assert;

import bean.action.GuiaMedicoAction;
import bean.action.UnimedHomeAction;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utils.DriverLoading;

public class Steps extends DriverLoading {

	UnimedHomeAction unimedHome = new UnimedHomeAction();
	GuiaMedicoAction guiaMedico = new GuiaMedicoAction();

	@Before
	public void beforeRunTest() throws IOException {
		driver = initDriver();
		driver.get(property.getProperty("url"));
	}

	@After
	public void afterExecution() throws IOException {
		driver.quit();
	}

	@Dado("^que o usuário acesse o \"([^\"]*)\" na página inicial$")
	public void que_o_usuario_acesse_o_na_pagina_inicial(String menu) {
		unimedHome.acessarMenuUnimed(menu);
	}

	@Quando("^realizar uma pesquisa por \"([^\"]*)\" do estado \"([^\"]*)\" e cidade \"([^\"]*)\"$")
	public void realizar_uma_pesquisa_por_do_estado_e_cidade(String especialidade, String estado, String cidade) {
		guiaMedico.pesquisarMedicos(especialidade, estado, cidade);
	}

	@Então("^pesquisa realizada com sucesso para especialidade \"([^\"]*)\" e cidade \"([^\"]*)\"$")
	public void pesquisa_realizada_com_sucesso_para_especialidade_e_cidade(String especialidade, String cidade) {
		assertTrue(guiaMedico.verificarEspecialidade(especialidade));
		assertTrue(guiaMedico.verificarEndereco(cidade));
	}

	@Então("^valida a pesquisa com sucesso para cidade \"([^\"]*)\" e não apresentação da cidadeSP \"([^\"]*)\"$")
	public void valida_a_pesquisa_com_sucesso_para_cidade_e_não_apresentação_da_cidadeSP(String cidade,
			String cidadeSP) {

		Assert.assertNotEquals(guiaMedico.verificarEndereco(cidadeSP), guiaMedico.verificarEndereco(cidade));
	}

}
