package MyPackage.tests.pac;


import Elements.InputClass;
import Elements.SelectClass;
import MyPackage.tests.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


    public class FirstTest extends BaseTest {


        @Test
        public void test()  {

            driver.get("http://blazedemo.com/index.php");

            //Страница 1

            SelectClass.SelectMetod(driver, page1.ElementfromPort(),"Boston");
            SelectClass.SelectMetod(driver, page1.ElementtoPort(),"Rome");
            page1.EnterToFind().click();

            //Страница 2

            assertTrue(page2.ElementContainer().isDisplayed());
            assertEquals(page2.ElementContainer().getText(), "Flights from Boston to Rome:","Ошибка Flights from");

            String TextAirlinePage2 = "Airline: " + page2.ElementTextAirlinePage2().getText();
            String TextFlightPage2 = "Flight Number: " + page2.ElementTextFlightPage2().getText();

            page2.EnterChooseToFind().click();

            //Страница 3

            assertEquals(page3.ElementTextAirlinePage3().getText(), TextAirlinePage2,"Ошибка TextAirline");
            assertEquals(page3.ElementTextFlightPage3().getText(), TextFlightPage2,"Ошибка TextFlight");

            page3.ElementInputName().sendKeys("Вася");
            page3.ElementAddress().sendKeys("address");
            page3.ElementCity().sendKeys("city");
            page3. ElementState().sendKeys("state");
            page3.ElementZipCode().sendKeys("123");
            SelectClass.SelectMetod(driver, page3.ElementСardType(),"amex");
            page3.ElementCreditCardNumber().sendKeys("4123");
            InputClass.ClearSendKeys(driver, page3.ElementCreditCardMonth(),"12");
            InputClass.ClearSendKeys(driver, page3.ElementCreditCardYear(),"2018");
            page3.ElementNameOnCard().sendKeys("Vasia");
            page3.EnterToBtn().click();


            //Страница4

            assertEquals(page4.ElementActualText().getText(), "Thank you for your purchase today!","Ошибка ActualText Page4");
            assertTrue(page4.ElementId().isDisplayed());
            assertTrue(page4.ElementStatus().isDisplayed());
            assertTrue(page4.ElementAmount().isDisplayed());
            assertEquals(page4.ElementAmount().getText(), "USD","Ошибка USD Page4");
            assertTrue(page4.ElementCardNumber().isDisplayed());
            assertEquals(page4.ElementCardNumber().getText(), "xxxxxxxxxxxx4123","Ошибка CardNumber Page4");
            assertTrue(page4.ElementExpiration().isDisplayed());
            assertEquals(page4.ElementExpiration().getText(), "12 /2018","Ошибка Expiration Page4");
            assertTrue(page4.ElementAuthCode().isDisplayed());
            assertTrue(page4.ElementDate().isDisplayed());



        }

    }

