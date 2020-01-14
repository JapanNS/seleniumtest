package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
    @Test
    public void testRegister() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");

        driver.findElement(By.id("headerMyAccountTitle")).click();
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("jdoe@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("password-input-field")).sendKeys("Abcef312!");
        Thread.sleep(2000);

        driver.findElement(By.id("zipCode")).sendKeys("22201");
        Thread.sleep(2000);

        driver.findElement(By.name("phone")).sendKeys(" 312-123-1223");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("bttn__content")).click();
        driver.close();

    }

}
