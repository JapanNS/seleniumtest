package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utilities.EnvironmentManager;

import java.util.Iterator;
import java.util.Set;

public class ExpediaNewWindowVerificationSteps {
    // create a driver on a class level
    WebDriver driver;
    //Create an object on a class level
    BasePage expediaHome= new BasePage();

    @Given("^the user is on the main expedia page$")
    public void the_user_is_on_the_main_expedia_page() throws Throwable {
        driver= Driver.getDriver();
        driver.get(EnvironmentManager.url);
        //driver.get(ConfigReader.getProperty("baseUrl"));

    }

    @When("^the user clicks on the 'list your property button'$")
    public void the_user_clicks_on_the_list_your_property_button() throws Throwable {
        expediaHome.ListYourPropertyButton.click();

    }

    @Then("^the new tab should open$")
    public void the_new_tab_should_open() throws Throwable {
        String parentPage= driver.getWindowHandle();
        //get ids for every opened window/tab
        Set<String> openTabs= driver.getWindowHandles();
        // switching to the next window by iterating
//        for (String tab: openTabs){
//            if (!tab.equals(parentPage)){
//                driver.switchTo().window(tab);
//            }
//
//        }
        // this will keep switching to whatever number open tabs
        Iterator<String> iter= openTabs.iterator();
        while (iter.hasNext()){
            String childPage = iter.next();
            if (!parentPage.equals(childPage)){
                driver.switchTo().window(childPage);

            }
        }
    }

    @Then("^how much could you earn text be displayed$")
    public void how_much_could_you_earn_text_be_displayed() throws Throwable {
        ////div[@id='calc-data']//h2
        // safe it to WebElement
        WebElement earnings= driver.findElement(By.xpath("//div[@id='calc-data']//h2"));
        Assert.assertTrue(earnings.isDisplayed());
        Assert.assertTrue("This is me failing the test", false);


    }

}
