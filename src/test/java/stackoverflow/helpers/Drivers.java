package test.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {

    private static WebDriver driver = null;
    static String baseDir = System.getProperty("user.dir");

    public static WebDriver getOSChromeDriver() {
        System.setProperty("webdriver.chrome.driver", baseDir + driverDetect());
        return driver = new ChromeDriver();
    }

    private static String driverDetect(){
        String macOSDriver = "/src/drivers/chromedriver";
        String winDriver = "/src/drivers/chromedriver.exe";
        String linuxDriver = "/src/drivers/chromedriver_linux";

        String strOSName = System.getProperty("os.name");

        if (strOSName.toLowerCase().contains("win"))
            return winDriver;
        else if (strOSName.toLowerCase().contains("mac"))
            return macOSDriver;
        else
            return linuxDriver;
    }
}
