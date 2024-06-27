package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.YandexMarketPage;

public class YandexMarketTest extends BaseSeleniumTest {
    @Test
    public void mobileMarketTest() {
        YandexMarketPage yandexPage = new YandexMarketPage();
        yandexPage.clickSearchBar(BaseSeleniumTest.config.getSearchItem()).searchPage()
                .inputFilterProperties(BaseSeleniumTest.config.getPrice(), BaseSeleniumTest.config.getDiagonal());
        String firstElement = yandexPage.searchPage().firstElement();
        Assertions.assertEquals(BaseSeleniumTest.config.getExpectedNumberOfElements(), yandexPage.searchPage().searchResult().size());
        System.out.println(firstElement);
        yandexPage.searchPage().clickMoreExpensiveButton()
                .getElementByDynamicLocator(firstElement).click();
        System.out.println(yandexPage.mobilePage().getRating());
    }
}