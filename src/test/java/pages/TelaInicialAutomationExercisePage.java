package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaInicialAutomationExercisePage extends BasePage {

	/**
	 * Abrir tela inicial do Automation Exercise
	 * 
	 * @throws Exception
	 */
	public void abrirPagina(String url) throws Exception {
		dsl.abrirUrl(url);
	}
	
	/**
	 * Clicar no link 'Signup / Login' no menu superior
	 * @throws Exception
	 */
	public void clicarLinkSignupLogin() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@href = '/login']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar no link Signup Login");
		dsl.clicarPorXpath("//*[@href = '/login']");
	}

	/**
	 * Clicar no link 'Products' no menu superior
	 * @throws Exception
	 */
	public void clicarLinkProducts() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@href = '/products']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar no link Products");
		dsl.clicarPorXpath("//*[@href = '/products']");
	}

	/**
	 * Clicar no link 'Cart' no menu superior
	 * @throws Exception
	 */
	public void clicarLinkCart() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@href = '/view_cart']/i", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Clicar no link Cart");
		dsl.clicarPorXpath("//*[@href = '/view_cart']/i");
	}

}
