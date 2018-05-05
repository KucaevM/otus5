package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WebDriverManager;


public class pageLogin {

    private final static By BUTTON_LOGIN = By.cssSelector("[class = 'btn btn-primary']");


    private WebElement getLoginElement() {
        return WebDriverManager.getInstance().findElement(BUTTON_LOGIN);
    }

    public int getSizeLoginHeight(){
        return getLoginElement().getSize().height;
    }
    public int getSizeLoginWidth(){
        return getLoginElement().getSize().width;
    }

    public Dimension getSizeLogin(){
        return getLoginElement().getSize();
    }
    public String getBackgroundColorLogin() {
        return getLoginElement().getCssValue("background-color");
    }

    public void moveToElementLogin() {

        Actions actions = new Actions(WebDriverManager.getInstance());
        actions.moveToElement(getLoginElement()).build().perform();
    }
}
