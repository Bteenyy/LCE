package helpers;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchToNewWindow {
    public static void SwitchToNewWindow(WebDriver driver, String originalWindow) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}