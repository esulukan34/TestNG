package Odevler;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExcerciesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Soru11 {

    @Test
    public void test11() throws InterruptedException {
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        AutomationExcerciesPage auto = new AutomationExcerciesPage();
        SoftAssert softAssert = new SoftAssert();
        // 3. Verify that home page is visible successfully
        softAssert.assertTrue(auto.anasayfa.isDisplayed());
        // 4. Click 'Cart' button
        auto.cart.click();
        // 5. Scroll down to footer
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // 6. Verify text 'SUBSCRIPTION'
        softAssert.assertTrue(auto.subscription.isDisplayed());
        // 7. Enter email address in input and click arrow button
        auto.email.sendKeys(ConfigReader.getProperty("trendyolWrongEmail"), Keys.ENTER);
        Thread.sleep(1000);
        // 8. Verify success message 'You have been successfully subscribed!' is visible
        softAssert.assertTrue(auto.text.isDisplayed());
        softAssert.assertAll();

    }
}
