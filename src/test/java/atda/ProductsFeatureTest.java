package atda;


import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProductsFeatureTest extends BaseTest{

    @Test
    public void shouldAddItemToCart() {
        //commit
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("standard_user","secret_sauce");
        ProductPage productPage=new ProductPage(driver);
        assertTrue(productPage.isLoaded());
        productPage.Inventory.addRandomItemToCart();
       assertTrue(productPage.ShoppingCart.hasItems(2), "We added single item to the cart and expected 1 item in cart");

    }


}
