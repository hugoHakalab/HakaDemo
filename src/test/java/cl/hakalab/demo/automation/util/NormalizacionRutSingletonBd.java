package cl.hakalab.demo.automation.util;

public class NormalizacionRutSingletonBd {

	public String RutAntiguo;
	public String RutNuevo;
	public String RutDefinitivo;

	public String getRutDefinitivo() {
		return RutDefinitivo;
	}

	public void setRutDefinitivo(String rutDefinitivo) {
		RutDefinitivo = rutDefinitivo;
	}

	public String Definitivo;
	public String Resultado;
	public String Accion;
	public String UsuarioSistema;
	public String FechayHora;
	static NormalizacionRutSingletonBd instance = null;

	public String getResultado() {
		return Resultado;
	}

	public void setResultado(String resultado) {
		Resultado = resultado;
	}

	public String getAccion() {
		return Accion;
	}

	public void setAccion(String accion) {
		Accion = accion;
	}

	public String getUsuarioSistema() {
		return UsuarioSistema;
	}

	public void setUsuarioSistema(String usuarioSistema) {
		UsuarioSistema = usuarioSistema;
	}

	public String getFechayHora() {
		return FechayHora;
	}

	public void setFechayHora(String fechayHora) {
		FechayHora = fechayHora;
	}

	public String getRutAntiguo() {
		return RutAntiguo;
	}

	public void setRutAntiguo(String rutAntiguo) {
		RutAntiguo = rutAntiguo;
	}

	public String getRutNuevo() {
		return RutNuevo;
	}

	public void setRutNuevo(String rutNuevo) {
		RutNuevo = rutNuevo;
	}

	public String getDefinitivo() {
		return Definitivo;
	}

	public void setDefinitivo(String definitivo) {
		Definitivo = definitivo;
	}
	public static void setInstance(NormalizacionRutSingletonBd instance) {
		NormalizacionRutSingletonBd.instance = instance;
	}

	public static NormalizacionRutSingletonBd getInstance() {
		if (instance == null) {
			instance = new NormalizacionRutSingletonBd();
		}
		return instance;
	}

}
