package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolPozitifTest {
    @Test
    public void pozitifTest() throws InterruptedException {
        // https://www.trendyol.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("trdyolUrl"));
        TrendyolPage trendyolPage = new TrendyolPage();
        Driver.getDriver().navigate().refresh();
        // login butonuna bas
        trendyolPage.giris.click();
        Thread.sleep(1000);

        //test data username: matcode3460@gmail.com
        trendyolPage.email.sendKeys(ConfigReader.getProperty("trendyolTrueMail"));

        // test data password : Manager1!
        trendyolPage.password.sendKeys(ConfigReader.getProperty("trendyolTruePassword"),Keys.ENTER);

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(trendyolPage.basariliGiris.isDisplayed());

        // Nutella aratiniz
        Thread.sleep(1000);
        //Driver.getDriver().findElement(By.xpath("//*[@id='container']")).click();
        //Thread.sleep(1000);
        trendyolPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        // ilk siradaki urunu sepete ekleyin
        trendyolPage.ilkUrun.click();
        // sepete gidip urunun sepete eklendigini test edin
        trendyolPage.sepet.click();
        Assert.assertTrue(trendyolPage.sepetKontrol.isDisplayed());

    }
}
