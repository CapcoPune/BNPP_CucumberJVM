package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.ConfigWeb;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.ApplicationLibraryWeb;
import pageFactory.LandingPage;

public class AddBooksToCart {

	ApplicationLibraryWeb lib;
	WebDriver dr;
	static String getUser;

	public AddBooksToCart(ApplicationLibraryWeb lib) {
		this.lib = lib;
	}
//---------------------------------------------------------

	/*
	 * @Given("^I am on Landing Page of AUT$") public void launchApp() throws
	 * Exception {
	 * 
	 * // lib= new ApplicationLibraryWeb();
	 * 
	 * ConfigWeb.dr = lib.launchBrowser();
	 * 
	 * this.dr = ConfigWeb.dr; PageFactory.initElements(dr, HomePage.class);
	 * PageFactory.initElements(dr, LoginPage.class); PageFactory.initElements(dr,
	 * HomePage.class); PageFactory.initElements(dr, LandingPage.class);
	 * Thread.sleep(1000);
	 * System.out.println(dr.findElement(By.xpath("//span [text()='Hello, Sign in']"
	 * )).getText());
	 * 
	 * }
	 * 
	 * @When("^I Login with valid \"(.*?)\" and \"(.*?)\"$") public void
	 * login(String UserName, String Password) { //
	 * System.out.println(dr.findElement(By.xpath()).getText()); try {
	 * 
	 * // HomePage.signInButton.click(); System.out.println(UserName + "  " +
	 * Password); lib.click(HomePage.signInButton);
	 * lib.setTextBox(LoginPage.emailTextBox, UserName);
	 * lib.setTextBox(LoginPage.passwordTextBox, Password);
	 * lib.click(LoginPage.signInSubmit);
	 * 
	 * lib.infoLog("Logged in with user :" + UserName); } catch (Exception e) {
	 * 
	 * lib.reportFailure("Login failed"); }
	 * 
	 * }
	 * 
	 * @Then("^I am logged into my Account successfully as \\\"(.*?)\\\"$") public
	 * void verifyLogin(String User) { getUser =
	 * LandingPage.signInAccount.getText(); try { assertEquals(getUser, "Hello, " +
	 * User); if (getUser.equalsIgnoreCase("Hello, " + User)) lib.pass(User +
	 * " logged successfully"); else lib.reportFailure(User + " login failed"); }
	 * catch (Exception e) { lib.reportFailure("User login failed "); }
	 * 
	 * }
	 */

	// -----------------------------------------------------
	@Given("^I am logged in as \"(.*?)\"$")
	public void verifyloggedUser(String User) {
		// Getting the Driver
		this.dr = ConfigWeb.dr;

	}

	@When("^I go to \"(.*?)\" Departments Tab$")
	public void selectDepartment(String arg1) throws Throwable {
		try {
			lib.infoLog("Hover on Departments Tab and Cick on " + arg1 + " Section");
			Actions act = new Actions(dr);
			act.moveToElement(LandingPage.deptMenu).build().perform();
			WebDriverWait wait = new WebDriverWait(dr, 40);
			wait.until(ExpectedConditions.visibilityOf(LandingPage.BooksMenu)).click();

		} catch (Exception e) {
			e.printStackTrace();
			lib.reportFailure("Selection of Books Section Failed...Please Check");
		}

	}

	@When("^I Select the SubCategory1 \"(.*?)\"$")
	public void selectCategory(String arg1) {
		try {
			lib.infoLog("Select the SubCatogery1 " + arg1 + " Section");
			LandingPage.artsPhotographyLink.click();
		} catch (Exception e) {
			lib.reportFailure("Select the SubCatogery " + arg1 + " Failed... Please check");
			e.printStackTrace();
		}

	}

	@When("^Select the SubCategory2 \"(.*?)\"$")
	public void select_kkthe(String arg1) {
		try {
			lib.infoLog("Select the SubCatogery2 " + arg1 + " Section");
			LandingPage.photographyVideo.click();
		} catch (Exception e) {
			lib.reportFailure("Select the SubCatogery2 " + arg1 + " Failed... Please check");
			e.printStackTrace();
		}

	}

	@When("^Select the SubCategory3 again \"(.*?)\"$")
	public void selectthe(String arg1) {
		try {
			lib.infoLog("Select the SubCatogery3 " + arg1 + " Section");
			LandingPage.fashion.click();
		} catch (Exception e) {
			lib.reportFailure("Select the SubCatogery3 " + arg1 + " Failed... Please check");
			e.printStackTrace();
		}

	}

	@When("^Select the Book by Name \"(.*?)\"$")
	public void select_the_Book_by_Name(String arg1) {

		try {
			lib.infoLog("Select the Book :" + arg1);
			if (arg1.equalsIgnoreCase("Chanel: Collections and Creations")) {
				Thread.sleep(1000);
				LandingPage.bookChanel.click();
			} else if (arg1.equalsIgnoreCase("GUCCI: The Making Of")) {
				Thread.sleep(1000);
				LandingPage.bookNameGucci.click();
			}

		} catch (Exception e) {
			lib.reportFailure("Select the Book :" + arg1 + " | step Failed...Please check ");
			e.printStackTrace();
		}

	}

	@When("^Add the item to the Cart$")
	public void add_the_item_to_the_Cart() throws Throwable {

		try {
			lib.infoLog("Add the item to the cart");
			Thread.sleep(1000);
			LandingPage.addToCart.click();
		} catch (Exception e) {
			lib.reportFailure("Add the item to the cart failed...Please check");
			e.printStackTrace();
		}
	}

	@Then("^I should see the item in my Cart$")
	public void verifyCart() {

		try {
			lib.infoLog("Verify the Cart");
			System.out.println(LandingPage.proceedToCheckoutButton.isDisplayed());
			assertEquals(LandingPage.proceedToCheckoutButton.isDisplayed(), true);
			dr.close();
		} catch (AssertionError e) {

			lib.reportFailure("Verify the Cart failed..Please check ");
			dr.close();
		}
	}

	@After("@Data")
	public void after() {
		try {
			System.out.println("Report flushing");
			lib.quit();
			System.out.println("Report flushed: ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Before
	public void before(Scenario s) throws Exception {
		try {
			System.out.println("In before: " + s.getName());
			lib.initReports(s.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
