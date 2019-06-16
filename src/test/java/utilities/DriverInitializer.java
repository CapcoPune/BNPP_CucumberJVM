package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverInitializer {
	
	 public static WebDriver driver;
		
	
	    
	    public static WebDriver getDriver(String browser) {
	    	 String baseURL = PropertyManager.getInstance().getAppURL();
	    	 String chromePath = PropertyManager.getInstance().chromePath();
	    	 
	        System.out.println("######################" + baseURL);

	           
	            //driver = new ChromeDriver();
	 		    
	       /*switch (browser) {
	            case "chrome":
	               System.setProperty("webdriver.chrome.driver", chromePath);
	               driver = new ChromeDriver();
	               break;
	           case "firefox":
	        	   System.setProperty("webdriver.firefox.driver", chromePath);
	               driver = new FirefoxDriver();
	                break;
	            default:
	               System.setProperty("webdriver.chrome.driver", chromePath);
	               driver = new ChromeDriver();
	        }*/
	        System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
            driver.get(PropertyManager.getInstance().getAppURL());
			return driver;
}
	    

}
