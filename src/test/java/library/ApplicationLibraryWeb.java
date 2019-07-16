package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import configuration.ConfigWeb;

public class ApplicationLibraryWeb 
{
	
	public WebDriver launchBrowser()
	{		
	System.setProperty("webdriver.chrome.driver",ConfigWeb.chromeDriverPath);
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(ConfigWeb.url);
	return driver;
	
	}

}



	
	/*public static WebDriver launchBrowser() throws Exception {
		WebDriver driver = null;

		try {
			System.out.println(ConfigWeb.cloud);
	
			if (ConfigWeb.cloud = false) {
				System.setProperty("webdriver.chrome.driver",ConfigWeb.chromeDriverPath);
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(ConfigWeb.url);
				
			} else if (ConfigWeb.cloud = true) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "62.0");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("resolution", "1024x768");
				caps.setCapability("name", "Bstack-[Java] Sample Test");
				 driver = new RemoteWebDriver(caps);
				 driver.get(ConfigWeb.url);
			} else
				Assert.fail("Invalid browser name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
		

	}
	*/



