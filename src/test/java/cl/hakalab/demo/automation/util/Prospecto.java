package cl.hakalab.demo.automation.util;

public class Prospecto {

	public void guardarProspectoSingleton(String tipoCliente, String nombres, String apellidoPaterno,
			String apellidoMaterno, String extranjero, String estadoCivil, String telefonoFijo, String telefonoMovil,
			String correo, String tipoDireccion, String direccion, String numero, String complemento, String region,
			String ciudad, String comuna) {

		PersonaSingleton personaSingleton = new PersonaSingleton();
		personaSingleton.setTipoDeCliente(tipoCliente);
		personaSingleton.setNombres(nombres);
		personaSingleton.setApellidoPaterno(apellidoPaterno);
		personaSingleton.setApellidoMaterno(apellidoMaterno);
		personaSingleton.setExtranjero(extranjero);
		personaSingleton.setEstadoCivil(estadoCivil);
		personaSingleton.setTelefonoFijo(telefonoFijo);
		personaSingleton.setTelefonoMovil(telefonoMovil);
		personaSingleton.setCorreo(correo);
		personaSingleton.setTipoDireccion(tipoDireccion);
		personaSingleton.setDireccion(direccion);
		personaSingleton.setNumero(numero);
		personaSingleton.setComplentoDireccion(complemento);
		personaSingleton.setComuna(comuna);
		personaSingleton.setRegion(region);
		personaSingleton.setCiudad(ciudad);
	}

}
