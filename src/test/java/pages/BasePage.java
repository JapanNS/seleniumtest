package pages;

import drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    WebDriver driver;
    //instantiate the driver
    public BasePage(){
        driver= Driver.getDriver();
    //It will instantiate every single webelement. Has to to always like this
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath ="//a[contains(text(), 'List your property')]" )
    public WebElement ListYourPropertyButton;

    @FindBy(id="tab-flight-tab-hp")
    public WebElement FlightsButton;

    @FindBy(id="tab-cruise-tab-hp")
    public WebElement CruisesButton;

    @FindBy(id="tab-hotel-tab-hp")
    public WebElement HotelsButton;

    @FindBys({@FindBy(xpath = "//ul[@id='global-sites-links']/li")})
    public List<WebElement> globalSites;

    @FindBy(xpath = "//img[@id='EG-logo']")
    public WebElement logoAtTheBottom;

    public void moveToTheBottomOfThePage(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",logoAtTheBottom);
    }


    // You can also write a method as shown below;
    public void clickFlightsButton(){
        FlightsButton.click();
    }

}
