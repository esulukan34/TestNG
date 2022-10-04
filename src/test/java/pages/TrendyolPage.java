package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {

    public TrendyolPage(){PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[@class='link-text'])[1]")
    public WebElement giris;

    @FindBy(css = "#login-email")
    public WebElement email;

    @FindBy(css = "#login-password-input")
    public WebElement password;

    @FindBy(xpath = "//*[@class='message']")
    public WebElement hataliGiris;

    @FindBy(xpath = "(//*[@class='link-text'])[1]")
    public WebElement basariliGiris;

    @FindBy(css = ".vQI670rJ")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//*[@class='add-to-bs-tx'])[2]")
    public WebElement ilkUrun;

    @FindBy(xpath = "(//*[@class='link-text'])[3]")
    public WebElement sepet;

    @FindBy(xpath = "(//*[@class='pb-item'])")
    public WebElement sepetKontrol;





}
