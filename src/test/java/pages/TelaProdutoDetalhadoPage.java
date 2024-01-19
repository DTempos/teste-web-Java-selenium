package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaProdutoDetalhadoPage extends BasePage {

	/**
	 *
	 * @return
	 * @throws Exception
	 */
	public String getNomeProdutoDetalhado() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@class = 'product-information']/h2", Duration.ofSeconds(15));

        return dsl.obterTextoPorXpath("//*[@class = 'product-information']/h2");
	}

	/**
	 *
	 * @param qtde
	 * @throws Exception
	 */
	public void informarQtdeProduto(String qtde) throws Exception {
		dsl.limparCampoPorId("quantity");
		dsl.escrevePorId("quantity", qtde);
		BaseTest.takeScreenshot("Informar quantidade do produto");
	}

	/**
     * Clicar no botão de adicionar ao carrinho na tela de produto detalhado
	 * @throws Exception
	 */
	public void clicarBotaoAdicionarAoCarrinho() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@type = 'button']/i", Duration.ofSeconds(30));
		dsl.clicarPorXpath("//*[@type = 'button']/i");
	}

	public void clicarBotaoContinuarComprando() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = 'Continue Shopping']", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Continuar comprando");
		dsl.clicarPorXpath("//*[text() = 'Continue Shopping']");
	}
}
