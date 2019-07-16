package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import configuration.ConfigWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.ApplicationLibraryWeb;
import pageFactory.HomePage;
import pageFactory.LandingPage;
import pageFactory.LoginPage;
/*
 * Date: 13/07/2019
 * Author: Chetana Kolgiri
 * Description: These functions are used for generic step definitions used across application 
 * Parameter: NA 
 */

public class GenericSteps extends ApplicationLibraryWeb{
	
	WebDriver dr;
	static String getUser;
	

	
	@SuppressWarnings("static-access")
	@Given("^I am on Landing Page of AUT$")
	public void launchApp() throws Exception   {
		ApplicationLibraryWeb lib= new ApplicationLibraryWeb();

			ConfigWeb.dr=lib.launchBrowser();
	
		this.dr=ConfigWeb.dr;
		PageFactory.initElements(dr, HomePage.class);
		PageFactory.initElements(dr, LoginPage.class);
		PageFactory.initElements(dr, HomePage.class);
		PageFactory.initElements(dr, LandingPage.class);
		Thread.sleep(1000);
		System.out.println(dr.findElement(By.xpath("//span [text()='Hello, Sign in']")).getText());
		
	   
	}

	@When("^I Login with valid \"(.*?)\" and \"(.*?)\"$")
	public void login(String UserName, String Password)  {
		//System.out.println(dr.findElement(By.xpath()).getText());
		HomePage.signInButton.click();
		LoginPage.emailTextBox.sendKeys(UserName);
		LoginPage.passwordTextBox.sendKeys(Password);
		LoginPage.signInSubmit.click();
		
		
	   
	}

	@Then("^I am logged into my Account successfully as \\\"(.*?)\\\"$")
	public void verifyLogin(String User) {
	   getUser = LandingPage.signInAccount.getText();
	   assertEquals(getUser, "Hello, " + User);
	  
	}

}
