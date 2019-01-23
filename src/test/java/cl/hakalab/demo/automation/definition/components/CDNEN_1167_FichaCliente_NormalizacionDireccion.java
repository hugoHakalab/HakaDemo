package cl.hakalab.demo.automation.definition.components;

import static org.junit.Assert.assertTrue;

import java.sql.Driver;

import javax.lang.model.element.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cl.hakalab.demo.automation.business.flow.BaseFlow;
import cl.hakalab.demo.automation.util.BussinesUtil;
import cl.hakalab.demo.automation.util.FuncionRut;
import cl.hakalab.demo.automation.util.GenericMethods;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CDNEN_1167_FichaCliente_NormalizacionDireccion {
	@After
	public static void tearDown(Scenario scenario) throws Exception {
		GenericMethods.screenShotForScenarioFailed(scenario);
	}

//	private static final Logger LOGGER = LoggerFactory.getLogger("");
//	@cucumber.api.java.Before
//	public void escribirLog(Scenario scenario) {
//		LOGGER.info("Inicio de escenario : "+scenario.getName());
//	}
//	
//	@After
//	public void escribirLogFin(Scenario scenario) throws Exception {
//		LOGGER.info("Estado del escenario: " +scenario.getStatus());
//		GenericMethods.screenShotForScenarioFailed(scenario);
//		 
//	 
//	}
	
}
