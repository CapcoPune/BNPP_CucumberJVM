package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import configuration.ConfigWeb;
import library.ApplicationLibraryWeb;



public class HomePage  extends ApplicationLibraryWeb {
	
	//WebDriver dr  = ConfigWeb.dr;

	@FindBy(xpath = "//span [text()='Hello, Sign in']")
	public static WebElement signInButton;	
	
	
	
	
	
	
	
	
	
	

	
	
}
