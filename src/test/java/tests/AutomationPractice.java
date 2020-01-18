package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

    @Test
    public void testRadioButton() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form");
        Thread.sleep(3000);
        WebElement yearsOfExp = driver.findElement(By.xpath("//input[@id='exp-2']"));
        yearsOfExp.click();
        Thread.sleep(1000);
        Assert.assertTrue(yearsOfExp.isSelected());

        driver.close();
    }
}
