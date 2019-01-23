package cl.hakalab.demo.automation.util;

import java.util.List;
import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cl.hakalab.demo.automation.business.flow.BaseFlow;
import cl.hakalab.demo.automation.util.PersonaSingletonBd;;

public final class BussinesUtil {

	public static void seleccionEstadoCivil(String estado) {
		GenericMethods.scrollElement(BaseFlow.driver, BaseFlow.driver.findElement(By.name("estadosCiviles")));
		if (estado.equals("")) {
			estado = "Sin Informacion";
		}
		BaseFlow.driver.findElement(By.name("estadosCiviles")).click();
		List<WebElement> element = BaseFlow.driver.findElement(By.name("estadosCiviles"))
				.findElements(By.className("ui-select-choices-row"));
		for (WebElement ele : element) {

			if (ele.findElement(By.tagName("span")).getText().trim().equals(estado)) {
				ele.click();
				break;
			}

		}

	}

	public static void seleccionRegion(String region) {
		GenericMethods.scrollElement(BaseFlow.driver, BaseFlow.driver.findElement(By.name("regiones")));
		if (region.equals("")) {
			region = "Seleccione...";
		}

		BaseFlow.driver.findElement(By.name("regiones")).click();
		List<WebElement> element = BaseFlow.driver.findElement(By.name("regiones"))
				.findElements(By.className("ui-select-choices-row-inner"));
		for (WebElement ele : element) {

			if (ele.findElement(By.tagName("span")).getText().trim().equals(region)) {
				ele.click();
				break;
			}

		}

	}

	public static void seleccionRegionNormalizaDireccion(String region) {
		GenericMethods.scrollElement(BaseFlow.driver,
				BaseFlow.driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/fieldset/section")));
		if (region.equals("")) {
			region = "Seleccione...";
		}

		BaseFlow.driver.findElement(By.name("region")).click();
		List<WebElement> element = BaseFlow.driver.findElement(By.name("region"))
				.findElements(By.className("ui-select-choices-row-inner"));
		for (WebElement ele : element) {

			if (ele.findElement(By.tagName("span")).getText().trim().equals(region)) {
				ele.click();
				break;
			}

		}

	}

	public static void seleccionCiudad(String ciudad) {
		GenericMethods.scrollElement(BaseFlow.driver, BaseFlow.driver.findElement(By.name("ciudades")));
		if (ciudad.equals("")) {
			ciudad = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("ciudades")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("ciudades")).click();

			List<WebElement> element = BaseFlow.driver.findElement(By.name("ciudades"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(ciudad)) {
					ele.click();
					break;
				}
			}
		}
	}

	public static void seleccionCiudadNormalizaDireccion(String ciudad) {
		GenericMethods.scrollElement(BaseFlow.driver,
				BaseFlow.driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/fieldset/section")));
		if (ciudad.equals("")) {
			ciudad = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("ciudad")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("ciudad")).click();

			List<WebElement> element = BaseFlow.driver.findElement(By.name("ciudad"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(ciudad)) {
					ele.click();
					break;
				}
			}
		}
	}

