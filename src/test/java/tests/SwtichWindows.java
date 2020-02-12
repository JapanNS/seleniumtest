package tests;

import drivers.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class SwtichWindows {
WebDriver driver;
    @Test
    public void switchWindow() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
        driver.manage().window().maximize();
        driver.findElement(By.id("button1")).click();


        ////a[@class='tp-button orange large']
        String parentPage = driver.getWindowHandle();
        //get ids for every opened window/tab
        Set<String> openTabs = driver.getWindowHandles();

        Iterator<String> iter = openTabs.iterator();
        while (iter.hasNext()) {
            String childPage = iter.next();
            if (!parentPage.equals(childPage)) {
                driver.switchTo().window(childPage);

                WebElement earnings= driver.findElement(By.xpath("//a[@class='tp-button orange large']"));
                Assert.assertTrue(earnings.isDisplayed());
            }
        }
    }
}
