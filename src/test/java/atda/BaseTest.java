package atda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @BeforeEach
    public void setup(){
        driver=getDriver();
    }

    @AfterEach
    public void cleanUp(){
        driver.quit();
    }


    private WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        return new ChromeDriver();
    }
}
