package co.celus.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BrowserUtils {

    public static void waitForVisibilityOf(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
    }

    public static void waitForStaleElement(WebElement element) {
        int attempt = 0;
        while (attempt < 3) {
            if (attempt == 1) {
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException st) {
                    attempt++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException in) {
                        in.printStackTrace();
                    }
                } catch (WebDriverException we) {
                    attempt++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException in) {
                        in.printStackTrace();
                    }
                }
            }
        }
    }

    public static void waitForPresenceOfElement(By by, long time) {
        new WebDriverWait(Driver.getDriver(), time).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
