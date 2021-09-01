package testPages;

import org.openqa.selenium.By;

import testCore.DriverFactory;
import testCore.BasePage;

public class HomePage extends BasePage {

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://localhost:8000");
	}

	public void menuEncontreUmCuidador() {
		clickButton(By.id("navbarEncontreUmCuidador"));
	}

	public void botaoEncontreUmCuidador() {
		clickButton(By.id("botaoEncontreCuidadores"));
	}

	public void rodapeEncontreUmCuidador() {
		clickButton(By.id("encontreUmCuidadorRodape"));
	}

	public void menuSejaUmCuidador() {
		clickButton(By.id("navbarSejaUmCuidador"));
	}

	public void botaoSejaUmCuidador() {
		clickButton(By.id("navbarSejaUmCuidador"));
	}

	public void rodapeSejaUmCuidador() {
		clickButton(By.id("sejaUmCuidadorRodape"));
	}

	public void botaoLogin() {
		clickButton(By.id("botaoSejaUmCuidador"));
	}
	
}
