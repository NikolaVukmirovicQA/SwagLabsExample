package appsTest;

import Pages.AddToCart;
import Pages.BuyItemPageElements;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddToCartTest extends Base{


    @Test
    public void addToCartTest() {

         addToCartObj.clickAddBackpackToCart();

         addToCartObj.clickAddBikeLampToCart();

         addToCartObj.clickAddFleeceJacketToCart();

         Assert.assertTrue(addToCartObj.numberOfItemsInCart());

         String removeFromCartText = "Remove";

         Assert.assertTrue(addToCartObj.removeItemFromCartText().equals(removeFromCartText));

         buyItemPageObj.openCart();

         String expectedTextWhenOpenCart = "Your Cart";

         Assert.assertTrue(addToCartObj.yourCartTextAssertation().equals(expectedTextWhenOpenCart));

         Assert.assertTrue(addToCartObj.itemAtCartToProveAdding());







    }

    @Before
   public void login(){

       loginPageObj.login();

    }

}

