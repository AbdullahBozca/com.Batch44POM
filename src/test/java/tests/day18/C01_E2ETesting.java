package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class C01_E2ETesting {
    @Test
    public void createHotel() {
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //    a. Username : manager
        //    b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.hotelManegement.click();
        hotelMyCampPage.hotelList.click();
        hotelMyCampPage.addHotel.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMyCampPage.bekle(2);
        actions.click(hotelMyCampPage.codeBox).
                sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
                sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.address().country()).sendKeys(Keys.TAB).

                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).

                sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).

                perform();

        Select select=new Select(hotelMyCampPage.IDGroupSelect);
        select.selectByIndex(1);
        //8. Save butonuna tıklayın.

        hotelMyCampPage.saveButton.click();
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(hotelMyCampPage.actualAllertText.getText(),"Hotel was inserted successfully","Testler aynı değil");
        //10. OK butonuna tıklayın.
        hotelMyCampPage.actualAllertButton.click();
        Driver.closeDriver();
    }
}
