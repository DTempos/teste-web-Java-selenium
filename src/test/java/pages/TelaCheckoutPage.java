package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaCheckoutPage extends BasePage {

	/**
     *  Clicar botão 'Place Order'
	 * @throws Exception
	 */
	public void clicarBotaoComprarNaTelaDeCheckout() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = 'Place Order']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Realizar a compra");
		dsl.clicarPorXpath("//*[text() = 'Place Order']");
	}
}
