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

public class BackgroundStepts {

	ApplicationLibraryWeb lib;
	WebDriver dr;
	static String getUser;

	public BackgroundStepts(ApplicationLibraryWeb lib) {
		this.lib = lib;
	}

	@Given("^I am on Landing Page of AUT$")
	public void launchApp() throws Exception {

		ConfigWeb.dr = lib.launchBrowser();

		this.dr = ConfigWeb.dr;
		PageFactory.initElements(dr, HomePage.class);
		PageFactory.initElements(dr, LoginPage.class);
		PageFactory.initElements(dr, HomePage.class);
		PageFactory.initElements(dr, LandingPage.class);
		Thread.sleep(1000);
		System.out.println(dr.findElement(By.xpath("//span [text()='Hello, Sign in']")).getText());

	}

	@When("^I Login with valid \"(.*?)\" and \"(.*?)\"$")
	public void login(String UserName, String Password) {
		// System.out.println(dr.findElement(By.xpath()).getText());
		try {

			// HomePage.signInButton.click();
			System.out.println(UserName + "  " + Password);
			lib.click(HomePage.signInButton);
			lib.setTextBox(LoginPage.emailTextBox, UserName);
			lib.setTextBox(LoginPage.passwordTextBox, Password);
			lib.click(LoginPage.signInSubmit);

			lib.infoLog("Logged in with user :" + UserName);
		} catch (Exception e) {

			lib.reportFailure("Login failed");
		}

	}

	@Then("^I am logged into my Account successfully as \\\"(.*?)\\\"$")
	public void verifyLogin(String User) {
		getUser = LandingPage.signInAccount.getText();
		try {
			assertEquals(getUser, "Hello, " + User);
			if (getUser.equalsIgnoreCase("Hello, " + User))
				lib.pass(User + " logged successfully");
			else
				lib.reportFailure(User + " login failed");
		} catch (Exception e) {
			lib.reportFailure("User login failed ");
		}

	}

}
