package pages;

import elements.Button;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    private WebDriver driver;

    public Field emailField = new Field(By.cssSelector("input[id='user']"));
    public Field  passwordField = new Field(By.cssSelector("input[id='password']"));
    public Button loginAtlassianButton = new Button(By.cssSelector("input#login"));
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
