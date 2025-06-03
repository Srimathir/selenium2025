package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.page.Page;

import java.util.List;

public class locatorClassi {

    static WebDriver driver = new ChromeDriver();
    List<WebElement> NonTextTypeElements;
    List<WebElement> StudentNameElements;
    WebElement SubmitElement;
    List<WebElement> MissingElements;
    Page p = new Page(driver);



    public List<WebElement> LocateNonTextTypeElements(WebDriver driver, String url) {
        driver .get(url);
        NonTextTypeElements = driver.findElements(By.xpath("//input[@type!='text']"));
        System.out.println("Non-text type input elements:"+ NonTextTypeElements.size());
        for(WebElement i : NonTextTypeElements)
            System.out.println(i);
        return NonTextTypeElements;
    }

    public List<WebElement> LocateStudentNameElements(WebDriver driver, String url) {
        driver .get(url);
        StudentNameElements = driver.findElements(By.xpath("//input[starts-with(@name,'first')]"));
        System.out.println("StudentNameElements:"+ StudentNameElements.size());
        for(WebElement i : StudentNameElements)
            System.out.println(i);
        return null;
    }

    public WebElement LocateSubmitElement(WebDriver driver, String url) {
        driver .get(url);
        SubmitElement = driver.findElement(By.xpath("//button[@name='submit']"));
        System.out.println("SubmitElement:"+ SubmitElement);
        return null;
    }

    public List<WebElement> LocateMissingElements(WebDriver driver, String url) {
        driver .get(url);
        MissingElements = driver.findElements(By.xpath("//input[not(@id)]"));
        System.out.println("MissingElements:"+ MissingElements.size());
        for(WebElement i : MissingElements)
            System.out.println(i);
        return null;
    }

    public static void main(String[] args)
    {   String url = "https://www.techlistic.com/p/selenium-practice-form.html";
        locatorClassi loc = new locatorClassi();
        loc.LocateNonTextTypeElements(driver, url );
        loc.LocateStudentNameElements(driver, url);
        loc.LocateSubmitElement(driver, url);
        loc.LocateMissingElements(driver, url);
        driver.quit();
    }
}
