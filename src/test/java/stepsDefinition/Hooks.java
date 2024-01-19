package stepsDefinition;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.Reporter;
import core.BaseTest;
import core.DriverFactory;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;
import java.util.Collection;

public class Hooks {
	
	public static Collection<String> cenarioTag = null;
	ExtentReports extent = new ExtentReports();

	String carimbo_teste = BaseTest.getCarimboData("yyyyMMdd");
	String carimbo_dataHora = BaseTest.getCarimboData();

	@Before
	public void inicializa(Scenario cenario) throws Throwable {
		extent.setGherkinDialect("pt");
		cenarioTag = cenario.getSourceTagNames();

		System.setProperty("webdriver.gecko.driver", "resources/Driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "resources/Driver/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "resources/Driver/IEDriverServer.exe");

		BaseTest.testName = cenario.getName();
		BaseTest.execucao = carimbo_dataHora;
		System.out.println("nome da pasta da evidencia: " + carimbo_teste);
		BaseTest.caminho_evidencia = BaseTest
				.criaDiretorio(carimbo_teste + "/" + BaseTest.testName + "/" + BaseTest.execucao);
	}

	@After(order = 1)
	public void aposCenario(Scenario cenario) {
		if (cenario.isFailed()) {
			BaseTest.testName = cenario.getName();
			BaseTest.caminho_evidencia = BaseTest
					.criaDiretorio(carimbo_teste + "/" + BaseTest.testName + "/" + BaseTest.execucao) + "/erros";
			try {
				BaseTest.takeScreenshot("Failed");
				String diretorio = System.getProperty("user.dir");
				String caminhoEvidenciaErro = BaseTest.caminhoEvidenciaCompletoErros;
				caminhoEvidenciaErro = caminhoEvidenciaErro.replace('/', '\\');
				String caminhoEmbed = diretorio + "\\" + caminhoEvidenciaErro;
				Reporter.addScreenCaptureFromPath(caminhoEmbed);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	@After(order = 0)
	public void finalizaDriver() {
		DriverFactory.killDriver();
	}

}
