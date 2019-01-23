package cl.hakalab.demo.automation.definition.steps;

import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.hakalab.demo.automation.util.GenericMethods;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServiceDemoDefinition {
	String msg;
	private static final Logger LOGGER = LoggerFactory.getLogger("");
	@cucumber.api.java.Before
	public void escribirLog(Scenario scenario) {
		LOGGER.info("Inicio de escenario : "+scenario.getName());
	}
	
	@After
	public void escribirLogFin(Scenario scenario) throws Exception {
		LOGGER.info("Estado del escenario: " +scenario.getStatus());
		GenericMethods.screenShotForScenarioFailed(scenario);
		 }
	@When("^realizo llamada al servicio con rut solicitado \"(.*?)\"$")
	public void realizo_llamada_al_servicio_con_rut_solicitado(String rut) throws Throwable {
		GenericMethods gg=new GenericMethods();
		msg=gg.getWeather(rut);
	}

	@Then("^valido respuesta correcta$")
	public void valido_respuesta_correcta() throws Throwable {
	 assertEquals("no se logra realizar una consulta de manera correcta","Acceso válido.", msg);
	}
}
