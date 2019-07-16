package utilities;

import org.openqa.selenium.WebDriver;

import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.Assert;

public class DriverInitializer {

	public static WebDriver driver;
	public static final String USERNAME = "ganesh472";
	public static final String AUTOMATE_KEY = "PfvhgPrJGpSuEX4yuoKY";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriver(String browser) throws Exception {

		try {
			String baseURL = PropertyManager.getInstance().getAppURL();
			String chromePath = PropertyManager.getInstance().chromePath();
			if (browser.equals("chrome")) {
				System.out.println("######################" + baseURL);
				System.setProperty("webdriver.chrome.driver", chromePath);
				driver = new ChromeDriver();
				driver.get(PropertyManager.getInstance().getAppURL());

			} else if (browser.equals("browserstack")) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "62.0");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("resolution", "1024x768");
				caps.setCapability("name", "Bstack-[Java] Sample Test");
				driver = new RemoteWebDriver(new URL(URL), caps);
			} else
				Assert.fail("Invalid browser name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}

}
