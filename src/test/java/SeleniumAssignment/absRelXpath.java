package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absRelXpath {
    static WebDriver driver = new ChromeDriver();
    public static String relativeXPathForInput(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
        WebElement rel = driver.findElement(By.xpath("//div[contains(@class,'wrapper')]"));
        String rela = rel.toString();
        return rela;
    }
    public static String absoluteXPathForInput(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
        WebElement abs = driver.findElement(By.xpath("//html/body/div[contains(@class,'wrapper')]"));
        String abso = abs.toString();
        return abso;
    }


    public static void main(String[] args)
    {
       String url= "https://magento.softwaretestingboard.com/";
       absRelXpath xpat = new absRelXpath();
//       xpat.relativeXPathForInput(driver, url);
       System.out.println(relativeXPathForInput(driver,url));
//       xpat.absoluteXPathForInput(driver,url);

    }
}
