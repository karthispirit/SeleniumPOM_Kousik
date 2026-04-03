package org.sn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sn.SeleniumBase.FbBase;

public class LoginPage extends FbBase {


    //locators

    public  LoginPage(RemoteWebDriver driver){
        this.driver = driver;
    }
    public boolean logIntoFacebookLabel(){
        return driver.findElement(By.xpath("//span[normalize-space(text())='Log into Facebook']")).isDisplayed();
    }

    public boolean userNameLabel(){
        return driver.findElement(By.xpath("//label[normalize-space(text())='Email or mobile number']")).isDisplayed();
    }

    public boolean passwordLabel() {
        return driver.findElement(By.xpath("//label[normalize-space(text())='Password']")).isDisplayed();
    }


    //actions

    /**
     * @description - enter the username
     * @param userName - pass the user to be login
     */
    public LoginPage enterUserName(String userName){
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
        return this;

    }

    /**
     * @description - enter the password
     * @param password - pass the password to be login
     */
    public LoginPage enterPassword(String password){
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
        return this;
    }

    /**
     * @description - click login
     */
    public DashBoardPage clickLogin(){

        driver.findElement(By.xpath("//span[normalize-space(text())='Log in']")).click();
        return new DashBoardPage();
    }

    /**
     * @description - forgot password
     */
    public ForgotPasswordPage forgotPassword(){
        driver.findElement(By.xpath("//a[normalize-space(text())='Forgot password?']")).click();
        return new ForgotPasswordPage();
    }

    /**
     * @description - create new account
     */
    public CreateNewAccountPage createNewAccount(){
        driver.findElement(By.xpath("//a[normalize-space(text())='Create new account']")).click();
        return new CreateNewAccountPage();
    }

    /**
     *
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        enterUserName(userName);
        enterPassword(password);
        clickLogin();
    }

}
