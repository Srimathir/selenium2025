package SeleniumAssignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class validateLinks11 {


    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Size:"+links.size());

         for(int i=0;i<links.size();i++)
         {
             WebElement ele= links.get(i);

             String url1 = ele.getAttribute("href");
           System.out.println(url1);
             URL url = new URL(url1);
             HttpURLConnection con = (HttpURLConnection) url.openConnection();
             con.setConnectTimeout(5000);
             con.connect();

             if (con.getResponseCode() >= 400) {
                 System.out.println("Link Broken--" + con.getResponseMessage());
             } else
                 System.out.println("Link Works--" + con.getResponseMessage());
         }
         }

    }

//    public static void checkInvalidLinks(String linkUrl) {
//        try {
//            URL url = new URL(linkUrl);
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setConnectTimeout(5000);
//            con.connect();
//
//            if (con.getResponseCode() >= 400) {
//                System.out.println("Link Broken--" + con.getResponseMessage());
//            } else
//                System.out.println("Link Works--" + con.getResponseMessage());
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

//    }
//}
