package SeleniumAssignment;

import io.opentelemetry.api.trace.propagation.internal.W3CTraceContextEncoding;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class onlineShopping {

    public String completeCheckout(WebDriver driver, String shoppingPageUrl,
                                   ShoppingDetails shoppingDetails)
    {
        driver.get(shoppingPageUrl);
        driver.manage().window().maximize();

        String message = "";
        return message;
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://magento.softwaretestingboard.com/";
        onlineShopping on= new onlineShopping();
        ShoppingDetails details = new ShoppingDetails();
        on.completeCheckout(driver,url,details);

        Actions act = new Actions(driver);
        WebElement women = driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[2]/a"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='ui-id-2']/li[2]/a")));
        act.moveToElement(driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[2]/a"))).perform();
        act.moveToElement(driver.findElement(By.xpath("//li[@class='level1 nav-2-1 category-item first parent ui-menu-item']/a"))).perform();
        act.moveToElement(driver.findElement(By.xpath("//li[@class='level1 nav-2-1 category-item first parent ui-menu-item']/ul/li[2]/a"))).perform();
        driver.findElement(By.xpath("//li[@class='level1 nav-2-1 category-item first parent ui-menu-item']/ul/li[2]/a")).click();
        String pageTitle= driver.findElement(By.xpath("//h1[@class='page-title']/span")).getText();
        Assert.assertEquals(pageTitle,"Hoodies & Sweatshirts");

      driver.findElement(By.xpath("//a[contains(text(),'Eos V-Neck Hoodie')]")).click();
      System.out.println(driver.findElement(By.xpath("//h1/span")).getText());
      driver.findElement(By.xpath("//div[@role='listbox']/div[@option-label='L']")).click();
       driver.findElement(By.xpath(" //div[@class='swatch-attribute color']/div/div[@option-label='Green']")).click();
       WebElement quan = driver.findElement(By.xpath("//input[@type='number']"));
       act.doubleClick(quan).perform();
       quan.sendKeys(Keys.BACK_SPACE);
       quan.sendKeys("3");

       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
       driver.findElement(By.id("product-addtocart-button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='counter-number']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("shopping cart")))   ;
        driver.findElement(By.linkText("shopping cart")).click();
       String cart = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(cart, "Shopping Cart");

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Proceed to Checkout']")));
        driver.findElement(By.xpath("//button[@type='button']/span[contains(text(),'Proceed to Checkout')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("customer-email"))));
        driver.findElement(By.id("customer-email")).sendKeys("sri123@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//input[@name='firstname']")));
        driver.findElement( By.xpath("//input[@name='firstname']")).sendKeys("Srimathi");
        driver.findElement( By.xpath("//input[@name='lastname']")).sendKeys("Rajendran");
      driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("address");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
        Select state = new Select(driver.findElement(By.xpath("//select[@name='region_id']")));
        state.selectByVisibleText("Armed Forces Americas");
        driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12345");
        Select country = new Select(driver.findElement(By.xpath("//select[@name='country_id']")));
        country.selectByVisibleText("American Samoa");
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("123456790");
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
            driver.findElement(By.xpath("//li//div[contains(text(),'Shipping Methods')]//following-sibling::div[2]/form/div/table/tbody/tr/td")).click();
//             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='row']/td")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-role='opc-continue']/span")))   ;
//             act.doubleClick(driver.findElement(By.xpath("//button[@data-role='opc-continue']/span")));
////             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-role='opc-continue']/span")))   ;
               driver.findElement(By.xpath("//button[@data-role='opc-continue']/span")).click();
//                                                                                                  

        driver.findElement(By.xpath("//div//button[@class='button action continue primary']")).click();
//
//        String finPage=driver.findElement(By.xpath("//div[@class='payment-group']//div[@data-role='title']")).getText();
//        Assert.assertEquals(finPage,"Payment Method");
//        driver.findElement(By.xpath("//button[@title='Place Order']/span")).click();


    }
}




