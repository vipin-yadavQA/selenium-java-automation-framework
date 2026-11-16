
package tests;

import base.BaseTest;
import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        // Verify successful login
        Assert.assertTrue(
            driver.getCurrentUrl().contains("inventory.html"),
            "Login failed: Inventory page was not displayed"
        );
    }

    @Test
    public void verifyLockedOutUserLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("locked_out_user", "secret_sauce");

        // Verify error message
        String actualMessage = loginPage.getErrorMessage();

        Assert.assertTrue(
            actualMessage.contains("locked out"),
            "Expected locked-out error message was not displayed"
        );
    }
}
