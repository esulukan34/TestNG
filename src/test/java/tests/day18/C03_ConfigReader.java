package tests.day18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {

    @Test
    public void test01() {

        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage(); // locate'lere ulasmak icin obje oludturduk
        hmcPage.login.click();

        //test data username: manager
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));
        // test data password : Manager1!
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("hotelPassword"),Keys.ENTER)
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisBasarili.isDisplayed());
        Driver.closeDriver();
/*
        HmcPage hotelMyCampPages = new HmcPage();
        hotelMyCampPages.login.click();

        // Driver.getActions().
        //         click(hotelMyCampPages.username)
        //         .sendKeys(ConfigReader.getProperty("usernameHotel"))
        //         .sendKeys(Keys.TAB)
        //         .sendKeys(ConfigReader.getProperty("passwordHotel"))
        //         .sendKeys(Keys.TAB)
        //         .sendKeys(Keys.ENTER)
        //         .perform();


        hotelMyCampPages.username.sendKeys(ConfigReader.getProperty("usernameHotel"));
        hotelMyCampPages.password.sendKeys(ConfigReader.getProperty("passwordHotel"));
        hotelMyCampPages.submit.click();

        Assert.assertTrue(hotelMyCampPages.girisBasarili.isDisplayed());
*/

    }
}
