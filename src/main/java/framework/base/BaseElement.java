package framework.base;

import framework.browser.Browser;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data
public abstract class BaseElement {

    protected By elementLocator;
    protected String elementName;

    public BaseElement(By locator, String name) {
        this.elementLocator = locator;
        this.elementName = name;
    }

    public WebElement getElement() {
        return Browser.getBrowser().findElement(elementLocator);
    }

    public String getText() {
        return getElement().getText();
    }
}