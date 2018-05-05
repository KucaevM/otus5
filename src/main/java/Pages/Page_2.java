package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_2{
    private WebDriver driver;

     public Page_2 (WebDriver driver) {this.driver = driver;}

    public WebElement EnterChooseToFind() {return driver.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td:nth-child(2) >input"));}

    public WebElement ElementContainer() {return driver.findElement(By.cssSelector("div.container h3")); }

    public WebElement ElementTextAirlinePage2() {return driver.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td:nth-child(4)"));}

    public WebElement ElementTextFlightPage2() {return driver.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td:nth-child(3)"));}
}
