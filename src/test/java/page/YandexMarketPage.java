package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMarketPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='header-search']")
    private WebElement searchBar;
    @FindBy(xpath = "//button[@data-auto='search-button']")
    private WebElement searchButton;
    @FindBy(xpath = "//input[@id='range-filter-field-glprice_2a7d898e_max']")
    private WebElement maxPrice;
    public YandexMarketPage() {
        driver.get("https://market.yandex.ru/");
        PageFactory.initElements(driver, this);
    }
    public YandexMarketPage clickSearchBar(String name)
    {
        searchBar.sendKeys(name);
        searchButton.click();
        return this;
    }
    public YandexMarketPage inputProperties()
    {
        maxPrice.sendKeys("20000");
        return this;
    }
}
