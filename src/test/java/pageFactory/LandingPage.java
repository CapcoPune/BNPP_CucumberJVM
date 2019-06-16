package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.DriverInitializer;

public class LandingPage extends DriverInitializer{
	
	@FindBy(className = "login")
	public static WebElement signInButton;
	
	@FindBy(id = "email")
	public static WebElement emailTextBox;
	
	@FindBy(id = "passwd")
	public static WebElement passwordTextBox;
	
	@FindBy(id = "SubmitLogin")
	public static WebElement SubmitLoginButton;


}
