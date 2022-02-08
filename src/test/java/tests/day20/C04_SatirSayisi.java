package tests.day20;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {
    @Test
    public void test() throws IOException {
        //ülkeler excelindeki Sayfa1 ve Sayfa2 deki satır sayılarını ve kullanılan satır sayılarını bulun
        String path ="src/test/java/resourses/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa2");

        int sayfa2SatirSayisi=sheet.getLastRowNum();
        int sayfa2FizikiKullanılanSatirSayisi=sheet.getPhysicalNumberOfRows();

        System.out.println("2. sayfa satır sayısı : "+sayfa2SatirSayisi);
        System.out.println("Fiziki kullanılan satır sayısı : "+sayfa2FizikiKullanılanSatirSayisi);
    }
}
