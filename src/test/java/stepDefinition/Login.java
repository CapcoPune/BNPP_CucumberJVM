/*package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import  utilities.DriverInitializer;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Login extends DriverInitializer {
WebDriver driver;

@Before
public void setup() {
	System.out.println("Set Up################");
 	driver = DriverInitializer.getDriver("chrome");
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
}

@After
public void tearDown() throws InterruptedException {
	driver.manage().deleteAllCookies();
	driver.quit();
	driver = null;
}


}
*/