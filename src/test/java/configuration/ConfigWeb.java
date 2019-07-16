package configuration;

import org.openqa.selenium.WebDriver;


public class ConfigWeb 
{
	public final static String chromeDriverPath="C:\\jars\\chromedriver.exe" ;
	public final static String url="https://www.amazon.com/";
	public static WebDriver dr;
	public final static String testDataResourcePath = "src/test/resources/testDataResources/";
	public static final String USERNAME = "ganesh472";
	public static final String AUTOMATE_KEY = "PfvhgPrJGpSuEX4yuoKY";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static boolean cloud = false ;

}
