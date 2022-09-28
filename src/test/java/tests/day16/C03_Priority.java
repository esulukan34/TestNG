package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBeforeMethodAfterMethod;

public class C03_Priority extends TestBeforeMethodAfterMethod {
    // Testlerimizi calistirirken istedigimiz siraya gore calismasini istersek
    // priority methodunu kullaniriz

    @Test(priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test // priority yazmassak once buna gider
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test(priority = -1)
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }
}
