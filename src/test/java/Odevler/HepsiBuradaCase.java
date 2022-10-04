package Odevler;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.Rm;
import java.io.IOException;

public class HepsiBuradaCase {

    HepsiBuradaPage page;

    @Test
    public void hepsiburda() throws IOException {

        // Hepsiburada sayfasına gidiniz
        // Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        // Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        // Sayfayı kapatalım
        page = new HepsiBuradaPage();

        Driver.getDriver().get(ConfigReader.getProperty("hpsbrdUrl"));

        Rm.getActions().moveToElement(page.elektronics).perform();
        Rm.waitFor(1);

        Rm.getActions().moveToElement(page.bilgisayarTablet).perform();

        int count = 1;
        for (int i = 0; i < page.bilgisayarTableAlt.size() ; i++) {

            Rm.waitFor(1);
            page.bilgisayarTableAlt.get(i).click();

            Rm.getActions().sendKeys(Keys.PAGE_DOWN).perform();

            ReusableMethods.getScreenshot("link" + count);
            count++;
            Driver.getDriver().navigate().back();

            Rm.waitFor(1);
            ilk2Tik();
            Rm.waitFor(2);
        }
    }
    public void ilk2Tik(){
        Rm.getActions().moveToElement(page.elektronics).perform();
        Rm.waitFor(1);

        Rm.getActions().moveToElement(page.bilgisayarTablet).perform();
        Rm.waitFor(1);
    }
}