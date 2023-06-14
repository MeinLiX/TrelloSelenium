package pages;

import org.openqa.selenium.WebDriver;

public class Page {
    protected String url;
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
