package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class DemoQaPage {
    public DemoQaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void baglan() {
        Driver.getDriver().get(ConfigReader.getProperty("DemoQaUrl"));
    }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslıkSatiriElementi;


    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> basliklarWebelementiListesi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekElement;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tumDataWebeElementList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tumSatirlerWebeElementList;


    public void sutunYazdır(int sutun) {
        //((//div[@class='rt-tr-group'])[1]//div[@class='rt-td'])[1]
        String dynamicXpath;
        WebElement geciciElement;
        for (int i = 1; i <= tumSatirlerWebeElementList.size(); i++) {
            dynamicXpath = "((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+sutun+"]";
            geciciElement=Driver.getDriver().findElement(By.xpath(dynamicXpath));
            System.out.println(geciciElement.getText());
        }
    }

    public void ismeGoreMaasYazdir(String kierra) {
        int satirSayisi=tumSatirlerWebeElementList.size();
        String dynamicXpath;
        String isim;
        String salary;
        for (int i=1;i<=satirSayisi;i++){
            dynamicXpath = "((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+1+"]";
            isim=Driver.getDriver().findElement(By.xpath(dynamicXpath)).getText();
            dynamicXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+5+"]";
            salary=Driver.getDriver().findElement(By.xpath(dynamicXpath)).getText();
            if (isim.equals("Kierra"))
                System.out.println("Maas : "+salary);
        }
    }

    public void hucreYazdır(int satir, int sutun) {
        String dynamicXpath="((//div[@class='rt-tr-group'])["+satir+"]//div[@class='rt-td'])["+sutun+"]";
        WebElement hucreElement=Driver.getDriver().findElement(By.xpath(dynamicXpath));
        System.out.println("Hücre bilgisi : "+hucreElement.getText());
    }
}
