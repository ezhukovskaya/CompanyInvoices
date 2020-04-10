package framework.base;

import framework.browser.Browser;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

@Data
public abstract class BaseElement {

    protected By elementLocator;
    protected String elementName;

    public BaseElement(By locator, String name) {
        this.elementLocator = locator;
        this.elementName = name;
    }

    public void click() {
        getElement().click();
    }

    public void submit(){
        getElement().submit();
    }

    public WebElement getElement() {
        return Browser.getBrowser().findElement(elementLocator);
    }

    private List<WebElement> getElements() {
        return Browser.getBrowser().findElements(this.elementLocator);
    }

    public String getText() {
        return getElement().getText();
    }

    public Dimension getSize() {
        return Browser.getBrowser().findElement(this.elementLocator).getSize();
    }

    public boolean isDisplayed() {
        return getElements().size() > 0;
    }

}