package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//input[@id='header-search']")
    private WebElement searchBar;
    @FindBy(xpath = "//button[@data-auto='search-button']")
    private WebElement searchButton;


    public MainPage() {
        driver.get(config.getBaseUrl());
        PageFactory.initElements(driver, this);
    }

    public MainPage clickSearchBar(String name) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
        return this;
    }

    public SearchPage searchPage() {
        return new SearchPage();
    }

    public MobilePage mobilePage() {
        return new MobilePage();
    }
}
