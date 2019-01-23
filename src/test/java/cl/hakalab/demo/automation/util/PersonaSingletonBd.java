package cl.hakalab.demo.automation.util;

import java.util.List;

public class PersonaSingletonBd {

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
	public String rut;
	public String estadoFono;
	public String tipoFono;
	public String estadoCliente;
	public String subEstadoCliente;
	public String marca;
	public String categoriaCliente;
	public String clasificacionRiesgo;
	public String tipoEvaluacion;
	public String canalIngreso;
	public String codigoEjecutivo;
	public String codigoSucursal;
	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getSubEstadoCliente() {
		return subEstadoCliente;
	}

	public void setSubEstadoCliente(String subEstadoCliente) {
		this.subEstadoCliente = subEstadoCliente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoriaCliente() {
		return categoriaCliente;
	}

	public void setCategoriaCliente(String categoriaCliente) {
		this.categoriaCliente = categoriaCliente;
	}

	public String getClasificacionRiesgo() {
		return clasificacionRiesgo;
	}

	public void setClasificacionRiesgo(String clasificacionRiesgo) {
		this.clasificacionRiesgo = clasificacionRiesgo;
	}

	public String getTipoEvaluacion() {
		return tipoEvaluacion;
	}

	public void setTipoEvaluacion(String tipoEvaluacion) {
		this.tipoEvaluacion = tipoEvaluacion;
	}

	public String getCanalIngreso() {
		return canalIngreso;
	}

	public void setCanalIngreso(String canalIngreso) {
		this.canalIngreso = canalIngreso;
	}

	public String getCodigoEjecutivo() {
		return codigoEjecutivo;
	}

	public void setCodigoEjecutivo(String codigoEjecutivo) {
		this.codigoEjecutivo = codigoEjecutivo;
	}

	public String getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getTipoFono() {
		return tipoFono;
	}

	public void setTipoFono(String tipoFono) {
		this.tipoFono = tipoFono;
	}

	private static PersonaSingletonBd instance = null;
	public String getTipoDeCliente() {
		return tipoDeCliente;
	}

	public String getEstadoFono() {
		return estadoFono;
	}

	public void setEstadoFono(String estadoFono) {
		this.estadoFono = estadoFono;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public static PersonaSingletonBd getInstance() {
		if (instance == null) {
			instance = new PersonaSingletonBd();
		}
		return instance;
	}

}
