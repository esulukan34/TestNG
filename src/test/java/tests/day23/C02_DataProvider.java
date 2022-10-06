package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_DataProvider extends TestBaseRapor {
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"emre@gmail.com","12345"},{"emre1@gmail.com","123566"},{"emre2@gmail.com","9876543"}};
    }
    BrcPages brc = new BrcPages();

    @Test(dataProvider = "kullanicilar")
    public void test01(String userEmail,String password) {
        extentTest=extentReports.createTest("NegatifTest","Gecerli olmayan kullanici adi ve password ile giris yapildi");
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");
        //login butonuna bas
        brc.login.click();
        extentTest.info("login butonuna basildi");
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        brc.email.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password)
                //login butonuna tiklayin
                .sendKeys(Keys.ENTER).perform();
        extentTest.info("yanlis kullanici email ve password girildi ");
        extentTest.info("Ikinci login butonuna basildi");
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.login.isDisplayed());
        extentTest.pass("Sayfaya girilemedigi test edildi");


    }
}
