package Odevler;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class E2E_TestHotelMyCamp {
    @Test
    public void E2Etest() throws InterruptedException {
        //Tests packagenin altına class olusturun: CreateHotel
        //Bir metod olusturun: createHotel
        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();
        Faker faker = new Faker();
        //Login butonuna tıklayın.
        hmcPage.login.click();
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelPassword"))
                .sendKeys(Keys.ENTER).perform();

        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hmcPage.hotelManagement.click();
        hmcPage.roomReservation.click();
        hmcPage.addRoom.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hmcPage.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB)
                .sendKeys("Pirlanta")
                .sendKeys(Keys.TAB).sendKeys("1500")
                .sendKeys(Keys.TAB)
                .sendKeys("10/02/2022").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("10/14/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("2").sendKeys(Keys.TAB)
                .sendKeys("2").sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys("asdfgghfdsgh")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                //Save butonuna tıklayın.
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(1000);
        Assert.assertTrue(hmcPage.roomReservationText.isDisplayed());
        //OK butonuna tıklayın.
        hmcPage.okButonu.click();
        Driver.getDriver().close();


    }
}

