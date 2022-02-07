package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelMyCampWebTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_WebTableDinamikLocate {




    HotelMyCampWebTablePage hotelMyCampWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTest() {
        //1. method satır numarası verdiğimde bana o satırdaki dataları yazdırın
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login();
        hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
        WebElement ucuncuSatirElement=hotelMyCampWebTablePage.satirGetir(4);
        System.out.println(ucuncuSatirElement.getText());
    }
    @Test
    public void hucreGetirTest(){
        //2. method satır nı ve data numarası girdiğimde verdğim datayı yazdırsın
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login();
        hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
        WebElement hucreElement=hotelMyCampWebTablePage.hucreWebelementGetir(3,5);
        System.out.println(hucreElement.getText());
        Driver.closeDriver();
    }
    @Test
    public void sutunYazdırTest() {
        //3. method sütun numarası verdiğinde bana tüm sütunu yazdırsın
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login();
        hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
        hotelMyCampWebTablePage.sutunYazdır(3);
        Driver.closeDriver();
    }
}
