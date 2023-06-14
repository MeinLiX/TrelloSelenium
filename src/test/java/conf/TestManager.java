package conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestManager {
    protected static WebDriver driver;

    @BeforeSuite
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/meinlix   /repos/SeleniumTrelloTests/TrelloSeleniumMaven/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    }

    @AfterSuite
    public static void tearDown(){
        driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}