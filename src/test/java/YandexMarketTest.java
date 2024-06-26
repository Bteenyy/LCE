import org.junit.jupiter.api.Test;
import page.YandexMarketPage;

public class YandexMarketTest extends BaseSeleniumTest {

    @Test
    public void mobileMarketTest() {
        YandexMarketPage yandexPage = new YandexMarketPage();
        yandexPage.clickSearchBar("Сотовые телефоны")
                .inputSearchProperties("20000", "3");
    }
}