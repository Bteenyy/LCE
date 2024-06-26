import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.YandexMarketPage;

import java.time.Duration;

public class YandexMarketTest extends BaseSeleniumTest {
    @Test
    public void mobileMarketTest() {
        YandexMarketPage yandexPage = new YandexMarketPage();
        yandexPage.clickSearchBar("Сотовые телефоны")
                .inputProperties();
    }
}