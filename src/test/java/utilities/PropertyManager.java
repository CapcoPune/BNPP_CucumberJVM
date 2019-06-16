package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//**********************************************************************************************************
//Author: Chetana Kolgiri
//Description: PropertyManager class reads global configurations and use them during test execution.
//**********************************************************************************************************
public class PropertyManager {

  private static PropertyManager instance;
  private static final Object lock = new Object();
  private static String propertyFilePath = System.getProperty("user.dir")+
          "\\src\\test\\java\\config\\application.properties";
  private static String chromePath;
  private static String appURL;
  private static String browser;
  

  //Create a Singleton instance. We need only one instance of Property Manager.
  public static PropertyManager getInstance () {
      if (instance == null) {
          synchronized (lock) {
              instance = new PropertyManager();
              instance.loadData();
          }
      }
      return instance;
  }

  //Get all configuration data and assign to related fields.
  private void loadData() {
      //Declare a properties object
      Properties prop = new Properties();
      System.out.println(propertyFilePath);
      //Read configuration.properties file
      try {
          prop.load(new FileInputStream(propertyFilePath));
       //   prop.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
      } catch (IOException e) {
          System.out.println("Configuration properties file cannot be found");
      }

      //Get properties from configuration.properties
      appURL = prop.getProperty("appURL");
      chromePath = prop.getProperty("chromePath");
      browser = prop.getProperty("browser");
      System.out.println("chromePath : " + chromePath );
      System.out.println("appURL        : " + appURL );
  }

  
  public  String getAppURL() {
	return appURL;
}



public String chromePath () {
      return chromePath;
  }

public String browser () {
    return browser;
}

  
}