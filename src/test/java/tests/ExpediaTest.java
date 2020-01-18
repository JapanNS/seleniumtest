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

public class ExpediaTest {

    @Test
    public void testDropdown() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.expedia.com/");
        driver.findElement(By.id("tab-cruise-tab-hp")).click();
       // Thread.sleep(2000);

        WebElement selectElement= driver.findElement(By.id("cruise-destination-hp-cruise"));

        Select destination = new Select(selectElement); //how to work with select element
        // getOptions() method
        List<WebElement> myOptions = destination.getOptions(); // get all the options in dropdown menu
        //print each of the option
        for (WebElement option: myOptions){
            System.out.println(option.getText());
        }

        //Thread.sleep(2000);
        //select by value
        destination.selectByValue("alaska");
        //Thread.sleep(2000);
        // select ByVisibleText();
        destination.selectByVisibleText("Africa");
        //Thread.sleep(2000);
        //select ByIndex();
        destination.selectByIndex(5);

        List<WebElement> selectedDestinations = destination.getAllSelectedOptions();

        Assert.assertEquals("Europe", selectedDestinations.get(0).getText());






    }
}
