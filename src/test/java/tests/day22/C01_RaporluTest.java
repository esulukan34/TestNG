package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */
    BrcPages brc = new BrcPages();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() {
        extentTest=extentReports.createTest("PozitifTest","Gecerli kullanici adi ve password ile giris yapildi" );
        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");
        // login butonuna bas
        brc.login.click();
        extentTest.info("login butonuna basildi");
        //test data user email: customer@bluerentalcars.com
        brc.email.sendKeys(ConfigReader.getProperty("brcUserEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("brcPassword")).sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru kullanici email ve password girildi");
        extentTest.info("Ikinci login butonuna basildi");
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brc.basariliGiris.isDisplayed());
        extentTest.pass("Sayfaya basarili sekilde girildi");

    }
}
