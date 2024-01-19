package core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.DriverFactory.getDriver;

public class DSL {

	public void escrevePorId(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void escrevePorXpath(String xpath_campo, String texto) {
		getDriver().findElement(By.xpath(xpath_campo)).sendKeys(texto);
	}

	public String obterValorCampoPorId(String id_campo) {

		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	public String obterValorCampoPorXpath(String xpath_campo) {

		return getDriver().findElement(By.xpath(xpath_campo)).getAttribute("value");
	}

	public String obterTextoPorXpath(String xpath_campo) {

		return getDriver().findElement(By.xpath(xpath_campo)).getText();
	}

	public void clicarPorId(String id_campo) {
		getDriver().findElement(By.id(id_campo)).click();
	}

	public void clicarPorXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	/**
	 * Acessar iframe pelo index
	 * @param index
	 */
	public void acessarIframePorIndex(int index) {
		getDriver().switchTo().frame(index);
	}

	/**
	 *
	 * @param id
	 * @param tempo
	 */
	public void acessarIframePorId(String id, Duration tempo) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}

	/*
	 * Abrir URL
	 * 
	 * variables String url
	 */
	public void abrirUrl(String url) {
		getDriver().get(url);
	}

	public void selecionarComboPorXpath(String xpath_campo, String texto_combo) {
		Select combo = new Select(getDriver().findElement(By.xpath(xpath_campo)));
		combo.selectByVisibleText(texto_combo);
	}

	public void selecionarComboPorId(String xpath_campo, String texto_combo) {
		Select combo = new Select(getDriver().findElement(By.id(xpath_campo)));
		combo.selectByVisibleText(texto_combo);
	}

	/**
	 * Verificar se elemento é exibido na tela.
	 * 
	 * @param xpath
	 * @return
	 */
	public boolean verificarSeElementoEstaPresenteXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).isDisplayed();
	}

	public void mouseOver(String xpath) {
		Actions acao = new Actions(getDriver());
		WebElement moverMouse = getDriver().findElement(By.xpath(xpath));
		acao.moveToElement(moverMouse).perform();
		// acao.perform();
	}

	public void limparCampoPorXpath(String xpath_campo) {
		getDriver().findElement(By.xpath(xpath_campo)).clear();
	}

	public String obterAtributoElementoPorXpath(String xpath_campo, String atributo) {
		return getDriver().findElement(By.xpath(xpath_campo)).getAttribute(atributo);
	}

	public void visibilidadeElementoPorXpath(String xpath, Duration tempo) {
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), tempo))
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xpath))));
		System.out.println(myDynamicElement);
	}

	public void selecionarPorIndexComboPorId(String id_campo, int index) {
		Select combo = new Select(getDriver().findElement(By.id(id_campo)));
		combo.selectByIndex(index);
	}

	public void acceptAlertPopup() throws InterruptedException {
		Alert alerta = getDriver().switchTo().alert();
		alerta.accept();
	}

	public String obterTextoPorId(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getText();
	}

	public void visibilidadeElementoPorId(String id, Duration tempo) {
		WebElement myDynamicElement = (new WebDriverWait(getDriver(), tempo))
				.until(ExpectedConditions.visibilityOfElementLocated((By.id(id))));
		System.out.println(myDynamicElement);
	}

	public void limparCampoPorId(String id_campo) {
		getDriver().findElement(By.id(id_campo)).clear();
	}

	public void pressionaTeclaPAGE_DOWN() {
		Actions acao = new Actions(getDriver());
		acao.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
}
