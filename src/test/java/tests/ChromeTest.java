package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest{
    @Test
    public void testPartialLink() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("検索の仕組み")).click();
        String expectedTitle = "Discover How Google Search Works";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        driver.close();
    }
    @Test
    public void testSearch() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Australia" + Keys.ENTER); //it will type Australia and click Enter
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Australia"));

        driver.close();

    }
}
