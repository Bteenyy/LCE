package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MobilePage extends BaseSeleniumPage {
    @FindBy(xpath = "(//span[@class='_24dJu'])[2]")
    private WebElement rating;

    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    public String getRating() {
        wait.until(ExpectedConditions.visibilityOf(rating));
        return rating.getText();
    }
}
