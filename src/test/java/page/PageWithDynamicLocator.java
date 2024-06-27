package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageWithDynamicLocator extends BaseSeleniumPage {
    public PageWithDynamicLocator() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getElementByDynamicLocator(String value) {
        return driver.findElement(By.xpath("//*[contains(text(), '" + value + "')]"));
    }
}
