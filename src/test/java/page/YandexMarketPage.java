package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class YandexMarketPage extends BaseSeleniumPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @FindBy(xpath = "//input[@id='header-search']")
    private WebElement searchBar;
    @FindBy(xpath = "//button[@data-auto='search-button']")
    private WebElement searchButton;
    @FindBy(xpath = "//input[@class='_3hHJe _3DAWe']")
    private WebElement maxPrice;
    @FindBy(xpath = "//span[text()='Apple']//preceding-sibling::*[1]")
    private WebElement apple;
    @FindBy(xpath = "//span[text()='Xiaomi']//preceding-sibling::*[1]")
    private WebElement xiaomi;
    @FindBy(xpath = "//span[text()='Samsung']//preceding-sibling::*[1]")
    private WebElement samsung;
    @FindBy(xpath = "//span[text()='HONOR']//preceding-sibling::*[1]")
    private WebElement honor;
    @FindBy(xpath = "//span[text()='realme']//preceding-sibling::*[1]")
    private WebElement realme;
    @FindBy(xpath = "(//input[@class='_3hHJe _3MpOq'])[2]")
    private WebElement minDiagonal;
    @FindBy(xpath = "//div[@data-apiary-widget-name='@light/Organic']//h3")
    private List<WebElement> foundElements;
    @FindBy(xpath = "//*[contains(text(), 'подороже')]")
    private WebElement moreExpensive;

    public YandexMarketPage() {
        driver.get("https://market.yandex.ru/");
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

    public YandexMarketPage inputFilterProperties(String price, String diagonal) {
        wait.until(ExpectedConditions.visibilityOf(maxPrice));
        maxPrice.sendKeys(price);
        wait.until(ExpectedConditions.visibilityOf(apple));
        apple.click();
        wait.until(ExpectedConditions.visibilityOf(xiaomi));
        xiaomi.click();
        wait.until(ExpectedConditions.visibilityOf(samsung));
        samsung.click();
        wait.until(ExpectedConditions.visibilityOf(honor));
        honor.click();
        wait.until(ExpectedConditions.visibilityOf(realme));
        realme.click();
        wait.until(ExpectedConditions.visibilityOf(minDiagonal));
        minDiagonal.sendKeys(diagonal);
        return this;
    }

    public List<WebElement> searchResult() {
        return foundElements;
    }

    public String firstElement() {
        return foundElements.get(0).getText();
    }

    public YandexMarketPage clickMoreExpensiveButton() {
        wait.until(ExpectedConditions.visibilityOf(moreExpensive));
        moreExpensive.click();
        return this;
    }
}
