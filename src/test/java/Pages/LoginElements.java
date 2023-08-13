package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements extends Parent{
    public LoginElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "button[id='onetrust-accept-btn-handler']")
    public WebElement acceptCookie;
    @FindBy(css = "div[class='modal-close']")
    public WebElement closeButton;
    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement login;
    @FindBy(css = "#login-email")
    public WebElement email;
    @FindBy(id="login-password-input")
    public WebElement password;
    @FindBy(css="button[type='submit']")
    public WebElement LOGIN;
    @FindBy(xpath="//p[text()='Hesabım']")
    public WebElement verifyLogin;

    public WebElement getWebElement(String str){
        switch (str)
        {
            case "closeButton" : return closeButton;
            case "acceptCookie" : return acceptCookie;
            case "login" : return login;
            case "email" : return email;
            case "password" : return password;
            case "LOGIN" : return LOGIN;
            case "verifyLogin" : return verifyLogin;
        }
        return null;
    }

}
