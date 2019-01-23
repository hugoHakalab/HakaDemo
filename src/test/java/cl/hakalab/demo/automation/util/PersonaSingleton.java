package cl.hakalab.demo.automation.util;

public class PersonaSingleton {


	public String Rut;
	public String tipoDeCliente;
	public String nombres;
	public String apellidoMaterno;
	public String apellidoPaterno;
	public String estadoCivil;
	public String telefonoFijo;
	public String telefonoMovil;
	public String extranjero;
	public String correo;
	public String tipoDireccion;
	public String direccion;
	public String comuna;
	public String region;
	public String ciudad;
	public String numero;
	public String complentoDireccion;

	static PersonaSingleton instance = null;
	public String getTipoDeCliente() {
		return tipoDeCliente;
	}	
	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}


	public void setTipoDeCliente(String tipoDeCliente) {
		this.tipoDeCliente = tipoDeCliente;
	}
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getExtranjero() {
		return extranjero;
	}

	public void setExtranjero(String extranjero) {
		this.extranjero = extranjero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplentoDireccion() {
		return complentoDireccion;
	}

	public void setComplentoDireccion(String complentoDireccion) {
		this.complentoDireccion = complentoDireccion;
	}

	public static void setInstance(PersonaSingleton instance) {
		PersonaSingleton.instance = instance;
	}

	public static PersonaSingleton getInstance() {
		if (instance == null) {
			instance = new PersonaSingleton();
		}
		return instance;
	}

}
