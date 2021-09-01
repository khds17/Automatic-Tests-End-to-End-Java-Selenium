package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import testCore.BaseTest;
import testPages.HomePage;

public class HomeTests extends BaseTest {
	
	HomePage homePage = new HomePage();

	@Test
	public void acessarBuscaDeCuidadorPeloMenu() {
		homePage.acessarTelaInicial();
		homePage.menuEncontreUmCuidador();

		assertEquals("http://localhost:8000/encontreCuidador", homePage.getUrl());
	}

	@Test
	public void acessarBuscaDeCuidadorPeloBotao() {
		homePage.acessarTelaInicial();
		homePage.botaoEncontreUmCuidador();

		assertEquals("http://localhost:8000/encontreCuidador", homePage.getUrl());
	}

	@Test
	public void acessarBuscaDeCuidadorPeloRodape() {
		homePage.acessarTelaInicial();
		homePage.rodapeEncontreUmCuidador();

		assertEquals("http://localhost:8000/encontreCuidador", homePage.getUrl());
	}

	@Test
	public void acessarFormularioParaSerCuidadorPeloMenu() {
		homePage.acessarTelaInicial();
		homePage.menuSejaUmCuidador();

		assertEquals("http://localhost:8000/prestador/create", homePage.getUrl());
	}

	@Test
	public void acessarFormularioParaSerCuidadorPeloBotao() {
		homePage.acessarTelaInicial();
		homePage.botaoSejaUmCuidador();

		assertEquals("http://localhost:8000/prestador/create", homePage.getUrl());
	}

	@Test
	public void acessarFormularioParaSerCuidadorPeloRodape() {
		homePage.acessarTelaInicial();
		homePage.rodapeSejaUmCuidador();

		assertEquals("http://localhost:8000/prestador/create", homePage.getUrl());
	}
}
