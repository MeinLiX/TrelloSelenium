package pages;

import elements.Button;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardsPage extends Page {

    private WebDriver driver;

    public Button createButton = new Button(By.cssSelector("button[data-testid=\"header-create-menu-button\"]"));
    public Button createBoardButton = new Button(By.cssSelector("button[data-testid=\"header-create-board-button\"]"));
    public Field createBoardField = new Field(By.cssSelector("input[data-testid='create-board-title-input']"));
  //  data-testid="create-board-title-input"
    public Button submitButton = new Button(By.cssSelector("button[data-testid=\"create-board-submit-button\"]"));
    public BoardsPage(WebDriver driver) {
        super(driver);
    }
}
