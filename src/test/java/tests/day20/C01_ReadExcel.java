package tests.day20;

import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {
        String path="src/test/java/resourses/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row=sheet.getRow(4);
        Cell cell=row.getCell(2);
        System.out.println(cell);
        //indexi 4 olan satırdaki index 2 olan hücrenin Andorra olduğunu test edin
        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);
        //5. index deki satırın 3. index deki hücre bilgisini yazdırın
        row=sheet.getRow(5);
        cell=row.getCell(3);
        System.out.println(cell);


    }
}