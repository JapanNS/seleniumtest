package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
    @Test
    public void practiceSelenium() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Let's Talk Tea")).click();

        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("Science");
        driver.findElement(By.name("message")).sendKeys("Hi there, I would like to join your Science classes");
        driver.findElement(By.className("form-submit")).click();
        Thread.sleep(2000);

        driver.close();

    }
}
