package stepDefinition;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import configuration.ConfigAndroid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import library.ApplicationLibraryAndroid;

public class Steps
{
	
	AppiumDriver dr;
	@Given("^User is on mobile platform$")
	public void user_is_on_mobile_platform() throws MalformedURLException, InterruptedException  {
		
		ApplicationLibraryAndroid lib= new ApplicationLibraryAndroid();
		
		ConfigAndroid.dr=lib.launchDriver();		
		dr=ConfigAndroid.dr;
		
		Thread.sleep(5000);
		
		
	    
	}

	@When("^I complete action$")
	public void i_complete_action() throws InterruptedException  {
	   
		dr.findElement(By.id("com.arbapps.loanemicalc:id/loanemicalc")).click();
		Thread.sleep(4000);
		dr.findElement(By.id("com.arbapps.loanemicalc:id/principal_amount")).sendKeys("4000");
		dr.findElement(By.id("com.arbapps.loanemicalc:id/interest_rate")).sendKeys("10.5");
		dr.findElement(By.id("com.arbapps.loanemicalc:id/duration")).sendKeys("10");
		dr.findElement(By.id("com.arbapps.loanemicalc:id/submit")).click();
		
		//OR.Properties - we can multiple properties
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
	    dr.quit();
	}

	
}
