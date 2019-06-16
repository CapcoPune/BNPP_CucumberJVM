package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import pageFactory.LandingPage;
import utilities.DriverInitializer;
import utilities.ActionMethods;

public class WhenSteps extends DriverInitializer {
	//WebDriver driver;
	LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
	//	WebDriver 	driver = DriverInitializer.getDriver("chrome");
		System.out.println("Email text box :    " + LandingPage.signInButton.getText());
		ActionMethods.clickElement(LandingPage.signInButton);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		ActionMethods.setTextBox(LandingPage.emailTextBox, "blog.cucumber@gmail.com");
		ActionMethods.setTextBox(LandingPage.passwordTextBox, "blog.cucumber@gmail.com");
		ActionMethods.clickElement(LandingPage.SubmitLoginButton);
	    
	}
	
	@When("^user enters username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String arg1, String arg2) throws Throwable {
		ActionMethods.setTextBox(LandingPage.emailTextBox, arg1);
		ActionMethods.setTextBox(LandingPage.passwordTextBox, arg2);
		ActionMethods.clickElement(LandingPage.SubmitLoginButton);
	}

}
