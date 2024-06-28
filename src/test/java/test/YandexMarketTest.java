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
        Assertions.assertEquals(BaseSeleniumTest.config.getExpectedNumberOfElements(), String.valueOf(mainPage.searchPage().searchResult().size()));
        mainPage.searchPage().clickNewButton();
        mainPage.searchPage().clickElementByDynamicLocator(firstElement);
        System.out.println(mainPage.mobilePage().getRating().getText());
    }
}