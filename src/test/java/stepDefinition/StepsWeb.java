package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import configuration.ConfigWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.ApplicationLibraryWeb;

public class StepsWeb {
	
	WebDriver dr;

	@Given("^User is on web platform$")
	public void user_is_on_web_platform() throws InterruptedException  
	{
		ApplicationLibraryWeb lib= new ApplicationLibraryWeb();
		
		try {
			ConfigWeb.dr=lib.launchBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		this.dr=ConfigWeb.dr;
		
		Thread.sleep(5000);
		
	}

	@When("^I enter user details$")
	public void i_enter_user_details() 
	{
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
	   
	}

	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() 
	{		
	    dr.quit();
	}

}
