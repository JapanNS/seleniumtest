package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class selectElementsPractice {

    @Test
    public void testDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.toolsqa.com/automation-practice-form");

        WebElement continents = driver.findElement(By.id("continentsmultiple"));

        Select destination = new Select(continents);
        Thread.sleep(2000);
        //destination.selectByValue("AS"); still works

        destination.selectByVisibleText("Asia");
        destination.selectByIndex(1);
        destination.selectByValue("AUS");

        Thread.sleep(2000);
        destination.deselectByVisibleText("Europe");

        Thread.sleep(2000);
        List<WebElement> selectedOptions = destination.getAllSelectedOptions();

        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());

//        Assert.assertEquals("Asia", selectedDestinations.get(0).getText());
//        Thread.sleep(2000);

            driver.close();

        }
    }


    //****************************** Uplodadtest*********************************//
    @Test
    public void testFileUpload() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/keyboard-events/");

        driver.findElement(By.id("browseFile")).sendKeys("/Users/NS/Desktop/DevX/DevX.png");
        Thread.sleep(2000);
        driver.findElement(By.id("uploadButton")).click();


    }

    //*********************Download************************************
    @Test
    public void testFileDownload() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //implicit wait


        driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");

        driver.findElement(By.id("textbox")).sendKeys("name");
        Thread.sleep(2000);

        WebElement button= driver.findElement(By.id("create"));
        Thread.sleep(1000);
        Assert.assertTrue(button.isEnabled());
        button.click();
        Thread.sleep(2000);
        driver.findElement(By.id("link-to-download")).click();
        //        driver.findElement(By.linkText("Download")).click();

        Thread.sleep(2000);
        driver.close();

    }
}