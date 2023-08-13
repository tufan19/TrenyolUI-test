package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentElements extends Parent {

    public ContentElements() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement searchInput;
    @FindBy(xpath = "//i[@data-testid='search-icon']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[text()='Apple']")

    public WebElement blank;
    @FindBy(xpath = "//div[text()='Ram (Sistem Belleği)']")
    public WebElement ramButton;

    @FindBy(xpath = "//div[text()='16 GB']")
    public WebElement ram;


      @FindBy(css = "[class='fltr-item-text chckd ctgry']")
    public WebElement laptopVerify;


    @FindBy(xpath = "//*[text()='Abra A5 V17.3.4 Intel Core i7 11800H 32GB RAM 1 TB SSD RTX 3050 Ti FreeDOS 15,6 inç FHD 144 Hz']")
    public WebElement laptop1;

    @FindBy(css = "[data-fragment-name='Search']")
    public WebElement bosluk;

    @FindBy(id = "basket-app-container")
     public WebElement bosluk1;

    @FindBy(xpath = "//div[text()='Sepete Ekle']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//*[text()='Sepetim']")
    public WebElement sepeteGit;

    @FindBy(xpath = "//*[text()='Ürün Sepete Eklendi!']")
    public WebElement sepetDogrulama;


    @FindBy(css = "[class='pb-basket-item-removed-item-information-label single']")
    public WebElement urunKaldirildi;

    @FindBy(xpath = "(//*[@class='i-trash'])[1]")
    public WebElement deletebutton;

    public WebElement getWebElement(String str){

        switch (str){
            case "searchInput" : return searchInput;
            case "searchButton" : return searchButton;
            case "ramButton" : return ramButton;
            case "ram" : return ram;
            case "laptop1" : return laptop1;
            case "laptopVerify" : return laptopVerify;
            case "bosluk" : return bosluk;
            case "bosluk1" : return bosluk1;
            case "sepeteEkle" : return sepeteEkle;
            case "sepeteGit" : return sepeteGit;
            case "sepetDogrulama" : return sepetDogrulama;
            case "deletebutton" : return deletebutton;
            case "urunKaldirildi" : return urunKaldirildi;
        }
        return null;
    }

}
