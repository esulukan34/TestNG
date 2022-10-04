package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        // hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        // Ve sayfasının resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");
        // Sayfayi kapatınız
        Driver.closeDriver();

    }

    @Test
    public void test02() throws IOException, InterruptedException {
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amazonPage = new AmazonPage();
        // Nutella aratiniz
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        Thread.sleep(1000);
        //Arama sonuc yazisi WebElementinin resmini aliniz
        ReusableMethods.getScreenshotWebElement("nutella",amazonPage.aramaSonucWE);
        Driver.closeDriver();
    }
}
