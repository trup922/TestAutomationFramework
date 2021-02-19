package atda;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        //System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        return new ChromeDriver(options);
    }
}
