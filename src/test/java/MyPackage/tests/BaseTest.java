package MyPackage.tests;


import Pages.Page_1;
import Pages.Page_2;
import Pages.Page_3;
import Pages.Page_4;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverManager;

public  class BaseTest {

    protected WebDriver driver;

    public Page_1 page1;
    public Page_2 page2;
    public Page_3 page3;
    public Page_4 page4;

    @BeforeClass
    public void BeforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/FirstTest/chromedriver.exe");
        System.setProperty("webdriver.ie.driver","C:/Program Files (x86)/FirstTest/IEDriverServer.exe");

        driver = WebDriverManager.getInstance();
        page1 = new Page_1(driver);
        page2 = new Page_2(driver);
        page3 = new Page_3(driver);
        page4 = new Page_4(driver);
    }



    @AfterClass
    public void AfterClass() {

       driver.quit();
    }
}