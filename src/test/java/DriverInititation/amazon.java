package DriverInititation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class amazon {
    ChromeDriver driver = new ChromeDriver();
    public void lauchURL()
    {
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      String name= driver.findElement(By.xpath("//div[@id='YMii-_i2JevwbxxxLELF9w']/div[2]/div[2]/div[2]/a/div/span")).getText();
System.out.println(name);

    }
    public static void main(String[] args)
    {
        amazon a= new amazon();
        a.lauchURL();
    }
}
