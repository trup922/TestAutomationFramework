package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage{
    public ShoppingCartComponent ShoppingCart;
    public InventoryComponent Inventory;

    public ProductPage(WebDriver driver) {
        super(driver);
        ShoppingCart =new ShoppingCartComponent(driver);
        Inventory=new InventoryComponent(driver);

    }

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container"))).isDisplayed();

    }

}
