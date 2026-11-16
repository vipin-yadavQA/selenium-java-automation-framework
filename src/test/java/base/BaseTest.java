
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Load configuration
        ConfigReader.loadConfig();

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open application URL from config file
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {

        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
