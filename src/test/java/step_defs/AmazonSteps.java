package step_defs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class AmazonSteps {
    WebDriver driver;
    @Given("^User is on the main page$")
    public void user_is_on_the_main_page() throws Throwable {
        System.out.println("About Run Given Step");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        System.out.println("Given Step finished");
    }
    @When("^User enters 'Iphone' in the search box$")
    public void user_enters_Iphone_in_the_search_box() throws Throwable {
        System.out.println("When Step started");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchInput.sendKeys("iphone"+ Keys.ENTER);
        System.out.println("When Step finished");
    }
    @Then("^All results should contain 'Iphone' in the title$")
    public void all_results_should_contain_Iphone_in_the_title() throws Throwable {
        System.out.println("Then Step started");
        //Assert.assertEquals("iphone", driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getAttribute("value"));
        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.textToBePresentInElementValue(search, "apple"));
        System.out.println(driver.findElement(By.xpath("//span[contains(text(), 'results')]")).getText());
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        List<WebElement> iphoneResults = driver.findElements(By.xpath("//a/span[contains(text(),'iPhone')]"));
        for(WebElement link:iphoneResults){
            System.out.println(link.getText());
        }
        iphoneResults.get(4).click();
        driver.close();
        System.out.println("Then Step finished");
    }
}