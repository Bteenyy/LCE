import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.PageWithDynamicLocator;
import page.YandexMarketPage;

public class YandexMarketTest extends BaseSeleniumTest {
    PageWithDynamicLocator pageWithDynamicLocator = new PageWithDynamicLocator();

    @Test
    public void mobileMarketTest() {
        YandexMarketPage yandexPage = new YandexMarketPage();
        yandexPage.clickSearchBar(config.getSearchItem())
                .inputFilterProperties(config.getPrice(), config.getDiagonal());
        String firstElement = yandexPage.firstElement();
        Assertions.assertEquals(config.getExpectedNumberOfElements(), yandexPage.searchResult().size());
        System.out.println(firstElement);
        yandexPage.clickMoreExpensiveButton();
        pageWithDynamicLocator.getElementByDynamicLocator(firstElement).click();
        System.out.println(yandexPage.getRating());
    }
}