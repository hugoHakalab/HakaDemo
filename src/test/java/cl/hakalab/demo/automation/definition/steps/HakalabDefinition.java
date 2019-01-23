package cl.hakalab.demo.automation.definition.steps;

import static org.junit.Assert.assertTrue;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cl.hakalab.demo.automation.business.flow.BaseFlow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HakalabDefinition {
	@Given("^Me encuentro en Google\\.com \"(.*?)\"$")
	public void me_encuentro_en_Google_com(String arg1) throws Throwable {
	   BaseFlow.driver.get(arg1);
	}

	@When("^Ingreso \"(.*?)\" en barra de busqueda$")
	public void ingreso_en_barra_de_busqueda(String arg1) throws Throwable {
		BaseFlow.driver.findElement(By.name("q")).clear();
	   BaseFlow.driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@When("^doy click en boton buscar$")
	public void doy_click_en_boton_buscar() throws Throwable {
		BaseFlow.driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@When("^selecciono primera opcion desplegada en la lista$")
	public void selecciono_primera_opcion_desplegada_en_la_lista() throws Throwable {
	java.util.List<WebElement> ele=BaseFlow.driver.findElement(By.id("rso")).findElements(By.tagName("h3"));
	for (WebElement elem:ele) {
		if (elem.getText().equals("Haka Lab")) {
			elem.click();
			break;
		}
	}
	}

	@Then("^valido que me encuentro en Hakalab\\.com$")
	public void valido_que_me_encuentro_en_Hakalab_com() throws Throwable {
	    assertTrue("no se valida ingreso a pagina solicitada",BaseFlow.driver.findElement(By.xpath("//*[@id=\"f_a7eefaef-c78a-4fe1-925d-f515062961c4\"]/div[2]/div/div[2]/div/ul/li[1]/div/a")).isDisplayed());
	}


}
