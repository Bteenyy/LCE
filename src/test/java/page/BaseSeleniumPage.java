package page;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BaseSeleniumPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    static final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    protected static WebDriver driver;

    public static void setDriver(WebDriver webdriver) {
        driver = webdriver;
    }

}
