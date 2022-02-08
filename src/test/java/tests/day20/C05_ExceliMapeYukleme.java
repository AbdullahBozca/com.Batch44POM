package tests.day20;

import org.testng.annotations.Test;

public class C05_ExceliMapeYukleme {
    @Test
    public void test(){
        //dosya yolu ve sayfa ismi verilen bir excel sheet i map olarak kaydedeb reusable method oluşturalım
        String path ="src/test/java/resourses/ulkeler.xlsx";
        String sayfaIsim="Sayfa1";
        System.out.println(ReusableMethodsExcel.mapOlustur(path, sayfaIsim));
    }


}
