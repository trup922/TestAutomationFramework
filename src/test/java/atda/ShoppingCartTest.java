package atda;


import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProductPage;
import pages.ShoppingCartComponent;
import pages.ShoppingCartPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ShoppingCartTest extends BaseTest{

    @Test
    public void shouldAddItemToCart() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("standard_user","secret_sauce");
        ProductPage productPage=new ProductPage(driver);
        assertTrue(productPage.isLoaded());
        productPage.Inventory.addRandomItemToCart();
        assertTrue(productPage.ShoppingCart.hasItems(1), "We added single item to the cart and expected 1 item in cart");
        productPage.ShoppingCart.open();
        assertEquals(1,new ShoppingCartPage(driver).getItemCount(),"Added one item to the cart");
    }


}
