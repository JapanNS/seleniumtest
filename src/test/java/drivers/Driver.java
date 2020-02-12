package drivers;

import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class Driver {
    //this is our driver factory- pattern- you manage all the drivers in one class
    //it will have private constructor to manage drivers in one class
    private Driver(){};

    //create a static variable
    // method to create a driver
    private static WebDriver driver;

    public static WebDriver getDriver(){
        boolean headless= Boolean.parseBoolean(ConfigReader.getProperty("headless"));
        if (driver== null){ // if I don't have an active driver running create me the followings
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    //assign to driver
                    driver= ChromeWebDriver.loadChromeDriver(headless);
                break;

                case "firefox":
                    // assign to driver
                    driver= FirefoxWebDriver.loadFirefoxDriver(headless);
                    break;
                default:
                    driver= ChromeWebDriver.loadChromeDriver(false);
            }
        }
        return driver;
    }
    // method to close the driver
    public static void closeDriver(){
        //if there is no active driver, there is nothing to close, otherwise close
        if(driver== null) return;
        try{
            driver.close();
            driver.quit();
            driver= null;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
