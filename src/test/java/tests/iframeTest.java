package tests;

import drivers.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.Iterator;
import java.util.Set;

public class iframeTest {
    @Test
    public void testIframe() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.toolsqa.com/iframe-practice-page/");

        JavascriptExecutor js0 = (JavascriptExecutor) driver;
        js0.executeScript("javascript:window.scrollBy(250,350)");
        // switching to iFrame by ID
        driver.switchTo().frame("IF1");
        WebElement link= driver.findElement(By.partialLinkText("ISTQB Exam Sample Question Paper"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", link);

        WebElement errorMessageToVerify= driver.findElement(By.xpath("//ol/li[text()='Error 404']"));
        Assert.assertTrue(errorMessageToVerify.isDisplayed());

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("devxschool@gmail.com"+ Keys.ENTER);

        // switch back to parent page
        String parentWindow= driver.getWindowHandle();
        Set<String> openWindows= driver.getWindowHandles();

        Iterator<String> iter= openWindows.iterator();
        while (iter.hasNext()){
            String childWindow= iter.next();
            if (!childWindow.equals(parentWindow))
                driver.switchTo().window(childWindow);

        }
        String email= driver.findElement(By.xpath("//div[@class='error message']/following-sibling::p/strong")).getText();
        Assert.assertEquals("Email displayed is not the the same as input", "devxschool@gmail.com", email);
        driver.close();
        driver.quit();
    }
}
