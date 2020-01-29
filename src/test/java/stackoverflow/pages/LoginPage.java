package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage{

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"txtEmail\"]") private WebElement email_input;
    @FindBy(xpath = "//*[@id=\"txtPassword\"]") private WebElement password_input;
    @FindBy(xpath = "//*[@id=\"submit-btnLogin\"]") private WebElement login_button;

    @FindBy(xpath = "//*[@id=\"lblEmailErr\"]") private WebElement email_err;
    @FindBy(xpath = "//*[@id=\"lblPasswordErr\"]") private WebElement password_err;

    public void login(String email, String password){
        email_input.sendKeys(email);
        password_input.sendKeys(password);
        login_button.click();
    }

    public void checkError(String emailMessage, String passwordMessage){
        Assert.assertEquals(email_err.getText(), emailMessage);
        Assert.assertEquals(password_err.getText(), passwordMessage);
    }

}
