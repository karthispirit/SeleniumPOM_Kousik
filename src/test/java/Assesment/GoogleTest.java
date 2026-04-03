package Assesment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sn.SeleniumBase.Browser;
import org.sn.SeleniumBase.Locators;
import org.sn.SeleniumBase.SeleniumBase;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase {

    @Test
    public void googleSearch() throws InterruptedException {
        setUp(Browser.CHROME, "https://www.google.com/");
        WebElement ele = element(Locators.name, "q");
        typeAndEnter(ele,"IPL", Keys.ENTER);
        Thread.sleep(3000);
        quit();

    }


}
