package tests;

import testCore.BaseTest;
import org.junit.Test;
import testPages.LoginPage;
import static org.junit.Assert.*;

public class LoginTests extends BaseTest {

    LoginPage login = new LoginPage();

    @Test
    public void acessoLoginValido() {
        login.acessarLogin();
        login.setEmail("sophia-joana@tuamaeaquelaursa.com");
        login.setSenha("102030");
        login.logar();

        assertEquals("http://localhost:8000/cadastroPrestador", login.getUrl());
    }

    @Test
    public void acessoLoginEmailOuSenhaInvalido() {
        login.acessarLogin();
        login.setEmail("sophia-joana@tuamaeaquelaursa.com");
        login.setSenha("10203040");
        login.logar();

        assertEquals("Dados do login incorreto. Verifique seu e-mail e senha.", login.getErrorLoginInvalido());
    }

    @Test
    public void acessoLoginInvalido() {
        login.acessarLogin();
        login.setEmail("teste@gmail.com");
        login.setSenha("10203040");
        login.logar();

        assertEquals("Acesso não permitido. Entre em contato conosco por e-mail ou aguarde nosso contato.", login.getErrorLoginInvalido());
    }

    @Test
    public void acessoLoginExcessoDeTentativaFalhas() {
        login.acessarLogin();
        login.setEmail("teste@gmail.com");

        for (int i = 0; i < 6; i++) {
            login.setSenha("10203040");
            login.logar();
        }

        assertEquals("Excesso de tentativas falhas. Tente novamente em 1 minuto.", login.getErrorLoginInvalido());
    }
}
