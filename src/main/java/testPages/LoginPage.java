package testPages;

import org.openqa.selenium.By;
import testCore.BasePage;
import testCore.DriverFactory;

public class LoginPage extends BasePage {

	public void acessarLogin() {
		DriverFactory.getDriver().get("http://localhost:8000/login");
	}

	public void setEmail(String email) {
		write(By.id("email"), email);
	}
	
	public void setSenha(String senha) {
		write(By.id("password"), senha);
	}

	public void logar() {
		clickButton(By.xpath("//button[@type='submit']"));
	}

	public String getErrorLoginInvalido() {
		return getText(By.xpath("//span[@role='alert']//strong"));
	}

}
