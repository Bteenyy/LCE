package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobilePage extends BaseSeleniumPage {
    @FindBy(xpath = "(//span[@class='_2SUA6 _3tpj6 _1X1Ia _1A5yJ _2j1X1'])[1]")
    private WebElement rating;

    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getRating() {
            return rating;
    }
}
