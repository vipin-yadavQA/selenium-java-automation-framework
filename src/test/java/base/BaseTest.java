
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open application
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
