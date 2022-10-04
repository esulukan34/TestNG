package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class HepsiBuradaPage {

    public HepsiBuradaPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div//ul//li//span[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[1]")
    public WebElement elektronics;


    @FindBy(xpath = "((//div//ul//li//div[@class='sf-MenuItems-LuiGWKGCzrRUM4_iLEgn'])[1]//div//ul//a)[1]")
    public WebElement bilgisayarTablet;

    @FindBy(xpath = "((//div//ul//li//div[@class='sf-MenuItems-LuiGWKGCzrRUM4_iLEgn'])[1]//div//ul//div)[1]//ul//li//a")
    public List<WebElement> bilgisayarTableAlt;

    @FindBy(xpath = "((//div//ul//li//div[@class='sf-MenuItems-LuiGWKGCzrRUM4_iLEgn'])[1]//div//ul//div)[1]//ul//li//ul//a")
    public List<WebElement> tableBilgisyarAlt2;
}