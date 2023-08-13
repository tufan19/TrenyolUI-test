package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import Pages.ContentElements;

import java.util.List;
import java.util.Set;

import static Utilities.BaseDriver.driver;

public class SearchSteps {
    ContentElements ce = new ContentElements();

    @Then("Click on the element in Content")
    public void clickOnTheElementInContent(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = ce.getWebElement(strButton);
            ce.clickFunction(element);
        }


    }

    @When("Send keys to input in website")
    public void sendKeysToInputInWebsite(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = ce.getWebElement(items.get(i).get(0));
            ce.sendKeysFunction(element, items.get(i).get(1));
        }


    }

    @Then("The searched text should appear")
    public void theSearchedTextShouldAppear() {
         ce.verifyContainsTextFunction(ce.laptopVerify, "Laptop");


    }



    @And("Select Product and Add to Cart")
    public void selectProductAndAddToCart() {
        ce.clickFunction(ce.getWebElement("bosluk"));
        ce.waitUntilVisible(ce.getWebElement("laptop1"));
        ce.clickFunction(ce.getWebElement("laptop1"));


        String anaPencere = driver.getWindowHandle();
        Set<String> pencereTanitimcilar = driver.getWindowHandles();

        for (String pencereTanitimci : pencereTanitimcilar) {
            if (!pencereTanitimci.equals(anaPencere)) {
                driver.switchTo().window(pencereTanitimci);

                ce.clickFunction(ce.getWebElement("sepeteEkle"));

            }
        }
    }

    @Then("Verify Product Added to Cart")
    public void verifyProductAddedToCart() {

        ce.verifyContainsTextFunction(ce.getWebElement("sepetDogrulama"),"Ürün Sepete Eklendi");
    }

    @Then("delete product in cart")
    public void deleteProductInCart() {
        ce.clickFunction(ce.getWebElement("sepeteGit"));
        ce.clickFunction(ce.getWebElement("bosluk1"));
        ce.clickFunction(ce.getWebElement("deletebutton"));

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        ce.verifyContainsTextFunction(ce.getWebElement("urunKaldirildi"),"ürünü sepetinden kaldırıldı");
    }
}

