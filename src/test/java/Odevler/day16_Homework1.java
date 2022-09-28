package Odevler;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class day16_Homework1 extends TestBaseBeforeClassAfterClass {
    @Test (priority = 1)
    public void sayfayaGit() {
        //2) https://www.youtube.com adresine gidin
        //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        driver.get("https://www.youtube.com");
    }
    @Test (priority = 4)
    public void searchBoxTest() {
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='search'])[3]")).isEnabled());
    }

    @Test (priority = 2)
    public void titleTest() {
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String ecpectedTitle ="YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(ecpectedTitle,actualTitle);
    }
    @Test (priority = 3)
    public void imageTest() {
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed());
    }
    @Test (priority = 5)
    public void wrongTitleTest() {
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertFalse(driver.getTitle().contains("youtube"));
    }
}




