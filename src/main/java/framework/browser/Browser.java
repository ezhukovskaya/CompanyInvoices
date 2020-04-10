package framework.browser;

import application.constants.PathsConstants;
import framework.utils.PropertiesRead;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    private static final int TIMEOUT = Integer.parseInt(PropertiesRead.read("implicitlyTimeout", PathsConstants.FRAMEWORK_PROPERTY));
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
}