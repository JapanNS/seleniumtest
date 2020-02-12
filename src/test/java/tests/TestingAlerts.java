package tests;

import drivers.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class TestingAlerts {

    @Test
    public void testingAlerts1() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");

        JavascriptExecutor js0 = (JavascriptExecutor) driver;
        js0.executeScript("javascript:window.scrollBy(250,350)");

        driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();

        Alert myFirstAlert = driver.switchTo().alert();
        Thread.sleep(3000);
        myFirstAlert.accept();

        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("dblClkBtn"));
        actions.doubleClick(elementLocator).perform();
        myFirstAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        myFirstAlert.accept();

        driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
        Thread.sleep(2000);
        myFirstAlert.dismiss();
        Assert.assertEquals("You pressed Cancel!", driver.findElement(By.id("demo")).getText());

        Thread.sleep(2000);

        driver.close();
        driver.quit();

    }

    @Test
    public void testingSendKeys() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("prompt")).click();
        Alert mySecondAlert= driver.switchTo().alert();
        mySecondAlert = driver.switchTo().alert();
        System.out.println(mySecondAlert.getText());
        mySecondAlert.sendKeys("DevXSchool");
        Thread.sleep(2000);
        mySecondAlert.accept();

        Thread.sleep(3000);
        driver.close();
        driver.quit();





    }
}