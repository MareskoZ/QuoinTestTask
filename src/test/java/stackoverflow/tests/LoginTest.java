package stackoverflow.tests;

import stackoverflow.helpers.Drivers;
import stackoverflow.pages.LoginPage;
import stackoverflow.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static MainPage mainPage;



    String baseUrl = "https://stackoverflow.com/";
    String loginUrl = "https://stackoverflow.com/users/login";
    String password = "1AQ!SW@DE#";
    String email = "fortestnb@gmail.com";
    String name = "TestNNNN";



    @Test
    public void userLogin() throws InterruptedException {
        driver.get(loginUrl);
        //login process
        loginPage.login(email, password);
        //check after login
        mainPage.checkUser(name);
        Assert.assertEquals(baseUrl, driver.getCurrentUrl());
    }


    @BeforeClass
    public static void setup() {
        String baseDir = System.getProperty("user.dir");
        driver = Drivers.getOSChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
