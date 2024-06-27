package page;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    static final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    protected static WebDriver driver;

    public static void setDriver(WebDriver webdriver) {
        driver = webdriver;
    }

}
