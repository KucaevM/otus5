package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InputClass {
    WebDriver driver;

    public InputClass (){this.driver = driver;}

    public static void ClearSendKeys (WebDriver driver,WebElement element, String text) {

        element.clear();
        element.sendKeys(text);

    }


}
