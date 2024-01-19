package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaProductsPage extends BasePage {

	/**
	 * Fechar popup de publicidade
	 * @throws Exception
	 */
	public void fecharPopupPublicidade() throws Exception {
		dsl.acessarIframePorId("aswift_6", Duration.ofSeconds(10));
		dsl.visibilidadeElementoPorXpath("//*[@id = 'dismiss-button']/div", Duration.ofSeconds(10));
		dsl.clicarPorXpath("//*[@id = 'dismiss-button']/div");
	}

	/**
	 * Informar produto a ser pesquisado
	 * @throws Exception
	 */
	public void informarProduto(String produto) throws Exception {
		dsl.visibilidadeElementoPorId("search_product", Duration.ofSeconds(30));
		dsl.escrevePorId("search_product", produto);
		BaseTest.takeScreenshot("Informar produto e pesquisar");
	}

	/**
     * Clicar no botão de pesquisar da tela de produtos
	 * @throws Exception
	 */
	public void clicarBotaoPesquisar() throws Exception {
		dsl.visibilidadeElementoPorId("submit_search", Duration.ofSeconds(30));
		dsl.clicarPorId("submit_search");
	}

	/**
	 * Aguardar até que apareça na tela o botão Visualizar produto para evidenciar o mesmo
	 * @throws Exception
	 */
	public void aguardarBotaoVisualizarProduto() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = 'View Product']", Duration.ofSeconds(30));
	}

	/**
	 * Clicar no botão de visualizar o produto
	 * @throws Exception
	 */
	public void clicarBotaoVisualizarProduto() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = 'View Product']", Duration.ofSeconds(30));
		dsl.clicarPorXpath("//*[text() = 'View Product']");
	}

	/**
	 * Pressionar tecla Page Down do teclado automaticamente
	 * @throws Exception
	 */
	public void pressionarTeclaPageDown() throws Exception {
		dsl.pressionaTeclaPAGE_DOWN();
	}

}
