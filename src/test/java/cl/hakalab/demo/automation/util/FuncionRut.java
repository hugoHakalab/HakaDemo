package cl.hakalab.demo.automation.util;

import cl.hakalab.demo.automation.conn.dao.dao;

public class FuncionRut {

	public static String generarNuevoRut() {
		long numAleatorio = Math.round(Math.random() * (25000000 - 5000000)) + 5000000;
		String rutDv = numAleatorio + "-" + getDv(String.valueOf(numAleatorio));
		return rutDv;
	}

	public static boolean validarRut(String vrut, String vverificador) {
		boolean flag = false;
		String rut = vrut.trim();

		String posibleVerificador = vverificador.trim();
		int cantidad = rut.length();
		int factor = 2;
		int suma = 0;
		String verificador = "";

		for (int i = cantidad; i > 0; i--) {
			if (factor > 7) {
				factor = 2;
			}
			suma += (Integer.parseInt(rut.substring((i - 1), i))) * factor;
			factor++;

		}
		verificador = String.valueOf(11 - suma % 11);
		if (verificador.equals(posibleVerificador)) {
			flag = true;
		} else {
			if ((verificador.equals("10")) && (posibleVerificador.toLowerCase().equals("k"))) {
				flag = true;
			} else {
				if ((verificador.equals("11") && posibleVerificador.equals("0"))) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

	public static String getDv(String vrut) {

		String rut = vrut.trim();
		int cantidad = rut.length();
		int factor = 2;
		int suma = 0;
		String verificador = "";
		for (int i = cantidad; i > 0; i--) {
			if (factor > 7) {
				factor = 2;
			}
			suma += (Integer.parseInt(rut.substring((i - 1), i))) * factor;
			factor++;

		}
		verificador = String.valueOf(11 - suma % 11);
		if (verificador.equals("11")) {
			verificador = "0";
		} else if (verificador.equals("10")) {
			verificador = "K";
		}

		return verificador;
	}

	public static String getProspectoCliente() {
		String nuevoRut = "";
		 
		  while (true) {   
			  nuevoRut = generarNuevoRut();
			if (dao.getIsCliente(nuevoRut))
				break;
		}

		return nuevoRut;

	}
}
