package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaPaymentPage extends BasePage {

	/**
	 * Informar nome no cartão na tela de Pagamento
	 * @param nome
	 * @throws Exception
	 */
	public void informarNomeCartao(String nome) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@name = 'name_on_card']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@name = 'name_on_card']", nome);
	}

	/**
	 * Informar numero do cartão na tela de Pagamento
	 * @param numero
	 * @throws Exception
	 */
	public void informarNumeroCartao(String numero) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@name = 'card_number']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@name = 'card_number']", numero);
	}

	/**
	 * Informar cvc do cartão na tela de Pagamento
	 * @param cvc
	 * @throws Exception
	 */
	public void informarCVCCartao(String cvc) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@name = 'cvc']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@name = 'cvc']", cvc);
	}

	/**
	 * Informar mês de expiração do cartão na tela de Pagamento
	 * @param mesExp
	 * @throws Exception
	 */
	public void informarMesExpiracaoCartao(String mesExp) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@name = 'expiry_month']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@name = 'expiry_month']", mesExp);
	}

	/**
	 * Informar ano de expiração do cartão na tela de Pagamento
	 * @param anoExp
	 * @throws Exception
	 */
	public void informarAnoExpiracaoCartao(String anoExp) throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[@name = 'expiry_year']", Duration.ofSeconds(30));
		dsl.escrevePorXpath("//*[@name = 'expiry_year']", anoExp);
	}

	/**
	 * Clicar no botao 'Pay and Confirm Order' na tela de Pagamento
	 * @throws Exception
	 */
	public void clicarBotaoPagarEConfirmarPedido() throws Exception {
		dsl.visibilidadeElementoPorId("submit", Duration.ofSeconds(30));
		BaseTest.takeScreenshot("Dados de pagamento informados e confirmando a compra");
		dsl.clicarPorId("submit");
	}
}
