package MyPackage.tests.pac;

import MyPackage.tests.BaseTest;
import Pages.PageWomen;
import Pages.pageLogin;
import org.testng.annotations.Test;

public class WomenTest  extends BaseTest {
    @Test
    public void test()  {
        driver.get("http://automationpractice.com/index.php");

        PageWomen pageWomen = new PageWomen();
        pageWomen.moveToElementButtonWomen();
        pageWomen.waitListWomenIsDisplayed();
        pageWomen.ClickTshirtsElement();
        pageWomen.waitCenterColumnIsDisplayed();

}
}