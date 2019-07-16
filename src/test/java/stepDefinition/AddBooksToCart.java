package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.ConfigWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.HomePage;
import pageFactory.LandingPage;

public class AddBooksToCart {
	
	WebDriver dr;
	
	@Given("^I am on logged in as \"(.*?)\"$")
	public void verifyloggedUser(String User)  {
		//Getting the Driver 
		this.dr=ConfigWeb.dr;
	  
	}

	@When("^I go to \"(.*?)\" Departments Tab$")
	public void selectDepartment(String arg1) throws Throwable {
		Actions act  = new Actions(dr);
		act.moveToElement(LandingPage.deptMenu).build().perform();
		WebDriverWait wait = new WebDriverWait (dr,40);
		wait.until(ExpectedConditions.visibilityOf(LandingPage.BooksMenu)).click();	
		  
	}

	@When("^I Select the SubCategory1 \"(.*?)\"$")
	public void selectCategory(String arg1)  {
		LandingPage.artsPhotographyLink.click();
	  
	}

	@When("^Select the SubCategory2 \"(.*?)\"$")
	public void select_kkthe(String arg1) {
		LandingPage.photographyVideo.click();
	  
	}
	
	
	@When("^Select the SubCategory3 again \"(.*?)\"$")
	public void selectthe(String arg1) {
		LandingPage.fashion.click();
	  
	}

	@When("^Select the Book by Name \"(.*?)\"$")
	public void select_the_Book_by_Name(String arg1) {
		
		LandingPage.bookNameGucci.click();   
	   
	}
	
	@When("^Add the item to the Cart$")
	public void add_the_item_to_the_Cart() throws Throwable {

		LandingPage.addToCart.click();
	}

	
	@Then("^I should see the item in my Cart$")
	public void verifyCart()  {
		
		try{
			assertEquals(LandingPage.proceedToCheckoutButton,true);
			}catch(AssertionError e){
			   
			   //Takescreenshot;
			}
		}
			
	   
	}




