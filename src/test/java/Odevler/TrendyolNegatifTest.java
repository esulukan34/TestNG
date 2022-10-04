package Odevler;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolNegatifTest {
    @Test
    public void trendyolNegatifTest() {
        // 1 ) Bir Class olustur : NegativeTest
        // 2) Bir test method olustur NegativeLoginTest()
        // https://www.trendyol.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("trdyUrl"));
        Driver.getDriver().navigate().refresh();
        TrendyolPage trendyolPage = new TrendyolPage();
        // login butonuna bas
        trendyolPage.giris.click();
        // test data email: manager1@gmail.com
        trendyolPage.email.sendKeys(ConfigReader.getProperty("trendyolWrongEmail"));
        // test data password : manager1!
        trendyolPage.password.sendKeys(ConfigReader.getProperty("trendyolWrongPassword"), Keys.ENTER);
        // Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(trendyolPage.hataliGiris.isDisplayed());
        Driver.closeDriver();
    }


}
