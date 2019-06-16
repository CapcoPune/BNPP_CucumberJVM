package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionMethods {
	
	/**
	 * @author Chetana Kolgiri
	 * Description: Common method to click a WebElement 
	 */
	public static void clickElement(WebElement elem) {
		if (elem.isDisplayed()) {
			elem.click();
		}
		else{
			System.out.println(elem.getText() + " : Element not found");	
		
			}
		}
		
	/**
	 * @author Chetana Kolgiri
	 * Description: Common method to Enter text  in textbox 
	 */
	public static void setTextBox(WebElement elem, String texttoEnter) {
		if (elem.isDisplayed()) {
			elem.sendKeys(texttoEnter);
		}
		else{
			System.out.println(elem.getText() + " : Element not found");	
		
			}
		}
		
	}



