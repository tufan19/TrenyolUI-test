package StepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import Pages.LoginElements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utilities.BaseDriver.driver;

public class LoginSteps {
    LoginElements le = new LoginElements();

    @Given("Navigate to Trendyol")
    public void navigateToTrendyol() {
        BaseDriver.getDriver().get("https://www.trendyol.com/");
        le.pressEsc();
        le.clickFunction(le.getWebElement("closeButton"));
        le.clickFunction(le.getWebElement("acceptCookie"));
    }

    @When("Enter user information")
    public void enterUserInformation() {
        le.clickFunction(le.getWebElement("login"));
        le.pressEsc();
        le.sendKeysFunction(le.getWebElement("email"), le.findFromExcel("email"));
        le.sendKeysFunction(le.getWebElement("password"), le.findFromExcel("Password"));
    }

    @And("Click login")
    public void clickLogin() {
        le.clickFunction(le.getWebElement("LOGIN"));
    }

    @Then("Verify successful login")
    public void verifySuccessfulLogin() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).build().perform();
        le.verifyContainsTextFunction(le.getWebElement("verifyLogin"), "Hesabım");

    }


}
