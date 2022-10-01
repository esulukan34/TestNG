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
    public WebElement userName;

    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(css="#btnSubmit")
    public WebElement submit;

    @FindBy(css = ".username.username-hide-on-mobile")
    public WebElement girisBasarili;

    @FindBy(xpath = "//*[@class='validation-summary-errors']")
    public WebElement hataliGiris;

    @FindBy (xpath = "(//*[@class='title'])[3]")
    public WebElement hotelManagement;

    @FindBy (xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(css = ".hidden-480")
    public WebElement addRoom;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy(xpath ="(//*[@type='button'])[8]")
    public WebElement okButonu;

}
