package test.pages;

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

    @FindBy(xpath = "//*[@id=\"lblFullName\"]") private WebElement fullName_object;

    public void checkUser (String name_tittle){
        Assert.assertEquals(name_tittle, fullName_object.getText("SUPER ADMIN"));
    }
}
