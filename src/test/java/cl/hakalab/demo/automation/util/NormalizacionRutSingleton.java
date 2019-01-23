package cl.hakalab.demo.automation.util;

public class NormalizacionRutSingleton {
	public String RutAntiguo;
	public String RutNuevo;
	public String Definitivo;
	public String Resultado;
	public String Accion;
	public String UsuarioSistema;
	public String FechayHora;

	private static NormalizacionRutSingleton instance = null;

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

	public static void setInstance(NormalizacionRutSingleton instance) {
		NormalizacionRutSingleton.instance = instance;
	}

	public static NormalizacionRutSingleton getInstance() {
		if (instance == null) {
			instance = new NormalizacionRutSingleton();
		}
		return instance;
	}

}
