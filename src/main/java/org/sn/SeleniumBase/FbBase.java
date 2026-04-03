package org.sn.SeleniumBase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sn.utils.ReadExcel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.time.Duration;

public class FbBase {

    public String Url = "";
    public  RemoteWebDriver driver;
    public String filename ="";


    @BeforeMethod
    public void startApp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get(Url);
    }

    @DataProvider(name = "data")
    public String[][] dataProvider() throws IOException {
        String[][] excelData = ReadExcel.getExcelData(filename);
        return excelData;
    }
    @AfterMethod
    public void closeApp(){
        driver.quit();

    }
}
