package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import utilities.DriverInitializer;

public class ThenSteps extends DriverInitializer {
	
	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
    	String Stringactual = driver.findElement(By.cssSelector(".info-account")).getText();
		Assert.assertEquals(exp_message, Stringactual);

	    
	}

}
