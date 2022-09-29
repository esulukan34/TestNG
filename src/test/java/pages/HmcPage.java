package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "#navLogon")
    public WebElement login;

    @FindBy(css = "#UserName")
    public WebElement username;

    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(css="#btnSubmit")
    public WebElement submit;

    @FindBy(css = ".username.username-hide-on-mobile")
    public WebElement girisBasarili;
}
