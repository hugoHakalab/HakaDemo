package cl.hakalab.demo.automation.conn.json;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class CommJson {
	private URL url = null;
	private URLConnection urlOC = null;
	private StringBuilder builder = null;
	

	/**
	 * Function: getJson Description: Accesa al un servicio Rest mediante la Url entregada
	 * 
	 * @param String
	 *            urlSrv
	 * @return void
	 **/
	public void setConn(String urlSrv) {

		try {
			url = new URL(urlSrv);
			urlOC = url.openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Function: getJsonData Description: Retorna una cadena con formato JSON
	 * 
	 * @return String
	 **/
	public String getJsonData() throws IOException {
		String line;
		builder = new StringBuilder();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(urlOC.getInputStream()));
		while ((line = bfr.readLine()) != null) {
			builder.append(line);
		}
		return builder.toString();
	}

	/**
	 * Function: getResponseCode Description: Retorna el codigo de respuesta http
	 * 
	 * @param void
	 * @return int
	 **/
	public int getResponseCode() throws IOException {
		HttpURLConnection httpConnection = (HttpURLConnection) urlOC;
		return httpConnection.getResponseCode();
	}

	/**
	 * Setear parametros para servicios que van por POST
	 * 
	 * @param parametros
	 *            Patrametros que recibe por via POST
	 */
	public void postParametros(String parametros) {
		try {
			DataOutputStream wr = new DataOutputStream(urlOC.getOutputStream());
			wr.writeBytes(parametros);
			wr.flush();
			wr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Setear metodo a utilizar como GET o POST, etc
	 * 
	 * @param metodo
	 *            Metodo a utilizar
	 */
	public void setRequestMethod(String metodo) {
		try {
			((HttpURLConnection) urlOC).setRequestMethod(metodo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Setear parametros de header
	 * 
	 * @param key
	 * @param value
	 */
	public void setRequestProperty(String key, String value) {
		try {
			urlOC.setRequestProperty(key, value);
			urlOC.setDoOutput(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Para el caso de parametros POST que no tengan un body json como estructura, como por ejemplo estructura: x-www-form-urlencoded estos deben ser constuidos con la estructura
	 * key1=value1&key2=value2, este metodo se encarga de escribirlos de esta manera y concatenar con &
	 * 
	 * @param HashMap
	 *            key, value
	 * @return Estructura con key y value concatenada de forma correcta
	 */
	public static String getDataString(HashMap<String, String> params) throws UnsupportedEncodingException {
		StringBuilder result = new StringBuilder();
		boolean first = true;
		for (Map.Entry<String, String> entry : params.entrySet()) {
			if (first)
				first = false;
			else
				result.append("&");
			result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
			result.append("=");
			result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
		}
		return result.toString();
	}

	/**
	 * Deshabilita el certificado SSL, en algun caso que sea necesario, este metodo debe ser llamado antes de ingresar la URL de endpoint
	 * 
	 * @return void
	 */
	public static void doTrustToCertificatesSSL() throws Exception {
		doTrustToCertificates(null);
	}

	/**
	 * Deshabilita el certificado, en algun caso que sea necesario, este metodo debe ser llamado antes de ingresar la URL de endpoint
	 * 
	 * @param sslContext(opcinal)
	 *            Tipo de certificado a deshabilitar, en caso de no estipular, por defecto sera SSL
	 * @return void
	 */
	@SuppressWarnings("restriction")
	public static void doTrustToCertificates(Optional<String> sslContext) throws Exception {
		String certificade = sslContext.isPresent() || sslContext != null ? sslContext.get() : "SSL";
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
				return;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
				return;
			}
		} };
		SSLContext sc = SSLContext.getInstance(certificade);
		sc.init(null, trustAllCerts, new SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		HostnameVerifier hv = new HostnameVerifier() {
			public boolean verify(String urlHostName, SSLSession session) {
				if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
					System.out.println("Warning: URL host '" + urlHostName + "' es diferente al host SSLSession '" + session.getPeerHost() + "'");
				}
				return true;
			}
		};
		HttpsURLConnection.setDefaultHostnameVerifier(hv);
	}
}