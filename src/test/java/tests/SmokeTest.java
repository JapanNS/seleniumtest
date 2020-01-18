package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmokeTest {

    @Test

    public void testAmazon() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id= \"twotabsearchtextbox\"]"));
        searchInput.sendKeys("iphone"+ Keys.ENTER);
        //Thread.sleep(2000);
       // Assert.assertEquals("iphone", driver.findElement(By.xpath("//input[@id= \"twotabsearchtextbox\"]")).getAttribute("value")); // expected and actual value syntax
        WebElement search= driver.findElement(By.xpath("//input[@id= \"twotabsearchtextbox\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.textToBePresentInElementValue(search, "apple"));

        System.out.println(driver.findElement(By.xpath("//span[contains(text(), 'results')]")).getText());

        List<WebElement> iphoneResults = driver.findElements(By.xpath("//a/span[contains(text(), 'iPhone')]"));

        for(WebElement link:iphoneResults){
            System.out.println(link.getText());
        }
        iphoneResults.get(4).click();
        driver.close();
    }
}
