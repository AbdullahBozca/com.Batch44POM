package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelMyCampWebTablePage;

import java.util.ArrayList;
import java.util.List;

public class C02_WebTable {
    HotelMyCampPage hotelMyCampPage;
    HotelMyCampWebTablePage hotelMyCampWebTablePage;
    @Test
    public void login(){
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login();
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!

    }
    @Test
    public void table() {
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
        List<WebElement> headerDataList = hotelMyCampWebTablePage.headerBirinciSatirDatalar;
        System.out.println("Tablodaki sütun sayısı : "+headerDataList.size());

        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        System.out.println(hotelMyCampWebTablePage.tumBodyWebElement.getText());

    }
    @Test
    public void printRows() {

        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
    }
}
