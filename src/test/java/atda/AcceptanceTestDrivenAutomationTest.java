package atda;


import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AcceptanceTestDrivenAutomationTest extends BaseTest {




    @Test
    public void shouldOpen(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());

    }


    @Test
    public void shouldOLogin(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("standard_user","secret_sauce");
        assertTrue(new ProductPage(driver).isLoaded());


    }





}
