package appsTest;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

    public static WebDriver driver;

    SocialMediaButtons socialMediaObj = new SocialMediaButtons(driver);

    AddToCart addToCartObj = new AddToCart(driver);

    LoginPage loginPageObj = new LoginPage(driver);

    CheckoutPage checkoutPageObj = new CheckoutPage(driver);

    BuyItemPageElements buyItemPageObj = new BuyItemPageElements(driver);



    @BeforeClass
    public static void beforeClass(){

        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();

        driver.manage().window().maximize();



    }

    @AfterClass
    public static void afterClass() throws InterruptedException {

        Thread.sleep(6000);

        driver.quit();

    }

    @After
    public  void tearDown () throws InterruptedException {

        Thread.sleep(2000);

    }


}
