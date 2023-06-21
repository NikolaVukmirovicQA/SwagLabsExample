package appsTest;

import Pages.BuyItemPageElements;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BuyItemTest extends Base {
    

    @Test
    public void buyItem() throws InterruptedException {

        buyItemPageObj.addBackpackToCart();

        buyItemPageObj.openCart();

        buyItemPageObj.clickCheckoutButton();

        String expectedCheckoutUrl = "https://www.saucedemo.com/checkout-step-one.html";

        Assert.assertTrue(expectedCheckoutUrl.equals(driver.getCurrentUrl()));


        buyItemPageObj.getRandomFirstNameByFaker();

        buyItemPageObj.getRandomLastNameByFaker();

        buyItemPageObj.getRandomPostalCodeByFaker();

        Thread.sleep(2000);

        buyItemPageObj.clickOnContinueButtonAfterEnteringCredentials();

        buyItemPageObj.shippingTextDisplayed();

        buyItemPageObj.pressLastFinishButton();

        buyItemPageObj.thankYouForYourOrderTextIsDisplayedAssert();

        buyItemPageObj.backToProductsAfterOrdering();

        String expectedUrlAfterOrdering = "https://www.saucedemo.com/inventory.html";

        Assert.assertTrue(expectedUrlAfterOrdering.equals(driver.getCurrentUrl()));



    }

    @Before
    public void url() throws InterruptedException {


        loginPageObj.login();

    }
}