package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class YandexMarketTest extends BaseSeleniumTest {
    @Test
    public void mobileMarketTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickSearchBar(BaseSeleniumTest.config.getSearchItem()).searchPage()
                .inputFilterProperties(BaseSeleniumTest.config.getPrice(), BaseSeleniumTest.config.getDiagonal());
        String firstElement = mainPage.searchPage().firstElement();
        Assertions.assertEquals(BaseSeleniumTest.config.getExpectedNumberOfElements(), mainPage.searchPage().searchResult().size());
        System.out.println(firstElement);
        mainPage.searchPage().clickMoreExpensiveButton();
        mainPage.searchPage().getElementByDynamicLocator(firstElement).click();
        System.out.println(mainPage.mobilePage().getRating());
    }
}