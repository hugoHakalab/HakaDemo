package cl.hakalab.demo.automation.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectModelDemo {

	@FindBy(how = How.XPATH, using = "//*[@id=\"mainMenu\"]/li[3]/a")
	private WebElement botonCredito;
	@FindBy(how = How.XPATH, using = "//*[@id=\"siteContent\"]/div/div/section[4]/div/a")
	private WebElement botonCtaCorriente;
	@FindBy(how = How.XPATH, using = "//*[@id=\"siteContent\"]/div/div/div[2]/div/a")
	private WebElement botonSerCliente;
	@FindBy(how = How.ID, using = "ingreso_nombre_input")
	private WebElement inputNombre;
	@FindBy(how = How.ID, using = "ingreso_rut_input")
	private WebElement inputRut;
	@FindBy(how = How.ID, using = "ingreso_fecha_dia_input")
	private WebElement inputDia;
	@FindBy(how = How.ID, using = "ingreso_fecha_mes_input")
	private WebElement inputMes;
	@FindBy(how = How.ID, using = "ingreso_fecha_ano_input")
	private WebElement inputAno;
	@FindBy(how = How.ID, using = "ingreso_telefono_input")
	private WebElement inputFono;
	@FindBy(how = How.ID, using = "ingreso_mail_input")
	private WebElement email;
	@FindBy(how = How.ID, using = "continuar_paso_2")
	private WebElement btnContinuar;
	@FindBy(how = How.ID, using = "datos_contacto_texto")
	private WebElement tituloPaso2;
	
	public WebElement getTituloPaso2() {
		return tituloPaso2;
	}
	public void setTituloPaso2(WebElement tituloPaso2) {
		this.tituloPaso2 = tituloPaso2;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getBotonCredito() {
		return botonCredito;
	}
	public void setBotonCredito(WebElement botonCredito) {
		this.botonCredito = botonCredito;
	}
	public WebElement getBotonCtaCorriente() {
		return botonCtaCorriente;
	}
	public void setBotonCtaCorriente(WebElement botonCtaCorriente) {
		this.botonCtaCorriente = botonCtaCorriente;
	}
	public WebElement getBotonSerCliente() {
		return botonSerCliente;
	}
	public void setBotonSerCliente(WebElement botonSerCliente) {
		this.botonSerCliente = botonSerCliente;
	}
	public WebElement getInputNombre() {
		return inputNombre;
	}
	public void setInputNombre(WebElement inputNombre) {
		this.inputNombre = inputNombre;
	}
	public WebElement getInputRut() {
		return inputRut;
	}
	public void setInputRut(WebElement inputRut) {
		this.inputRut = inputRut;
	}
	public WebElement getInputDia() {
		return inputDia;
	}
	public void setInputDia(WebElement inputDia) {
		this.inputDia = inputDia;
	}
	public WebElement getInputMes() {
		return inputMes;
	}
	public void setInputMes(WebElement inputMes) {
		this.inputMes = inputMes;
	}
	public WebElement getInputAno() {
		return inputAno;
	}
	public void setInputAno(WebElement inputAno) {
		this.inputAno = inputAno;
	}
	public WebElement getInputFono() {
		return inputFono;
	}
	public void setInputFono(WebElement inputFono) {
		this.inputFono = inputFono;
	}
	
	public WebElement getBtnContinuar() {
		return btnContinuar;
	}
	public void setBtnContinuar(WebElement btnContinuar) {
		this.btnContinuar = btnContinuar;
	}
	
	
}