package pages;

import core.BasePage;
import core.BaseTest;

import java.time.Duration;

public class TelaPedidoConfirmadoPage extends BasePage {

	/**
	 * Obter mensagem de pedido confirmado
	 * @return
	 * @throws Exception
	 */
	public String getMensagemPedidoConfirmado() throws Exception {
		dsl.visibilidadeElementoPorXpath("//*[text() = 'Congratulations! Your order has been confirmed!']", Duration.ofSeconds(15));

        return dsl.obterTextoPorXpath("//*[text() = 'Congratulations! Your order has been confirmed!']");
	}
}
