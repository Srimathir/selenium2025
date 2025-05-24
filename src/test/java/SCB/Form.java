package SCB;


import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;

import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class Form {
    WebDriver driver=new ChromeDriver();;

    public void closeDriver()
    {
        driver.close();
    }
    public void registractionForm() throws AWTException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement formTitle = driver.findElement(By.xpath("//form[@name='TextForm']/h1"));
        String formTit = formTitle.getText();
        System.out.println(formTit);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(formTit,"Student Registration Form");

        driver.manage().window().maximize();
        driver.findElement(By.id(("name"))).sendKeys("Srimathi");
        driver.findElement(By.id("email")).sendKeys("srimathi12@gmail.com");
        driver.findElement(By.xpath("//input[@name='gender']//parent::div//following-sibling::div[1]/input")).click();
        driver.findElement(By.id("mobile")).sendKeys("1234567890");
        driver.findElement(By.id("dob")).sendKeys("23-05-2025");
        driver.findElement(By.id("subjects")).sendKeys("Science");
        List<WebElement> check;
        check = driver.findElements(By.xpath("//input[@type='checkbox']//following-sibling::label"));
       for(WebElement i: check)
       {
           System.out.println(i.getText());
           if(i.getText().equalsIgnoreCase("Reading"))
           {
               System.out.println(i);
           }
       }

       WebElement fileUpload= driver.findElement(By.id("picture"));
       fileUpload.sendKeys("C://Users//srrajend//Downloads//image.jpg");

        System.out.println("File Uploaded");

        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Comments");
        Select s = new Select(driver.findElement(By.id("state")));
        s.selectByVisibleText("Haryana");
        Select s1 = new Select(driver.findElement(By.id("city")));
        s1.selectByVisibleText("Meerut");
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='submit']")));
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    public static void main(String[] args) throws AWTException {
        Form om = new Form();
        om.registractionForm();
//        om.closeDriver();
       }


    }
