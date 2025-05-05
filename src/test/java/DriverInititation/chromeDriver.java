package DriverInititation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
    public static ChromeDriver driver = new ChromeDriver();

    public static WebDriver getDriver()
    {

              return driver;
    }
    public void closeDriver()
    {
        driver.close();
    }
    public void checkBox()
    {
        driver.get("https://testautomationpractice.blogspot.com/");
        

    }

    public static void main(String[] args) {
        chromeDriver d = new chromeDriver();
        d.checkBox();
        d.closeDriver();

    }
}



