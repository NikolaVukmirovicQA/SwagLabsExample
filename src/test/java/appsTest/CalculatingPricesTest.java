package appsTest;

import Pages.AddToCart;
import Pages.BuyItemPageElements;
import Pages.CheckoutPage;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatingPricesTest extends Base{


    @Test
    public void calculatingMultiplePrices() {

        addToCartObj.clickAddBackpackToCart();

        addToCartObj.clickAddBikeLampToCart();

        buyItemPageObj.openCart();

        buyItemPageObj.clickCheckoutButton();

        buyItemPageObj.getRandomFirstNameByFaker();

        buyItemPageObj.getRandomLastNameByFaker();

        buyItemPageObj.getRandomPostalCodeByFaker();

        buyItemPageObj.clickOnContinueButtonAfterEnteringCredentials();



//        double x = checkoutPageObj.calculatingPricesManually(29.99,9.99,3.2);
//
//        double expectedPriceManuallyCalculated = 43.18;
//
//        Assert.assertTrue(x == expectedPriceManuallyCalculated);




        String backpackPrice = "$29.99";

        String bikeLampPrice = "$9.99";

        String taxPrice = "$3.20";

        String expectedTotalPrice = "Total: $43.18";

        Assert.assertTrue(expectedTotalPrice.equals(checkoutPageObj.getTotalPrice()));


    }

    @Before
   public void login(){

       loginPageObj.login();

   }
}
