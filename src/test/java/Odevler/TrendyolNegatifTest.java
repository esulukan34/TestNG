package Odevler;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolNegatifTest {
    @Test
    public void trendyolNegatifTest() throws InterruptedException {
        // 1 ) Bir Class olustur : NegativeTest
        // 2) Bir test method olustur NegativeLoginTest()
        // https://www.trendyol.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("trdyolUrl"));
        TrendyolPage trendyolPage = new TrendyolPage();
        Driver.getDriver().navigate().refresh();
        // login butonuna bas
        trendyolPage.giris.click();
        // test data username: manager1
        trendyolPage.email.sendKeys(ConfigReader.getProperty("trendyolWrongMail"));
        // test data password : manager1!
        trendyolPage.password.sendKeys(ConfigReader.getProperty("trendyolWrongPassword"), Keys.ENTER);
        // Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(trendyolPage.hataliGiris.isDisplayed());
        Thread.sleep(2000);
        Driver.closeDriver();
    }

}
