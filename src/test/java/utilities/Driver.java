package utilities;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Driver {
    /*
    Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin her test method'u icin
    yeni bir pencere(driver) aciyor, eger driver'a bir deger atanmamissa yani driver==null ise bir kere
    driver'i calistir diyerek bir kere if() icini calistiricak ve driver artik 1 kere calistigi icin
    ve deger atandigi icin null olmayacak ve direkt return edecek ve diger testlerimizi ayni driver uzerinde
    calisacak.
     */

    static WebDriver driver;
    static Faker faker;
    static Actions actions;

    static SoftAssert softAssert;

    static Select select;
    static WebElement ddm;

    public static WebDriver getDriver() {  // Webdriver getDriver method
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    } //method son

    public static void closeDriver() { //close Method

        if (driver != null) {
            driver.close(); // driver'a deger atanmissa kapat
            driver = null; // kapandiktan sonraki acmalari garanti altina almak icin driver'a tekrar null yaptik
        }
    }//method son

    public static void quitDriver() { //quit Method
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }//method son

    public static Faker getFaker() { // getFaker method

        return faker = new Faker();
    }

    public static Actions getActions() { //getActions method

        return actions = new Actions(getDriver());
    }

    public static SoftAssert getSoftAssert() { //getSoftAssert method

        return softAssert = new SoftAssert();
    }

    public static Select select(WebElement ddm){ //select method

        return select = new Select(ddm);
    }

}//class