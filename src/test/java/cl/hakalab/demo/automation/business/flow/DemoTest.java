package cl.hakalab.demo.automation.business.flow;


import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import cl.hakalab.demo.automation.stage.set.DemoStageset;

import cucumber.api.testng.TestNGCucumberRunner;


@SuiteClasses({DemoStageset.class})

public class DemoTest extends BaseFlow{
  
  
    public static void flag() throws Exception {
    	
    }
}
