package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_3  {
    private WebDriver driver;

    public Page_3 (WebDriver driver) {this.driver = driver;}

    public WebElement EnterToBtn() {return  driver.findElement(By.cssSelector("div [class = 'btn btn-primary']"));}
    public WebElement ElementInputName() {return driver.findElement(By.cssSelector("#inputName"));}
    public WebElement ElementAddress() {return driver.findElement(By.cssSelector("#address"));}
    public WebElement ElementCity() {return driver.findElement(By.cssSelector("#city"));}
    public WebElement ElementState() {return driver.findElement(By.cssSelector("#state"));}
    public WebElement ElementZipCode() {return driver.findElement(By.cssSelector("#zipCode"));}
    public WebElement ElementСardType() {return driver.findElement(By.cssSelector("#cardType"));}
    public WebElement ElementCreditCardNumber() {return driver.findElement(By.cssSelector("#creditCardNumber"));}
    public WebElement ElementCreditCardMonth() {return driver.findElement(By.cssSelector("#creditCardMonth"));}
    public WebElement ElementCreditCardYear() {return driver.findElement(By.cssSelector("#creditCardYear"));}
    public WebElement ElementNameOnCard() {return driver.findElement(By.cssSelector("#nameOnCard"));}

    public WebElement ElementTextAirlinePage3() {return  driver.findElement(By.cssSelector("div.container p:nth-child(2)"));}
    public WebElement ElementTextFlightPage3() {return  driver.findElement(By.cssSelector("div.container p:nth-child(3)"));}
}
