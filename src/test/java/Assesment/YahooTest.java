package Assesment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sn.SeleniumBase.Browser;
import org.sn.SeleniumBase.Locators;
import org.sn.SeleniumBase.SeleniumBase;
import org.testng.annotations.Test;

public class YahooTest extends SeleniumBase {

    @Test
    public void yahooSearch() throws InterruptedException {
        setUp(Browser.CHROME,"https://yahoo.com/");
        WebElement element = element(Locators.id, "uh-sbq");
        typeAndEnter(element,"IPL", Keys.ENTER);
        Thread.sleep(5000);
        System.out.println(getURL());
        quit();

    }
}
