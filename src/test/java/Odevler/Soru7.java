package Odevler;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExcerciesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Soru7 {
    @Test
    public void test01() {
    // 1. Tarayıcıyı başlatın
    // 2. 'http://automationexercise.com' url'sine gidin
    Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    AutomationExcerciesPage auto = new AutomationExcerciesPage();

    // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        Assert.assertTrue(auto.anasayfa.isDisplayed());
    // 4. 'Test Vakaları' düğmesine tıklayın
        auto.testVakalari.click();
    // 5. Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayın
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(auto.testSenaryolari.isDisplayed());




    }

}
