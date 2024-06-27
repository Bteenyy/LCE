import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import page.YandexMarketPage;

import java.util.List;

public class YandexMarketTest extends BaseSeleniumTest {
    final String searchItem = "Сотовые телефоны";
    final String price = "20000";
    final String diagonal = "3";
    final int expectedNumberOfElements = 24;
    String firstElement;

    @Test
    public void mobileMarketTest() {
        YandexMarketPage yandexPage = new YandexMarketPage();
        yandexPage.clickSearchBar(searchItem)
                .inputFilterProperties(price, diagonal);
        Assertions.assertEquals(expectedNumberOfElements, yandexPage.compareResult());
    }
}