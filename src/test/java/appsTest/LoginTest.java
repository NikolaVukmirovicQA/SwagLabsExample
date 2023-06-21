package appsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends Base {


    @Test
    public void loginWithIncorrectUsernameAndCorrectPassword() {


        loginPageObj.enterUsername("false___username");

        loginPageObj.enterPassword("secret_sauce");

        loginPageObj.clickOnSubmitButton();

        String expectedUrl = "https://www.saucedemo.com/";

        Assert.assertTrue(expectedUrl.equals(driver.getCurrentUrl()));

        loginPageObj.errorMessage();

    }

    @Test
    public void loginWithCorrectCredentials() {



        loginPageObj.login();



    }

    @Test
    public void loginWithEmptyPasswordField() {


        loginPageObj.enterUsername("standard_user");

        loginPageObj.enterPassword("");

        loginPageObj.clickOnSubmitButton();

        loginPageObj.missingPasswordErrorMessage();

    }
    @Test
    public void loginWithEmptyUsernameField(){


        loginPageObj.enterUsername("");

        loginPageObj.enterPassword("secret_sauce");

        loginPageObj.clickOnSubmitButton();

        loginPageObj.missingUsernameErrorMessage();

    }

    @Test
    public void loginWithPressingButtonENTER() {


        loginPageObj.enterUsername("standard_user");

        loginPageObj.enterPassword("secret_sauce");

        loginPageObj.keyENTER();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertTrue(expectedUrl.equals(driver.getCurrentUrl()));




    }

    @Before
    public void url() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        
        Thread.sleep(500);
        

    }

    





}
