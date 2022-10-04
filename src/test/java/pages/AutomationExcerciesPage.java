package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExcerciesPage {
    public AutomationExcerciesPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(css = "#header")
    public WebElement anasayfa;

    @FindBy(xpath = "(//*[@class='fa fa-list'])[1]")
    public WebElement testVakalari;

    @FindBy(css = ".col-sm-9.col-sm-offset-1")
    public WebElement testSenaryolari;

    @FindBy (xpath = "(//*[@class='fa fa-shopping-cart'])[1]")
    public WebElement cart;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscription;

    @FindBy(css = "#susbscribe_email")
    public WebElement email;

    @FindBy(xpath = "//div[@id='success-subscribe']")
    public WebElement text;
}
