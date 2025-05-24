package SCB.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class webTable {
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args)
    {
        webTable table = new webTable();
        table.scrapeTable("https://cosmocode.io/automation-practice-webtable/");
    }

    public void scrapeTable(String url)
    {
    driver.get(url);
    driver.manage().window().maximize();
    WebElement row = driver.findElement(By.xpath("//table/tbody/tr"));
    WebElement col = driver.findElement(By.xpath("//table/tbody/td"));


    }
}
