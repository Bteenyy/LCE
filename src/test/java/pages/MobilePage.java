package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobilePage extends BaseSeleniumPage {
    @FindBy(xpath = "//div[@class='_1271A _1MOwX _2eMnU _2fCCf']")
    private List<WebElement> rating;

    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getRating() {
            return rating;
    }
}
