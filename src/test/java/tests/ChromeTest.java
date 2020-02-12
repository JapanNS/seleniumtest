package tests;

import com.github.javafaker.Faker;
import drivers.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @Test
    public void testDriverFactory(){
       //WebDriver driver= Driver.getDriver();
        Driver.getDriver().get("https://www.google.com/");
        WebElement search= Driver.getDriver().findElement(By.name("q"));

        Faker faker = new Faker();

        search.sendKeys(faker.beer().name()+Keys.ENTER);
        Driver.closeDriver();
    }

    @Test
    public void TestWithMochData() throws InterruptedException{

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.nike.com/us");
        driver.findElement(By.xpath("//a[@aria-label='KIDS']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/a[text()='Shoes']")).click();

        //a[@class='product-card__link-overlay']
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[contains(@alt, 'Nike Air Force 1 LV8 3 Big')]")).click();
        driver.findElement(By.xpath("//label[text()='3.5Y']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
        driver.findElement((By.xpath("//button[@data-test='qa-cart-checkout']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='qa-guest-checkout']")).click();

        Faker faker = new Faker();

        String creditCard= faker.finance().creditCard();
        String email= faker.internet().emailAddress();
        String firstname= faker.name().firstName();
        String lastname= faker.name().lastName();
        String address= faker.address().fullAddress();
        String phone= faker.phoneNumber().phoneNumber();

        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("address1")).sendKeys(address+Keys.ENTER);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("phoneNumber")).sendKeys(phone);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Continue to Payment")).click();
    }
}
