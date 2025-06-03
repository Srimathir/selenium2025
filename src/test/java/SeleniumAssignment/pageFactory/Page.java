package SeleniumAssignment.pageFactory;

import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

    WebDriver driver;

    public void Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@type!='text']")
    WebElement textBox;
}
public void clicke()
{
  textBox.send
}
