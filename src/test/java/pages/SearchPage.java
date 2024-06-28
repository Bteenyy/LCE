package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static helpers.WaitPageLoad.waitForPageLoad;
import static org.openqa.selenium.By.xpath;

public class SearchPage extends BaseSeleniumPage {
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
    @FindBy(xpath = "//span[text()='Новый']//preceding-sibling::*[1]")
    private WebElement newButton;


    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchPage inputFilterProperties(String price, String diagonal) {
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
        //driver.navigate().refresh();
        waitForPageLoad(driver);
        return this;
    }

    public List<WebElement> searchResult() {
        return foundElements;
    }

    public String firstElement() {
        return foundElements.get(0).getText();
    }

    public SearchPage clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newButton);
        return this;
    }

    public SearchPage clickElementByDynamicLocator(String value) {
        waitForPageLoad(driver);
        wait.until(ExpectedConditions.elementToBeClickable(xpath("//*[contains(text(), '" + value + "')]//preceding-sibling::*[1]")));
        driver.findElement(By.xpath("//*[contains(text(), '" + value + "')]//preceding-sibling::*[1]")).click();
        return this;
    }
}
