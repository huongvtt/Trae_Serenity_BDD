package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.HerokuLoginPage;
import org.junit.Assert;

public class LoginSteps {
    
    @Steps
    private HerokuLoginPage loginPage;

    @Given("I open the login page")
    public void openLoginPage() {
        loginPage.openLoginPage();
    }

    @When("I enter username {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the secure area")
    public void verifySecureArea() {
        Assert.assertTrue("Success message should be visible", loginPage.isSuccessMessageVisible());
    }
}