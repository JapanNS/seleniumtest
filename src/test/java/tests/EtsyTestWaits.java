package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EtsyTestWaits {

    @Test
    public void waitsTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com/");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]  ")).click();
        // explicit wait for the image to display
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Register')]   ")));
        driver.findElement(By.xpath("//button[contains(text(), 'Register')]   ")).click();

        WebElement textToVerify = driver.findElement(By.id("join-neu-overlay-title"));
        Assert.assertTrue(textToVerify.isDisplayed());
        driver.close();

    }

    @Test
    public void testMoveToElement() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.toolsqa.com/automation-practice-form");

        WebElement checkbox = driver.findElement(By.id("exp-2"));

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("profession-0"))).perform();
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());

        driver.close();

    }

    @Test
    public void testHover() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/tooltip-and-double-click/");

        WebElement Age = driver.findElement(By.id("tooltipDemo"));

        Actions mouseMover = new Actions(driver);
        Thread.sleep(2000);
        mouseMover.moveToElement(Age).perform();

        WebElement toolTip = driver.findElement(By.className("tooltiptext"));

        Assert.assertTrue(toolTip.isDisplayed());

        driver.close();
    }

    @Test
    public void testSlider() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/slider/");

        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span "));

        Actions slideRight = new Actions(driver);

        slideRight.clickAndHold(slider).moveByOffset(60, 0).release().perform();

        //verify that if actually moved the slider-- verify percentage in a style attribute is >0


    }
    @Test
    public void testDragging(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable/");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions= new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='droppable']/p ")).isDisplayed());

        driver.close();


    }
}
