package Functions;

import core.BaseTest;
import managers.FileReaderManager;
import pages.*;

import static org.junit.Assert.assertEquals;

public class RealizarCompraFunctions {

	TelaInicialAutomationExercisePage telaInicialAutomationExercisePage = new TelaInicialAutomationExercisePage();
	TelaLoginPage telaLoginPage = new TelaLoginPage();
	TelaProductsPage telaProductsPage = new TelaProductsPage();
	TelaProdutoDetalhadoPage telaProdutoDetalhadoPage = new TelaProdutoDetalhadoPage();
	TelaCarrinhoDetalhadoPage telaCarrinhoDetalhadoPage = new TelaCarrinhoDetalhadoPage();
	TelaCheckoutPage telaCheckoutPage = new TelaCheckoutPage();
	TelaPaymentPage telaPaymentPage = new TelaPaymentPage();
	TelaPedidoConfirmadoPage telaPedidoConfirmadoPage = new TelaPedidoConfirmadoPage();

	public void abrirTelaInicialAutomationExercise() throws Exception {
		String url = FileReaderManager.getInstance().getConfigReader().getURLAutomation();
		telaInicialAutomationExercisePage.abrirPagina(url);
	}

	public void acessarTelaDeLogin() throws Exception {
		telaInicialAutomationExercisePage.clicarLinkSignupLogin();
	}

	public void realizarLoginComEmailESenha(String email, String senha) throws Exception {
		telaLoginPage.informarEmailLogin(email);
		telaLoginPage.informarSenhaLogin(senha);
		telaLoginPage.clicarBotaoLogin();
	}

	public void acessarTelaDeProdutos() throws Exception {
		telaInicialAutomationExercisePage.clicarLinkProducts();
	}

	public void pesquisarEVisualizarProduto(String produto) throws Exception {
		try {
			telaProductsPage.fecharPopupPublicidade();
		} catch (Exception e) {

		}

		telaProductsPage.informarProduto(produto);
		telaProductsPage.clicarBotaoPesquisar();
		telaProductsPage.aguardarBotaoVisualizarProduto();
		telaProductsPage.pressionarTeclaPageDown();
		BaseTest.takeScreenshot("Produto encontrado");
		telaProductsPage.clicarBotaoVisualizarProduto();
	}

	public void selecionarQtdeEAdicionarProdutoAoCarrinho(String qtde, String produto) throws Exception {
		String produtoDetalhado = telaProdutoDetalhadoPage.getNomeProdutoDetalhado();
		assertEquals(produto, produtoDetalhado);
		telaProdutoDetalhadoPage.informarQtdeProduto(qtde);
		telaProdutoDetalhadoPage.clicarBotaoAdicionarAoCarrinho();
		telaProdutoDetalhadoPage.clicarBotaoContinuarComprando();
	}

	public void acessarTelaDeCarrinho() throws Exception {
		telaInicialAutomationExercisePage.clicarLinkCart();
	}

	public void validarProdutoNoCarrinho(String produto) throws Exception {
		String produtoCarrinho = telaCarrinhoDetalhadoPage.getNomeProdutoTelaCarrinhoDetalhado(produto);
		assertEquals(produto, produtoCarrinho);
	}

	public void seguirComACompraNaTelaDeCarrinho() throws Exception {
		telaCarrinhoDetalhadoPage.clicarBotaoSeguirComACompraContinuarComprando();
	}

	public void realizarCompraNaTelaDeCheckout() throws Exception {
		telaCheckoutPage.clicarBotaoComprarNaTelaDeCheckout();
	}

	public void informarDadosPagamentoEConfirmarPedido() throws Exception {
		String nomeCartao = FileReaderManager.getInstance().getConfigReader().getNomeCartao();
		telaPaymentPage.informarNomeCartao(nomeCartao);

		String numeroCartao = FileReaderManager.getInstance().getConfigReader().getNumeroCartao();
		telaPaymentPage.informarNumeroCartao(numeroCartao);

		String cvvCartao = FileReaderManager.getInstance().getConfigReader().getCvvCartao();
		telaPaymentPage.informarCVCCartao(cvvCartao);

		String mesExpiracaoCartao = FileReaderManager.getInstance().getConfigReader().getMesExpiracaoCartao();
		telaPaymentPage.informarMesExpiracaoCartao(mesExpiracaoCartao);

		String anoExpiracaoCartao = FileReaderManager.getInstance().getConfigReader().getAnoExpiracaoCartao();
		telaPaymentPage.informarAnoExpiracaoCartao(anoExpiracaoCartao);

		telaPaymentPage.clicarBotaoPagarEConfirmarPedido();
	}

	public void validarMensagemPedidoConfirmado(String mensagem) throws Exception {
		String mensagemSucesso = telaPedidoConfirmadoPage.getMensagemPedidoConfirmado();
		assertEquals(mensagem, mensagemSucesso);
		BaseTest.takeScreenshot("Pedido confirmado com sucesso");
	}
}
