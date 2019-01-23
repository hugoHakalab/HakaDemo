package cl.hakalab.demo.automation.properties;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesInit {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesInit.class);

	private String reportConfigPath;

	public PropertiesInit() {
		Properties parametros = new Properties();
		String propFileName = "config/config.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		try {
			parametros.load(inputStream);
			reportConfigPath = parametros.getProperty("reportConfigPath");

		} catch (Exception e) {
			LOGGER.info(e.toString());
		}
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public String getReportConfigPath() {
		return reportConfigPath;
	}

	public void setReportConfigPath(String reportConfigPath) {
		this.reportConfigPath = reportConfigPath;
	}

}