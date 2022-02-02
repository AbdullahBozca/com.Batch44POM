package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
    @Test
    public void test(){
        //amazon a gidelim
        Driver.getDriver().get("https://amazon.com");
        //amazona gittiğimizi test edelim
        String actualTitles = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitles.contains("Amazon"));
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //besybuy ana sayfaya gidelim
        Driver.getDriver().get("https://bestbuy.com");
        //bestbuy a gittiğimizi test edelim
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("best"));
        Driver.closeDriver();
    }
}
