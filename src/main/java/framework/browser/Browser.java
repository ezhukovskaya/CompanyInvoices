package framework.browser;

import application.constants.PathsConstants;
import framework.utils.PropertiesRead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser {
    private static final int TIMEOUT = Integer.parseInt(PropertiesRead.read("implicitlyTimeout", PathsConstants.FRAMEWORK_PROPERTY));
    private static final int EXPLICIT_TIMEOUT = Integer.parseInt(PropertiesRead.read("explicitTimeout", PathsConstants.FRAMEWORK_PROPERTY));
    private static WebDriver driver;

    public static WebDriver getBrowser() {
        if (driver == null) {
            driver = BrowserFactory.getBrowser();
        }
        return driver;
    }

    public static void goToUrl(String url) {
        getBrowser().get(url);
    }

    public static void maximize() {
        getBrowser().manage().window().maximize();
    }

    public static void quit() {
        getBrowser().quit();
    }

    public static void setImplicitlyWait() {
        getBrowser().manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }

    public static List<WebElement> findElements(By by){
        return getBrowser().findElements(by);
    }

    public static void setExplicitWait(By by) {
        (new WebDriverWait(getBrowser(), EXPLICIT_TIMEOUT)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static String getAttribute(By by, String attribute) {
        return getBrowser().findElement(by).getAttribute(attribute);
    }
}