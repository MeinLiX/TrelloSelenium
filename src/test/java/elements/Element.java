package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static conf.TestManager.getDriver;

public abstract class Element {
    protected By by;

    public Element(By by) {
        this.by = by;
    }

    protected WebDriver driver = getDriver();

    WebElement compose() {
        return driver.findElement(by);
    }

    public void click() {
        compose().click();
    }
    public String getText() {
         return compose().getText();
    }
    public boolean elementExist() {
        try {
            compose();
            return true;
        } catch (NullPointerException ex) {
            return false;
        }
    }
}
