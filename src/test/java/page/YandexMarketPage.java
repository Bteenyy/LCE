package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class YandexMarketPage extends BaseSeleniumPage {

    @FindBy(xpath = "//input[@id='header-search']")
    private WebElement searchBar;
    @FindBy(xpath = "//button[@data-auto='search-button']")
    private WebElement searchButton;


    public YandexMarketPage() {
        driver.get(config.getBaseUrl());
        driver.manage().deleteAllCookies();
        PageFactory.initElements(driver, this);
    }

    public YandexMarketPage clickSearchBar(String name) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
        return this;
    }

    public SearchPage searchPage() {
        return new SearchPage();
    }
    public MobilePage mobilePage()
    {
        return new MobilePage();
    }
}
