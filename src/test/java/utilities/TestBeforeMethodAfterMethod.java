package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBeforeMethodAfterMethod {

    protected WebDriver driver;
    protected Actions actions;
    protected String tarih;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formatter);
        actions = new Actions(driver);
    }
    @AfterMethod
    public void tearDown() {
        //driver.close();
    }
        // utilities package'ında abstract class oluşturduk. Buradaki class'ı Utilites package'ındaki
        // class'a extent yaptik.@Before ve @after methodlarını oradaki class'ta olusturdugumuz icin
        // bu sayfada olusturmamıza gerek kalmadı
}
