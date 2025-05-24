package SeleniumAssignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class validateLinks {


    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Size:"+links.size());

         for(int i=0;i<links.size();i++)
         {
             WebElement ele= links.get(i);

             String url = ele.getAttribute("href");
//             urlList.add(url);
             System.out.println(url);
             checkInvalidLinks(url);
         }

    }

    public static void checkInvalidLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000);
            con.connect();

            if (con.getResponseCode() >= 400) {
                System.out.println("Link Broken--" + con.getResponseMessage());
            } else
                System.out.println("Link Works--" + con.getResponseMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
