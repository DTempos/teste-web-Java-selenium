package stepsDefinition;

import Functions.RealizarCompraFunctions;
import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class RealizarCompraSteps extends BaseTest {

	static RealizarCompraFunctions realizarCompraFunctions = new RealizarCompraFunctions();

	@Dado("que acesso a tela inicial do site Automation Exercise")
	public void queAcessoATelaInicialDoSiteAutomationExercise() throws Throwable {
		realizarCompraFunctions.abrirTelaInicialAutomationExercise();
	}

	@Quando("acessar tela de login")
	public void acessarTelaDeLogin() throws Throwable {
		realizarCompraFunctions.acessarTelaDeLogin();
	}

	@Quando("realizar login com email {string} e senha {string}")
	public void realizarLoginComEmailESenha(String email, String senha) throws Throwable {
		realizarCompraFunctions.realizarLoginComEmailESenha(email, senha);
	}

	@Quando("^acessar tela de produtos$")
	public void acessarTelaDeProdutos() throws Throwable {
		realizarCompraFunctions.acessarTelaDeProdutos();
	}

	@Quando("pesquisar e visualizar o produto {string}")
	public void pesquisarEVisualizarProduto(String produto) throws Throwable {
		realizarCompraFunctions.pesquisarEVisualizarProduto(produto);
	}

	@Quando("selecionar quantidade {string} do produto {string} e adicionar produto ao carrinho")
	public void selecionarQtdeDoProdutoEAdicionarProdutoAoCarrinho(String qtde, String produto) throws Throwable {
		realizarCompraFunctions.selecionarQtdeEAdicionarProdutoAoCarrinho(qtde, produto);
	}

	@Quando("^acessar tela de carrinho")
	public void acessarTelaDeCarrinho() throws Throwable {
		realizarCompraFunctions.acessarTelaDeCarrinho();
	}

	@Quando("validar que o produto {string} está no carrinho")
	public void validarQueOProdutoStrEstaNoCarrinho(String produto) throws Throwable {
		realizarCompraFunctions.validarProdutoNoCarrinho(produto);
	}

	@Quando("seguir com a compra na tela de carrinho")
	public void seguirComACompraNaTelaDeCarrinho() throws Throwable {
		realizarCompraFunctions.seguirComACompraNaTelaDeCarrinho();
	}

	@Quando("realizar a compra na tela de Checkout")
	public void realizarACompraNaTelaDeCheckout() throws Throwable {
		realizarCompraFunctions.realizarCompraNaTelaDeCheckout();
	}

	@Quando("informar os dados de pagamento e confirmar a compra na tela de Pagamento")
	public void informarOsDadosDePagamentoEConfirmarCompraNaTelaDePagamento() throws Throwable {
		realizarCompraFunctions.informarDadosPagamentoEConfirmarPedido();
	}

	@Entao("validar mensagem {string} confirmando pedido com sucesso")
	public void informarOsDadosDePagamentoEConfirmarCompraNaTelaDePagamento(String mensagem) throws Throwable {
		realizarCompraFunctions.validarMensagemPedidoConfirmado(mensagem);
	}
}
