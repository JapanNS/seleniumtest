package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleTest {
    @Test

    public void testKyrgyzstan() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kyrgyzstan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='kyrgyzstan']")).click();

        Assert.assertEquals("kyrgyzstan", driver.findElement(By.xpath("//input[@name='q']")).getAttribute("value")); // expected and actual value syntax

        //Save all of the search results
        List<WebElement> links = driver.findElements(By.xpath("//h3[contains(text(),'yrgyzstan')]"));

        //Kyrgyztsan - Travel guide at Wikivoyage
        Thread.sleep(2000);
        //links.get(8).click();
        for (WebElement link:links){
            if (link.getText().equals("Kyrgyzstan - Travel guide at Wikivoyage"))
                link.click();
        }
        Thread.sleep(2000);
       // Assert.assertTrue(driver.findElement(By.xpath("//a[@title='Visit the main page']")).isDisplayed());
        driver.close();



    }


}
