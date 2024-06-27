import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.PageWithDynamicLocator;
import page.YandexMarketPage;

public class YandexMarketTest extends BaseSeleniumTest {
    PageWithDynamicLocator pageWithDynamicLocator = new PageWithDynamicLocator();
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
        firstElement = yandexPage.firstElement();
        Assertions.assertEquals(expectedNumberOfElements, yandexPage.searchResult().size());
        System.out.println(firstElement);
        yandexPage.clickMoreExpensiveButton();
        pageWithDynamicLocator.getElementByDynamicLocator(firstElement).click();
    }
}