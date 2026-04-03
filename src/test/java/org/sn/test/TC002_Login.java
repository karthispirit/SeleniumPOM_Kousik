package org.sn.test;

import org.sn.SeleniumBase.FbBase;
import org.sn.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_Login extends FbBase {

    @BeforeTest
    public void setData(){
        filename = "TC002";
        Url = "https://www.facebook.com/";
    }


    @Test(dataProvider = "data")
    public void loginPage(String [] data){
        LoginPage loginPage = new LoginPage(driver);
        boolean fbLabel = loginPage.logIntoFacebookLabel();
        Assert.assertEquals(fbLabel,true);
        boolean userNameLabel = loginPage.userNameLabel();
        Assert.assertTrue(userNameLabel);
        boolean passwordLabel = loginPage.passwordLabel();
        Assert.assertTrue(passwordLabel);



        new LoginPage(driver).login(data[0],data[1]);

    }
}