	public static void seleccionComuna(String comuna) {
		GenericMethods.scrollElement(BaseFlow.driver, BaseFlow.driver.findElement(By.name("comunas")));
		if (comuna.equals("")) {
			comuna = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("comunas")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("comunas")).click();
			List<WebElement> element = BaseFlow.driver.findElement(By.name("comunas"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(comuna)) {
					ele.click();
					break;
				}

			}
		}
	}

	public static void seleccionComunaNormalizaDireccion(String comuna) {
		GenericMethods.scrollElement(BaseFlow.driver,
				BaseFlow.driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/fieldset/section")));
		if (comuna.equals("")) {
			comuna = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("comuna")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("comuna")).click();
			List<WebElement> element = BaseFlow.driver.findElement(By.name("comuna"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(comuna)) {
					ele.click();
					break;
				}

			}
		}
	}

	public static void seleccionTipoDireccion(String TipoDireccion) {

		GenericMethods.scrollElement(BaseFlow.driver, BaseFlow.driver.findElement(By.name("direccionTipo")));

		if (TipoDireccion.equals("")) {
			TipoDireccion = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("direccionTipo")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("direccionTipo")).click();
			List<WebElement> element = BaseFlow.driver.findElement(By.name("direccionTipo"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(TipoDireccion)) {
					ele.click();
					break;
				}

			}
		}

	}

	public static void seleccionTipoDireccionNormalizacionDireccion(String TipoDireccion) {
		GenericMethods.scrollElement(BaseFlow.driver,
				BaseFlow.driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/fieldset/section")));
		GenericMethods.esperaElementoSegundos(BaseFlow.driver, BaseFlow.driver.findElement(By.name("tipo")), 5);

		if (TipoDireccion.equals("")) {
			TipoDireccion = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("tipo")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("tipo")).click();
			List<WebElement> element = BaseFlow.driver.findElement(By.name("tipo"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(TipoDireccion)) {
					ele.click();
					break;
				}

			}
		}
	}

	public static void seleccionTipoDespacho(String TipoDespacho) {

		GenericMethods.scrollElement(BaseFlow.driver,
				BaseFlow.driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/fieldset/section")));
		GenericMethods.esperaElementoSegundos(BaseFlow.driver, BaseFlow.driver.findElement(By.name("despacho")), 5);

		if (TipoDespacho.equals("")) {
			TipoDespacho = "Seleccione...";
		}
		if (BaseFlow.driver.findElement(By.name("despacho")).isEnabled()) {

			BaseFlow.driver.findElement(By.name("despacho")).click();
			List<WebElement> element = BaseFlow.driver.findElement(By.name("despacho"))
					.findElements(By.className("ui-select-choices-row-inner"));
			for (WebElement ele : element) {

				if (ele.findElement(By.tagName("span")).getText().trim().equals(TipoDespacho)) {
					ele.click();
					break;
				}

			}
		}
	}

	public static void setPersonaJournal(String clienteJson) throws JSONException {
		String NumeroTelefono = "";

		PersonaSingletonBd personBD = PersonaSingletonBd.getInstance();
		JSONObject myObject = new JSONObject(clienteJson);
		personBD.setTipoDeCliente(myObject.getString("tipoCliente"));
		personBD.setNombres(myObject.getString("nombre"));
		personBD.setRut(myObject.getString("rutCliente"));
		personBD.setEstadoCivil(myObject.getString("estadoCivil"));
		personBD.setApellidoPaterno(myObject.getString("apellidoPaterno"));
		personBD.setApellidoMaterno(myObject.getString("apellidoMaterno"));
		personBD.setApellidoMaterno(myObject.getString("apellidoMaterno"));
		JSONArray lineItems = myObject.getJSONArray("telefonoList");
		for (int i = 0; i < lineItems.length(); ++i) {
			JSONObject rec = lineItems.getJSONObject(i);
			NumeroTelefono = NumeroTelefono + rec.getString("numeroTelefono");
		}
		personBD.setTelefonoFijo(NumeroTelefono);
		JSONArray lineItemsMail = myObject.getJSONArray("emailList");
		for (int i = 0; i < lineItemsMail.length(); ++i) {
			JSONObject rec = lineItemsMail.getJSONObject(i);
			personBD.setCorreo(rec.getString("direcionEmail"));
		}
		JSONArray lineItemsDireccion = myObject.getJSONArray("direccionList");
		for (int i = 0; i < lineItemsDireccion.length(); ++i) {
			JSONObject rec = lineItemsDireccion.getJSONObject(i);
			personBD.setTipoDireccion(rec.getString("tipoDireccion"));
			personBD.setDireccion(rec.getString("calle"));
			personBD.setNumero(rec.getString("numero"));
			personBD.setRegion(rec.getString("region"));
			personBD.setComuna(rec.getString("comuna"));
			personBD.setCiudad(rec.getString("ciudad"));

		}
		/*
		 * personBD.setEstadoCliente(myObject.getJSONObject(
		 * "clasificacionCorporativaList").getString("estado"));
		 * personBD.setSubEstadoCliente(myObject.getJSONObject(
		 * "clasificacionCorporativaList").getString("subEstado"));
		 * personBD.setMarca(myObject.getJSONObject("clasificacionCorporativaList").
		 * getString("marca")); personBD.setCategoriaCliente(
		 * myObject.getJSONObject("clasificacionCorporativaList").getString(
		 * "categoriaCliente")); personBD.setClasificacionRiesgo(
		 * myObject.getJSONObject("clasificacionCorporativaList").getString(
		 * "clasificacionRiesgo")); personBD.setTipoEvaluacion(myObject.getJSONObject(
		 * "clasificacionCorporativaList").getString("tipoEvaluacion"));
		 * personBD.setCanalIngreso(myObject.getJSONObject(
		 * "clasificacionCorporativaList").getString("canalIngreso"));
		 * personBD.setCodigoEjecutivo(
		 * myObject.getJSONObject("clasificacionCorporativaList").getString(
		 * "codigoEjecutivo")); personBD.setCodigoSucursal(myObject.getJSONObject(
		 * "clasificacionCorporativaList").getString("codigoSucursal"));
		 */
	}

	public static void setRutJournal(List<String> Journal) throws JSONException {

		String rutJson = Journal.get(3);
		NormalizacionRutSingletonBd rutBD = NormalizacionRutSingletonBd.getInstance();
		JSONObject myObject = new JSONObject(rutJson);
		rutBD.setRutAntiguo(myObject.getJSONObject("response").getJSONObject("body").getString("rutClienteActual"));
		rutBD.setRutNuevo(myObject.getJSONObject("response").getJSONObject("body").getString("rutClienteNuevo"));
		rutBD.setDefinitivo(myObject.getJSONObject("response").getJSONObject("body").getString("flagRutDefinitivo"));
		// System.out.println(myObject.getJSONObject("response").getJSONObject("body").getString("rutClienteActual"));

//		for (int i = 0; i < lineItemsargumentos.length(); ++i) {
//			JSONObject arg = lineItemsargumentos.getJSONObject(i);
//			JSONArray lineItemsResponse = arg.getJSONArray("response");
//			for (int c = 0; c < lineItemsResponse.length(); ++c) {
//				JSONArray lineItemsBody = myObject.getJSONArray("body");
//				for (int d = 0; d< lineItemsBody.length(); ++d) {
//					JSONObject rec = lineItemsBody.getJSONObject(i);
//				rutBD.setRutAntiguo(rec.getString("rutClienteActual"));
//				rutBD.setRutNuevo(rec.getString("rutClienteNuevo"));
//				rutBD.setDefinitivo(rec.getString("flagRutDefinitivo"));
//				}
//			}
//		}
		rutBD.setUsuarioSistema(Journal.get(1));
		rutBD.setFechayHora(Journal.get(4));

	}

	public static boolean getStatusWithDiv(String Status, String Xpath) {
		boolean devuelve = true;
		List<WebElement> element = BaseFlow.driver.findElement(By.xpath(Xpath)).findElements(By.tagName("input"));

		for (WebElement ele : element) {

			if (String.valueOf(ele.isEnabled()).equals(Status))
				devuelve = false;
		}
		List<WebElement> elementCombo = BaseFlow.driver.findElement(By.xpath(Xpath))
				.findElements(By.className("ui-select-match"));
		for (WebElement ele : elementCombo) {
			if (String.valueOf(ele.isEnabled()).equals(Status))
				devuelve = false;
		}

		List<WebElement> elementboton = BaseFlow.driver.findElement(By.xpath(Xpath))
				.findElements(By.className("button"));
		for (WebElement ele : elementboton) {
			if (String.valueOf(ele.isEnabled()).equals(Status))
				devuelve = false;
		}

		return devuelve;
	}

	public static boolean GetPermisoNormalizacionRutNoDefin(String rolUsuario) {

		boolean isPermiso = true;
		WebElement ElementRut = BaseFlow.driver.findElement(By
				.xpath("/html/body/div[1]/div[2]/section/section/div[2]/div/section/div/div/form/div[1]/div[2]/input"));
		WebElement ElementCheck = BaseFlow.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/section/section/div[2]/div/section/div/div/form/div[1]/div[3]/label[2]/div/input"));

		switch (rolUsuario) {
		case "":
			if (BaseFlow.driver.findElement(By.name("mensajeSinPermiso")).isEnabled())
				isPermiso = true;

			break;
		case "CONSULTAR_FCPINFBASNRUT":
			String atributoRut = ElementRut.getAttribute("disabled").trim();
			String atributoCheck = ElementRut.getAttribute("disabled").trim();

			if (!atributoRut.equals("true"))
				isPermiso = false;
			if (!atributoCheck.equals("true"))
				isPermiso = false;

			break;
		case "INGRESAR_FCPINFBASNRUT":
			if (ElementRut.getAttribute("disabled") == "true")
				isPermiso = false;

			if (ElementCheck.getAttribute("disabled") == "true")
				isPermiso = false;

			break;
		case "EDITAR_FCPINFBASNRUT":
			if (ElementRut.getAttribute("disabled") == "true")

				isPermiso = false;
			if (ElementCheck.getAttribute("disabled") == "true")

				isPermiso = false;
			break;
		case "INGRESAR_FCPINFBASRUTDEF":
			if (ElementRut.getAttribute("disabled") == "true")

				isPermiso = false;
			if (ElementCheck.getAttribute("disabled") == "true")

				isPermiso = false;
			break;
		case "EDITAR_FCPINFBASRUTDEF":
			if (ElementRut.getAttribute("disabled") == "true")

				isPermiso = false;
			if (ElementCheck.getAttribute("disabled") == "true")

				isPermiso = false;
			break;

		}

		return isPermiso;
	}

	public static boolean GetPermisoNormalizacionRutDefinivo(String rolUsuario) {

		boolean isPermiso = true;

		WebElement ElementRut = BaseFlow.driver.findElement(By
				.xpath("/html/body/div[1]/div[2]/section/section/div[2]/div/section/div/div/form/div[1]/div[2]/input"));
		WebElement ElementCheck = BaseFlow.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/section/section/div[2]/div/section/div/div/form/div[1]/div[3]/label[2]/div/input"));

		switch (rolUsuario) {
		case "":
			if (BaseFlow.driver.findElement(By.name("mensajeSinPermiso")).isEnabled())
				isPermiso = true;

			break;
		case "CONSULTAR_FCPINFBASNRUT":
			String atributoRut = ElementRut.getAttribute("disabled").trim();
			String atributoCheck = ElementCheck.getAttribute("disabled").trim();

			if (!atributoRut.equals("true"))
				isPermiso = false;
			if (!atributoCheck.equals("true"))
				isPermiso = false;

			break;
		case "INGRESAR_FCPINFBASNRUT":

			break;
		case "EDITAR_FCPINFBASNRUT":
			if (ElementRut.getAttribute("disabled") != "null")
				isPermiso = false;
			if (ElementCheck.getAttribute("disabled") != "null")
				isPermiso = false;
			break;
		case "INGRESAR_FCPINFBASRUTDEF":
			if (ElementRut.getAttribute("disabled") == "true")
				isPermiso = false;
			if (ElementCheck.getAttribute("disabled") == "true")
				isPermiso = false;

			break;
		case "EDITAR_FCPINFBASRUTDEF":
			if (ElementRut.getAttribute("disabled") == "true")
				isPermiso = false;
			if (ElementCheck.getAttribute("disabled") == "true")
				isPermiso = false;

			break;

		}

		return isPermiso;
	}

	public static boolean ValidoPermisoCartera(boolean isCartera) {
		boolean cartera = true;
		WebElement element = BaseFlow.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/section/section/div[2]/div/fieldset/section/div[4]/div[1]/div[10]/div[1]"));

		if (!isCartera) {
			if (element.isEnabled())
				return false;
		} else {
			if (!element.isEnabled())
				return false;
		}

		return cartera;

	}

}
