package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBeforeMethodAfterMethod {
    @Test
    public void AmazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void techproeducationTesti() {
        driver.get("https://techproeducation.com");
    }
}
