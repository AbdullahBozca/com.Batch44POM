package tests.day19;

import org.testng.annotations.Test;
import pages.DemoQaPage;

public class C02_WebTableDemoQa {
    //Bir Class olusturun D19_WebtablesHomework


    @Test
    public void demo_qa_page_test() {
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        DemoQaPage demoQaPage=new DemoQaPage();
        demoQaPage.baglan();
        //  2. Headers da bulunan department isimlerini yazdirin
        System.out.println(demoQaPage.baslıkSatiriElementi.getText());
        //  3. 3.sutunun basligini yazdirin
        System.out.println("3. sütun başlığı : "+demoQaPage.basliklarWebelementiListesi.get(2).getText());
        //  4. Tablodaki tum datalari yazdirin
        System.out.println("=============tüm body===========\n" +
                        demoQaPage.bodyTekElement.getText());
        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("=========tablodaki data sayısı==========\n"+demoQaPage.tumDataWebeElementList.size());
        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("============tablodaki satır sayısı==========\n"+demoQaPage.tumSatirlerWebeElementList.size());
        //  7. Tablodaki sutun sayisini yazdirin
        System.out.println("=========tablodaki sütun sayısı=========\n"+(demoQaPage.tumDataWebeElementList.size() / demoQaPage.tumSatirlerWebeElementList.size()));
        //System.out.println(demoQaPage.basliklarWebelementiListesi.size());
        //  8. Tablodaki 3.kolonu yazdirin
        demoQaPage.sutunYazdır(3);
        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoQaPage.ismeGoreMaasYazdir("Kierra");
        //  10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        demoQaPage.hucreYazdır(3,2);
    }
}
