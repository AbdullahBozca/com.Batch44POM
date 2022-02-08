package tests.smoke_test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
    //1) com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()
    @Test
    public void positiveLoginTest(){
        //         https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        //        login butonuna bas
        hotelMyCampPage.IlkLoginLink.click();
        //test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        //test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.listOfUsers.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();

    }

}
