package tests;

import drivers.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.FlightsPage;
import utilities.ConfigReader;

import java.util.Set;

public class TestingPOM {

    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        // how to get base
        String url = ConfigReader.getProperty("baseUrl");
        driver.get(url);

        BasePage expediaHome = new BasePage();
        //expediaHome.ListYourPropertyButton.click();

        //expediaHome.FlightsButton.click();
        // or simply call the method
        expediaHome.clickFlightsButton();

    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        String url = ConfigReader.getProperty("baseUrl");
        driver.get(url);

        BasePage expediaHome = new BasePage();

        expediaHome.FlightsButton.click();

        FlightsPage flight = new FlightsPage();
        flight.originInputField.sendKeys("Chicago, IL");
        Thread.sleep(2000);
        //flight.destinationInput.sendKeys("Tampa, FL +Keys.ENTER"); still works
        flight.destinationInput.sendKeys("Tampa, FL");

        flight.searchButton.click();

        driver.close();

    }

    @Test
    public void test3Scroll() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        String url = ConfigReader.getProperty("baseUrl");
        driver.get(url);

        BasePage expediaHome = new BasePage();
        // move to the buttom of the page
        expediaHome.moveToTheBottomOfThePage();
        //click on one of the flags
        expediaHome.globalSites.get(2).click();


    }

    @Test
    public void testWindowHandles() throws InterruptedException{
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        //driver.manage().window().maximize();
        JavascriptExecutor js0 = (JavascriptExecutor) driver;
        js0.executeScript("javascript:window.scrollBy(250,350)");
        driver.findElement(By.id("button1")).click();
        String mainPage = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window: windows){
            if(!window.equals(mainPage))
                driver.switchTo().window(window);
        }
        driver.manage().window().maximize();
        WebElement enrollButton = driver.findElement(By.linkText("Enroll Your Self"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;", enrollButton);
    }
    }

