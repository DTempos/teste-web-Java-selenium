package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaLoginPage extends BasePage {

	/**
	 *
	 * @param email
	 * @throws Exception
	 */
	public void informarEmailLogin(String email) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@data-qa = 'login-email']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@data-qa = 'login-email']", email);
	}

	/**
	 *
	 * @param senha
	 * @throws Exception
	 */
	public void informarSenhaLogin(String senha) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@data-qa = 'login-password']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@data-qa = 'login-password']", senha);
	}

	/**
	 * Clicar no botão de login
	 * @throws Exception
	 */
	public void clicarBotaoLogin() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@data-qa = 'login-button']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar no botão de login após informar email e senha");
		dsl.clicarPorXpath("//*[@data-qa = 'login-button']");
	}

}
