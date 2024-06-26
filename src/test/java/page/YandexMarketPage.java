package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    @FindBy(xpath = "//input[@aria-labelledby='labeltextfield9900224053']")
    private WebElement minDiagonal;


    public YandexMarketPage() {
        driver.get("https://market.yandex.ru/");
        PageFactory.initElements(driver, this);
    }

    public YandexMarketPage clickSearchBar(String name) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
        return this;
    }

    public YandexMarketPage inputSearchProperties(String price,String diagonal) {
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
}
