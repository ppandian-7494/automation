package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver open(String browserType) {
        if(browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "/Users/user/code/software/geckodriver");
            return new FirefoxDriver();
        } else if(browserType.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "/Users/user/code/software/IEDriverServer");
            return new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "/Users/user/code/software/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }

    }

    public static void close(WebDriver driver) {
        driver.close();
    }
}
