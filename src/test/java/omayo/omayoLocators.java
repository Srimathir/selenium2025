package omayo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class omayoLocators {
    public static WebDriver driver = new ChromeDriver();
    public static WebDriver getDriver()
    {

        return driver;
    }
    public void launchUrl()
    {
        driver.get("https://omayo.blogspot.com/");
    }
    public void locateElem()
    {
        WebElement header = driver.findElement(By.xpath("//h1[@class='title']"));
        System.out.println(header.getText());
        if(header.getText().equalsIgnoreCase("omayo (QAFox.com)"))
        {
            System.out.println("Launched correct page");
        }
        WebElement staticDropDown = driver.findElement(By.id("drop1"));
        staticDropDown.click();
        Select s = new Select(staticDropDown);
        s.selectByVisibleText("doc 1");
        s.selectByIndex(2);
        s.selectByValue("jkl");
        s.selectByContainsVisibleText("4");

           }
           public void tabletoExcel()
           {
               driver.manage().window().fullscreen();
               if(driver.findElement(By.xpath("//table[@id='table1']/parent::div/parent::div/h2")).getText().equalsIgnoreCase("Table"))
               {
                   System.out.println("Found the table");
               }
               WebElement table = driver.findElement(By.id("table1"));
               WebElement headers = driver.findElement(By.tagName("th"));
               List<WebElement> head = new ArrayList<>(Collections.singleton(headers));
               System.out.println(head.size());
               for(int i=0;i<head.size();i++)
               {
                   System.out.println(headers.getText());
               }

           }
           public void readTable()
           {
               String beforeX = "//thead/tr/th[";
               String afterX = "]";
               List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
               System.out.println(rows.size());
               String rowVal;
               for(int i=0;i< rows.size();i++)
               {
                   rowVal = rows.get(i).getText();
                   System.out.println(rows.get(i).getText());
               }
                List<String> header = new ArrayList<>();

               for(int i=1;i<=3;i++) {
                   String actualX = beforeX + i + afterX;
//                   System.out.println(actualX);
                   header.add(driver.findElement(By.xpath(actualX)).getText());
                   System.out.println(driver.findElement(By.xpath(actualX)).getText());
               }

               for(int j=0;j<header.size();j++)
               {
                   System.out.println(header.get(j));
               }

               XSSFWork
           }

    public void closeDriver()
    {
        driver.quit();
    }

    public static void main(String[] args) {
omayoLocators om = new omayoLocators();
om.launchUrl();
//om.locateElem();
//om.tabletoExcel();
        om.readTable();
om.closeDriver();



         }


    }
