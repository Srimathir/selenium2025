package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
    static WebDriver driver = new ChromeDriver();

    public void fillDateOfBirth(WebDriver driver, String pageUrl)
    {
        driver.get(pageUrl);
        driver.findElement(By.id("datepicker2")).sendKeys("06/12/1996");
//       Select year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));


    }

    public static void main(String[] args)
    {
        String url= "https://demo.automationtesting.in/Datepicker.html";
        DatePicker dp = new DatePicker();
        dp.fillDateOfBirth(driver, url);
    }
}
