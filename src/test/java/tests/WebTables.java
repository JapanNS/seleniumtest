package tests;

import drivers.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables {
    @Test

    public void test1(){
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.toolsqa.com/automation-practice-table/");

        // to find the element by a tag name;
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(rows.size());

        //to print all the header elements
        List<WebElement> columns = table.findElements(By.xpath(".//tr[1]/td"));
        System.out.println(columns.size());
        String cell = "//tbody/tr["+rows.get(0)+"]/td["+columns.get(0)+"]";

        for(int i=0; i<rows.size()-2;i++){
            for(int j = 0; j<columns.size()-1;j++){
                WebElement cellText = table.findElement(By.xpath(".//tbody/tr["+(i+1)+"]/td["+(j+1)+"]"));
                System.out.println(cellText.getText());
            }


        }
    }
    @Test
    public void test2(){

    WebDriver driver= Driver.getDriver();
    driver.get("https://www.toolsqa.com/automation-practice-table/");
    // to find the element by a tag name;
    WebElement table = driver.findElement(By.tagName("table"));
    List<WebElement> rows = table.findElements(By.xpath(".//tbody//tr"));

    int max= 0;

    for (int i=1; i<=rows.size(); i++){
        String value= table.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
        int height = Integer.parseInt(value.replace("m", ""));
        if (height>max)max= height;
    }
        System.out.println("Our maximum height is: "+ max);
        }
        @Test
        public void test3(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.toolsqa.com/automation-practice-table/");
        WebElement table = driver.findElement(By.tagName("table"));
        ////tbody/tr[1]/td[1]
        String first="";
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        for(int i=1; i<=rows.size();i++){
            String country = table.findElement(By.xpath(".//tbody/tr["+i+"]/td[1]")).getText();
            if(i==1)first = country;
            if(first.compareTo(country)>0)first = country;
        }
        System.out.println(first);
    }

        }


