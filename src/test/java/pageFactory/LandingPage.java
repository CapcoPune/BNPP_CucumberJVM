package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.ApplicationLibraryWeb;

public class LandingPage extends ApplicationLibraryWeb {

	@FindBy(xpath = "//span[contains(text(),'Hello')]")
	public static WebElement signInAccount;

	@FindBy(xpath = "//span[text()='Departments']")
	public static WebElement deptMenu;

	@FindBy(xpath = "//span[text()='Books']")
	public static WebElement BooksMenu;

	@FindBy(xpath = "//span[text()='Arts & Photography']")
	public static WebElement artsPhotographyLink;

	@FindBy(xpath = "//span[text()='Photography & Video']")
	public static WebElement photographyVideo;

	@FindBy(xpath = "//span[text()='Fashion']")
	public static WebElement fashion;

	@FindBy(xpath = "//h2[text()='GUCCI: The Making Of']")
	public static WebElement bookNameGucci;

	@FindBy(xpath = "//h2[text()='Chanel: Collections and Creations']")
	public static WebElement bookChanel;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	public static WebElement addToCart;

	@FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
	public static WebElement proceedToCheckoutButton;

}
