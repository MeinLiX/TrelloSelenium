import conf.TestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SeleniumTests extends TestManager {

    @Test(priority = 1)
    public void loginTest() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        HomePage homePage = new HomePage(driver);
        driver.get(homePage.url);
        homePage.loginLink.click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailField.sendKeys("testemail13457@gmail.com");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password-entry")));
        loginPage.loginAtlassianButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[id='login-submit']"))));
        loginPage.passwordField.sendKeys("testpassword123" + Keys.ENTER);
    }

    @Test(priority = 2)
    public void createBoard() throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH mm ss");
        LocalDateTime now = LocalDateTime.now();
        WebDriverWait wait = new WebDriverWait(driver, 25);
        String boardName = "Brand new board" + dtf.format(now);

        BoardsPage boardsPage = new BoardsPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[data-testid=\"header-create-menu-button\"]"))));
        boardsPage.createButton.click();
        wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[data-testid=\"header-create-board-button\"]"))));
        boardsPage.createBoardButton.click();
        boardsPage.createBoardField.sendKeys(boardName + Keys.ENTER);
    }

    @Test(priority = 3)
    public void renameBoard() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH mm ss");
        LocalDateTime now = LocalDateTime.now();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String newBoardName = "Super updated board" + dtf.format(now);

        BoardPage boardPage = new BoardPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("div[data-testid=\"board-name-container\"]"))));
        boardPage.renameBoardButton.click();
        boardPage.renameBoardField.sendKeys(newBoardName + Keys.ENTER);
        Assert.assertEquals(boardPage.renameBoardButton.getText(), newBoardName);
    }
}
