package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MobilePage extends BaseSeleniumPage {
    @FindBy(xpath = "(//span[@class='_24dJu'])[1]")
    private WebElement rating;

    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    public MobilePage getRating() {
        wait.until(ExpectedConditions.elementToBeClickable(rating));
        ((JavascriptExecutor) driver).executeScript("arguments[0].getText();", rating);
        return this;
    }
}
