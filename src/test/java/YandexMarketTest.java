import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.YandexMarketPage;

public class YandexMarketTest extends BaseSeleniumTest {
    @Test
    public void mobileMarketTest() {
        YandexMarketPage yandexPage = new YandexMarketPage();
        yandexPage.clickSearchBar(config.getSearchItem()).searchPage()
                .inputFilterProperties(config.getPrice(), config.getDiagonal());
        String firstElement = yandexPage.searchPage().firstElement();
        Assertions.assertEquals(config.getExpectedNumberOfElements(), yandexPage.searchPage().searchResult().size());
        System.out.println(firstElement);
        yandexPage.searchPage().clickMoreExpensiveButton()
                .getElementByDynamicLocator(firstElement).click();
        System.out.println(yandexPage.mobilePage().getRating());
    }
}