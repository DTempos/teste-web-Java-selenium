package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaCarrinhoDetalhadoPage extends BasePage {

	/**
	 * Obter nome do produto na tela de carrinho
	 * @param produto
	 * @return
	 * @throws Exception
	 */
	public String getNomeProdutoTelaCarrinhoDetalhado(String produto) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = '" + produto + "']", Duration.ofSeconds(15));

        return dsl.obterTextoPorXpath("//*[text() = '" + produto + "']");
	}

	/**
	 *  Clicar botão 'Proceed to checkout'
	 * @throws Exception
	 */
	public void clicarBotaoSeguirComACompraContinuarComprando() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = 'Proceed To Checkout']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Seguir com a compra");
		dsl.clicarPorXpath("//*[text() = 'Proceed To Checkout']");
	}
}
