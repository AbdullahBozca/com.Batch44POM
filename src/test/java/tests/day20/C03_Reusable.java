package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_Reusable {
    @Test
    public void test(){
        //ülkeler excel indeki Sayfa1 de 11. index deki satırın 2. indexdeki hücresinin Azerbaycan olduğunu test edin
        String path="src/test/java/resourses/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData= ReusableMethodsExcel.hucreGetir(path,"Sayfa1",11,2).getStringCellValue();
        Assert.assertEquals(actualData,expectedData);
    }
}
