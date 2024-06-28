package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobilePage extends BaseSeleniumPage {
    @FindBy(xpath = "//*[@class='_261_I']//div[@class='_23gJ9']//span[@class='_24dJu']")
    private WebElement rating;

    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getRating() {
        return rating;
    }
}
