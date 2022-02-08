package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

public class C01_WindowHandleReusableMethod {
    @Test
    public void test(){
        //https://demoqa.com/browser-windows adresine girelim
        //new tab butonuna basalım
        //new tab a gecip title inin "new tab" olduğunu test edelim

        Driver.getDriver().get("https://demoqa.com/browser-windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//button[@id='tabButton']")).click();

        Set<String> handleSet=Driver.getDriver().getWindowHandles();
        String ikinciSayfaWindowHandle="";
        for (String each:handleSet) {
            if (!each.equals(ilkSayfaWindowHandle))
                ikinciSayfaWindowHandle=each;
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandle);
        String expectedTitle="new tab";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
