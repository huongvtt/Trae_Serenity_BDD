package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.OwnerLoginPage;
import org.junit.Assert;

public class OwnerLoginSteps {
    
    @Steps
    private OwnerLoginPage ownerLoginPage;  // Make sure this is properly initialized

    @Given("I open the owner login page")
    public void openOwnerLoginPage() {
        ownerLoginPage.openLoginPage();  // This should work with getDriver().get()
    }

    @When("I enter owner username {string}")
    public void enterOwnerUsername(String username) {
        ownerLoginPage.enterUsername(username);
    }

    @And("I enter owner password {string}")
    public void enterOwnerPassword(String password) {
        ownerLoginPage.enterPassword(password);
    }

    @And("I click the owner login button")
    public void clickOwnerLoginButton() {
        ownerLoginPage.clickLoginButton();
    }

    @Then("I should see the owner homepage")
    public void verifyOwnerHomepage() {
        Assert.assertTrue("Homepage should be visible", ownerLoginPage.isHomePageVisible());
    }
}