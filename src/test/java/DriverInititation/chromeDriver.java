package DriverInititation;


import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.close();

    }
}
