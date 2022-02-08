package tests.smoke_test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    @Test
    public void yanlisSifre(){
        //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
        //3 Farkli test Methodunda 3 senaryoyu test et
        //                - yanlisSifre
        //                - yanlisKulllanici
        //                - yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }
    @Test
    public void yanlisKulllanici(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }
    @Test
    public void yanlisSifreKullanici(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }

}
