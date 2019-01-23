package cl.hakalab.demo.automation.stage.set;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.sun.jna.platform.win32.OaIdl.DATE;

import cl.hakalab.demo.automation.dataProvider.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
//@621_normalizacionDeRut
//621_ValidacionDeRolesNormalizacionRutBF
//"@stepDemo,@featureService"
@CucumberOptions(tags = {"@demoHakalab"}, plugin = { "pretty:target/reportes/pretty/pretty.txt",
		"html:target/reportes/html", "json:target/reportes/json/report.json", "junit:target/reportes/junit/junit.xml",
		"usage:target/reportes/usage/usage.json", "rerun:target/reportes/rerun/rerun.txt",
		"com.cucumber.listener.ExtentCucumberFormatter:Reporte/ReporteDemo.html" })
//152.139.28.77/ResultadosSeleniumTest/
public class DemoStageset extends StageSet {
	
	
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(ConfigFileReader.getInstance().getReportConfigPath()));

	}
}
