package MyPackage.tests.pac;

import MyPackage.tests.BaseTest;
import Pages.pageLogin;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestLogin extends BaseTest {

    @Test
    public void test()  {

        driver.get("http://blazedemo.com/login");
        pageLogin pagelogin = new pageLogin();
       // int LoginHeight_1 = pagelogin.getSizeLoginHeight();
       // int LoginWidth_1 = pagelogin.getSizeLoginWidth();
        Dimension loginSize  = pagelogin.getSizeLogin();

        pagelogin.moveToElementLogin();

        assertEquals(pagelogin.getBackgroundColorLogin(),"rgba(37, 121, 169, 1)","Цвет кнопки Логин не верный!");

        assertEquals(loginSize ,pagelogin.getSizeLogin(),"Размеры кнопки Логин изменилась!");
        //assertEquals(LoginHeight_1 ,pagelogin.getSizeLoginHeight(),"Высота кнопки Логин изменилась!");
        //assertEquals(LoginWidth_1 ,pagelogin.getSizeLoginWidth(),"Ширина кнопки Логин изменилась!");

    }





}
