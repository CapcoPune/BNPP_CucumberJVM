
package library;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import configuration.ConfigWeb;
import reports.ExtentManager;

public class ApplicationLibraryWeb {
	public ExtentReports rep;
	public ExtentTest scenario;
	WebDriver driver;

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ConfigWeb.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfigWeb.url);
		return driver;

	}

	/********** logging **************/
	public void infoLog(String msg) {
		scenario.log(Status.INFO, msg);
	}

	public void pass(String msg) {
		scenario.log(Status.PASS, msg);
	}

	public void reportFailure(String errMsg) {
		// fail in extent reports
		System.out.println("Please Fail report");
		scenario.log(Status.FAIL, errMsg);
		System.out.println("Report failed");
		takeSceenShot();
		// take screenshot and put in repots
		// fail in cucumber as well
		// assertThat(false);
		assertFalse(true);
	}

	public void takeSceenShot() {
		// fileName of the screenshot
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		// take screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath + screenshotFile));
			// put screenshot file in reports
			scenario.log(Status.FAIL, "Screenshot-> "
					+ scenario.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath + screenshotFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click(WebElement ele) throws Exception {
		try {
			infoLog("Clicking on:" + ele);
			ele.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public void setTextBox(WebElement ele, String texttoEnter) {
		try {
			infoLog("Typing in:" + ele);
			if (ele.isDisplayed()) {

				ele.sendKeys(texttoEnter);
			} else {
				System.out.println(ele.getText() + " : Element not found");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			infoLog("Typing failed in" + ele);
		}
	}

	/**
	 * @author Ganesh Babar
	 * @param elem Description: Common method to clear text in textbox
	 */
	public static void clearTextBox(WebElement elem) {
		try {
			if (elem.isDisplayed()) {
				elem.clear();
			} else {
				System.out.println(elem.getText() + " : Element not found");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initReports(String scenarioName) throws Exception {
		try {
			rep = ExtentManager.getInstance(System.getProperty("user.dir") + "\\src\\test\\java\\reports\\");
			scenario = rep.createTest(scenarioName);
			System.out.println("Starting init report");
			scenario.log(Status.INFO, "Starting " + scenarioName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public void quit() {
		if (rep != null)
			rep.flush();
		if (driver != null)
			driver.quit();
	}

}
