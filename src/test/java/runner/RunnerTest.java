package runner;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import managers.FileReaderManager;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(	monochrome = true,
					dryRun = false,
					features = { "src/test/resources/features" },
					glue = { "stepsDefinition" },
					plugin = { 
								"html:target/cucumber-reports",
								"json:target/cucumber.json",
//								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/report.html"
							},
					tags = "@CT01"
				)

public class RunnerTest {

//	@AfterClass
//	public static void escreveExtentReport() throws Exception {
//		Reporter.loadXMLConfig(FileReaderManager.getInstance().getConfigReader().getReportConfigPath());
//	}
}

