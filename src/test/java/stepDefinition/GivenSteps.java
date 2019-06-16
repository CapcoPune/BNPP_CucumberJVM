package stepDefinition;

import cucumber.api.java.en.Given;
import utilities.DriverInitializer;

public class GivenSteps extends DriverInitializer{
	
	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		System.out.println("Start################");
	 	//driver = DriverInitializer.getDriver("chrome");
	 //driver.get(DriverInitializer.getProperty("login.url"));
        //driver.get("http://automationpractice.com/index.php");
	    
	}

}
