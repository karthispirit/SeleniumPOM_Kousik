package org.sn.SeleniumBase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumAPI {

    /**
     * @param url
     */
    void setUp(String url);

    /**
     *
     * @param browserName
     * @param url
     */
    void setUp(Browser browserName, String url);

    void close();

    void quit();

    /**
     * This method is used to find the web element
     * @param type
     * @return
     */
    WebElement element(Locators type, String value);

    /**
     *
     * @param i
     */
    void switchToWindow(int i);

    /**
     *
     * @param ele
     * @param value
     */
    void selectValue(WebElement ele, String value);

    /**
     *
     * @param ele
     * @param text
     */
    void selectText(WebElement ele, String text);

    /**
     *
     * @param ele
     * @param position
     */
    void selectIndex(WebElement ele, int position);

    /**
     *
     * @param ele
     */
    void click(WebElement ele);

    /**
     *
     * @param ele
     */
    void type(WebElement ele, String testData);

    /**
     *
     * @param ele
     */

    /**
     *
     * @param ele
     * @param testData
     */
    public void typeAndEnter(WebElement ele, String testData, Keys keys);


    /**
     *
     * @param ele
     * @param testData
     */
    void appendText(WebElement ele, String testData);


    String getTitle();
    /**
     *
     * @return
     */
    String getURL();


    /**
     *
     * @return
     */
    boolean isDisplayed(WebElement ele);

    /**
     *
     * @return
     */
    boolean isEnabled(WebElement ele);

    /**
     * @return
     */
    boolean isSelected(WebElement ele);

}
