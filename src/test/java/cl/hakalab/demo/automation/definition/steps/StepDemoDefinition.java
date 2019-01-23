package cl.hakalab.demo.automation.definition.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

import org.assertj.core.api.AssertDelegateTarget;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;

import cl.hakalab.demo.automation.business.flow.BaseFlow;
import cl.hakalab.demo.automation.conn.json.CommJson;
import cl.hakalab.demo.automation.util.GenericMethods;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDemoDefinition {
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
	@Given("^inicio sesion en salesforce \"(.*?)\"\"(.*?)\"\"(.*?)\"$")
	public void inicio_sesion_en_salesforce(String url, String user, String pass) throws Throwable {

	BaseFlow.driver.get(url);
	 BaseFlow.driver.findElement(By.id("username")).sendKeys(user);
	 BaseFlow.driver.findElement(By.id("password")).sendKeys(pass);
	 BaseFlow.driver.findElement(By.id("Login")).click();
Thread.sleep(30000);
	
	}
		

	@When("^selecciono menu cuentas$")
	public void selecciono_menu_cuentas() throws Throwable {
	    BaseFlow.driver.findElement(By.id("Account_Tab")).click();
	}

	@When("^selecciono dentro de menu desplegable todas las cuentas$")
	public void selecciono_dentro_de_menu_desplegable_todas_las_cuentas() throws Throwable {
		Select selectCuenta = new Select (BaseFlow.driver.findElement(By.id("fcf")));
		selectCuenta.selectByVisibleText("Todas Las cuentas");		
	}

	@When("^doy click en boton ir pra verificar cuentas$")
	public void doy_click_en_boton_ir_pra_verificar_cuentas() throws Throwable {
	   BaseFlow.driver.findElement(By.name("go")).click();
	}
String nombre ;
	@When("^copio nombre de cliente de la lista$")
	public void copio_nombre_de_cliente_de_la_lista() throws Throwable {
	nombre= BaseFlow.driver.findElement(By.xpath("//*[@id=\"0010n00000vz2ER_ACCOUNT_NAME\"]/a/span")).getText();
	}

	@When("^ingreso nombre de cliente en barra de busqueda$")
	public void ingreso_nombre_de_cliente_en_barra_de_busqueda() throws Throwable {
	  BaseFlow.driver.findElement(By.id("phSearchInput")).sendKeys(nombre);
	  BaseFlow.driver.findElement(By.id("phSearchButton")).click();
	}

	@When("^selecciono cliente para continuar la solicitud$")
	public void selecciono_cliente_para_continuar_la_solicitud() throws Throwable {
	  BaseFlow.driver.findElement(By.xpath("//*[@id=\"Account_body\"]/table/tbody/tr[2]/th/a")).click();
	}

	@When("^creo nuevo caso para cliente selccionado$")
	public void creo_nuevo_caso_para_cliente_selccionado() throws Throwable {
	 GenericMethods.scrollClickElement(BaseFlow.driver, BaseFlow.driver.findElement(By.name("newCase")));
	}

	@When("^selecciono tipo de registro\"(.*?)\"$")
	public void selecciono_tipo_de_registro(String arg1) throws Throwable {
		Select reg = new Select (BaseFlow.driver.findElement(By.id("p3")));
		reg.selectByVisibleText(arg1);	
	}

	@When("^doy click en continuar con caso$")
	public void doy_click_en_continuar_con_caso() throws Throwable {
	   BaseFlow.driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
	}

	@When("^selcciono tipo de solicitante\"(.*?)\"$")
	public void selcciono_tipo_de_solicitante(String arg1) throws Throwable {
		Select reg = new Select (BaseFlow.driver.findElement(By.id("00Ni000000GI5HD")));
		reg.selectByVisibleText(arg1);	
	}

	@When("^selcciono canal\"(.*?)\"$")
	public void selcciono_canal(String arg1) throws Throwable {
		Select reg = new Select (BaseFlow.driver.findElement(By.id("00Ni000000GI5G8")));
		reg.selectByVisibleText(arg1);	
		
	}

	@When("^selecciono negocio\"(.*?)\"$")
	public void selecciono_negocio(String arg1) throws Throwable {
		Select reg = new Select (BaseFlow.driver.findElement(By.id("00Ni000000GI5Gq")));
		reg.selectByVisibleText(arg1);
	}

	@When("^selecciono guardar caso$")
	public void selecciono_guardar_caso() throws Throwable {
		 GenericMethods.scrollClickElement(BaseFlow.driver, BaseFlow.driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")));
	}

	@Then("^valido que se crea caso de acuerdo a parametros ingresados$")
	public void valido_que_se_crea_caso_de_acuerdo_a_parametros_ingresados() throws Throwable {
	  assertFalse("no se visualiza caso creado",BaseFlow.driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]")).isDisplayed());
	
	}



}
