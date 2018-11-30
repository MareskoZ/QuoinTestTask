package stackoverflow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/header/div/ol/li[2]/a/div[1]") private WebElement user_icon;

    public void checkUser (String name_tittle){
        Assert.assertEquals(name_tittle, user_icon.getAttribute("title"));
    }
}
