package pages;

import elements.Button;
import elements.Container;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends Page {
    public CardPage(WebDriver driver) {
        super(driver);
    }

    public Field commentField = new Field(By.cssSelector("textarea[class='comment-box-input js-new-comment-input']"));
    public Button addCommentButton = new Button(By.cssSelector("input[class='primary confirm mod-no-top-bottom-margin js-add-comment']"));
    public Container createdCommentName = new Container(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div/div[4]/div[11]/div[3]/div/div[2]/div[1]/div/div[1]/p"));
    public Button closeWindowButton = new Button(By.cssSelector("a[class='icon-md icon-close dialog-close-button js-close-window']"));
}
