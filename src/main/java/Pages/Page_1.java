package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_1 {

    private WebDriver driver;

    public Page_1(WebDriver driver) {this.driver = driver;}

    public WebElement ElementfromPort() {return driver.findElement(By.name("fromPort"));}

    public WebElement ElementtoPort() {return driver.findElement(By.name("toPort"));}

    public WebElement EnterToFind() {return driver.findElement(By.cssSelector("body div > input"));}
}
