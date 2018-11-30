package stackoverflow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"email\"]") private WebElement email_input;
    @FindBy(xpath = "//*[@id=\"password\"]") private WebElement password_input;
    @FindBy(xpath = "//*[@id=\"submit-button\"]") private WebElement login_button;

    public void login(String email, String password){
        email_input.sendKeys(email);
        password_input.sendKeys(password);
        login_button.click();
    }

}
