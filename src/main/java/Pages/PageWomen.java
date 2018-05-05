package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverManager;

public class PageWomen {
    private final static By BUTTON_WOMEN = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private final static By LIST_WOMEN = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > ul");
    private final static By TSHIRTS = By.cssSelector("li ul [title ='T-shirts']");
    private final static By CENTER_COLUMN = By.cssSelector("div#center_column");


    public void moveToElementButtonWomen() {

        WebElement ButtonWomenElement = WebDriverManager.getInstance().findElement(BUTTON_WOMEN);
        Actions actions = new Actions(WebDriverManager.getInstance());

        actions.moveToElement(ButtonWomenElement).build().perform();
    }

    public void waitListWomenIsDisplayed(){
        WebElement ListWomenElement = WebDriverManager.getInstance().findElement(LIST_WOMEN);
        new WebDriverWait(WebDriverManager.getInstance(),10).until(ExpectedConditions.visibilityOf(ListWomenElement));

    }


    public void ClickTshirtsElement() {
        WebElement TshirtsElement = WebDriverManager.getInstance().findElement(TSHIRTS);
        TshirtsElement.click();

    }

    public void waitCenterColumnIsDisplayed(){
        WebElement CenterColumnElement = WebDriverManager.getInstance().findElement(CENTER_COLUMN);
        new WebDriverWait(WebDriverManager.getInstance(),10).until(ExpectedConditions.visibilityOf(CenterColumnElement));

    }


}
