package cl.hakalab.demo.automation.business.flow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import cl.hakalab.demo.automation.model.PageObjectModelDemo;




@RunWith(Suite.class)
@SuiteClasses({})
public class BaseFlow {
	private static final Log log = LogFactory.getLog(BaseFlow.class);
	
	public static WebDriver driver;
	public static SessionId session;
    public static PageObjectModelDemo demo;
	
	static DesiredCapabilities caps = null;
	public static final String USERNAME = "hugoHaka";
	public static final String ACCESS_KEY = "cf258cd2-347e-4954-afea-0f3864b4ec4b";
	public static final String URLs = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	
	@BeforeClass
	public static void InitializeWebDriver() throws Exception {
//		if (System.getenv("hub").equals("local")) {
		setDriverDesa();
//		}else {
//			capabilityBrowser(System.getenv("navegador"));
//			capabilityBrowser("iExplore");
//			driver = new RemoteWebDriver(new java.net.URL(URLs), caps);
	//	}
		
		
		//ManagementMicrosoftService.createNewFileExcel();

		demo=PageFactory.initElements(driver,PageObjectModelDemo.class);
	}
	    
	    
	

	@AfterClass
	public static void setUpFinal() throws Exception {
	driver.quit();
		//CAPTURE BITMAP 
				
	}

	public static void setDriver() throws MalformedURLException {
    	// driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
    	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    		 
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
    }

	public static void setDriverDesa() throws Exception {
		switch ("chrome") {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/WebDriver/WebDriver/Chrome/Windows/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			break;
		
		case "iExplorer":
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/WebDriver/WebDriver/IExplore/Windows/64/IEDriverServer.exe" );
			//System.setProperty("webdriver.ie.driver", "C:/Users/HugoyNathalie/Desktop/gitTest/Auto-Genesis_Web/WebDriver/WebDriver/IExplorer/Windows/64/IEDriverServer.exe");


			
			
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();    
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);    
			caps.setCapability("requireWindowFocus", true);
			driver = new InternetExplorerDriver(caps);
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\WebDriver\\WebDriver\\IExplorer\\Windows\\aut.exe");
			
			break;
		
		}
		
	}
	
	
	public static Capabilities capabilityBrowser(String dispositivo) {
		switch (dispositivo) {
		case "firefox":
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "61.0");
			break;
		case "chrome":
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "67.0");
			break;
		case "iExplore":
			caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "11.103");
		break;
		case "android 7.1":
			caps = DesiredCapabilities.android();
			caps.setCapability("appiumVersion", "1.9.1");
			caps.setCapability("deviceName","Samsung Galaxy S9 Plus WQHD GoogleAPI Emulator");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("platformVersion", "7.1");
			caps.setCapability("platformName","Android");
		case "iphone":
			 caps = DesiredCapabilities.iphone();
			caps.setCapability("appiumVersion", "1.9.1");
			caps.setCapability("deviceName","iPhone XS Simulator");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("platformVersion","12.0");
			caps.setCapability("platformName", "iOS");
			caps.setCapability("browserName", "Safari");
		break;
		}

		return caps;

	}
	
	
}
