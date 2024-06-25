import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.name;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExampleLCE extends TestBase {
    @Test
    public void testGoogleSearch() {
        open("https://www.google.com");
    }
}
