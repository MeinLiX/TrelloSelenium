package pages;

import elements.Button;
import elements.Container;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardPage extends Page {
    public BoardPage(WebDriver driver) {
        super(driver);
    }

    private WebDriver driver;
    public Field newListNameField = new Field(By.cssSelector("input[class='list-name-input']"));
    public Button renameBoardButton = new Button(By.cssSelector("div[data-testid=\"board-name-container\"]"));
    public Field renameBoardField = new Field(By.cssSelector("input[data-testid=\"board-name-input\"]"));
    public Button listNameButton = new Button(By.cssSelector("div[class='list-header-target js-editing-target']"));
    public Field listNameTextAreaforAssert = new Field(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input"));
    public Field listNameFieldforTest = new Field(By.cssSelector("textarea[class='list-header-name mod-list-name js-list-name-input is-editing']"));
    public Button createCardButton = new Button(By.cssSelector("a[class='open-card-composer js-open-card-composer']"));
    public Field createCardNameField = new Field(By.cssSelector("textarea[class='list-card-composer-textarea js-card-title']"));
    public Button createdCardName = new Button(By.cssSelector("span[class='list-card-title js-card-name']"));
    public Button cardDetailsButton = new Button(By.cssSelector("div[class='list-card-details js-card-details']"));
    public Button openMoreButton = new Button(By.cssSelector("a[class='board-menu-navigation-item-link js-open-more']"));
    public Button closeBoardButton = new Button(By.cssSelector("a[class='board-menu-navigation-item-link js-close-board']"));
    public Button confirmCloseBoardButton = new Button(By.cssSelector("input[class='js-confirm full negate']"));
    public Button deleteBoardCompletely = new Button(By.cssSelector("a[class='quiet js-delete']"));
    public Container messageAboutDeletedBoard = new Container(By.xpath("//*[@id='content']/div/div/p"));
    public Field listNameFieldforRenameAssert = new Field(By.cssSelector("h2[class='list-header-name-assist js-list-name-assist']"));

}
