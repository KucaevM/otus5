package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_4  {
    private WebDriver driver;

    public Page_4 (WebDriver driver) {this.driver = driver;}

    public WebElement ElementActualText() {return  driver.findElement(By.cssSelector("div.container h1"));}
    public WebElement ElementId() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[1]/td[2]"));}
    public WebElement ElementStatus() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[2]/td[2]"));}
    public WebElement ElementAmount() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[3]/td[2]"));}
    public WebElement ElementCardNumber() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[4]/td[2]"));}
    public WebElement ElementExpiration() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[5]/td[2]"));}
    public WebElement ElementAuthCode() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[6]/td[2]"));}
    public WebElement ElementDate() {return  driver.findElement(By.xpath("/html/body/div[2]//tr[7]/td[2]"));}
}
