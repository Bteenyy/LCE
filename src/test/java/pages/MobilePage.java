package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage extends BaseSeleniumPage {
    @FindBy(xpath = "(//span[@class='_24dJu'])[1]")
    private WebElement rating;

    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    public String getRating() {
        return rating.getText();
    }
}
