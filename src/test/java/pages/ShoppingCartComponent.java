package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartComponent extends BasePage {
    public ShoppingCartComponent(WebDriver driver) {
        super(driver);
    }

    public boolean hasItems(int numberOfItems) {
        String numberOFItemsInCart=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).getText();
        return Integer.parseInt(numberOFItemsInCart)==numberOfItems;
    }

    public void open() {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
    }
}
