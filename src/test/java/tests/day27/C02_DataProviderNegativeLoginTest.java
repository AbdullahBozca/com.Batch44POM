package tests.day27;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTest {

    @DataProvider
    public static Object[][] wrongUserList() {
        String liste[][]={{"manager11","manager11"},{"manager12","manager12"},{"manager13","manager13"}};
        return liste;
    }

    @Test(dataProvider = "wrongUserList")
    public void yanlisSifreKullanici(String wrongUserName,String wrongUserPassword) {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty(wrongUserName));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty(wrongUserPassword));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }
}
