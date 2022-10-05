package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPages {
    public BrcPages() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(css = ".btn.btn-primary.btn-sm")
    public WebElement login;

    @FindBy(css = "#formBasicEmail")
    public WebElement email;

    @FindBy(css = "#formBasicPassword")
    public WebElement password;

    @FindBy(css = "#dropdown-basic-button")
    public WebElement basariliGiris;



}
