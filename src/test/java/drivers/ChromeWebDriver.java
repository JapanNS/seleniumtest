package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver(boolean headless){
        WebDriverManager.chromedriver().setup();

        // disable all chrome options e.g enable cookies, take screenshots, add extensions etc.

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");

        if(headless){
            options.setHeadless(true);
        }

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

        // return instance of the driver
        return driver;


    }
}
