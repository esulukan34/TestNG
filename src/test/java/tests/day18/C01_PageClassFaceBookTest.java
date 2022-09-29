package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFaceBookTest {
    @Test
    public void test01() {
        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        // POM’a uygun olarak email, sifre kutularini ve giris yap
        // butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();
        // Faker class’ini kullanarak email ve sifre degerlerini
        Faker faker = new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.login.sendKeys(Keys.ENTER);
        // yazdirip, giris butonuna basin
        // Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.hataliGiris.isDisplayed());

    }

}
