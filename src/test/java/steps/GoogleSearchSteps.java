package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.GooglePage;

public class GoogleSearchSteps {
    
    @Steps
    private GooglePage googlePage;

    @Given("I open Google homepage")
    public void openGoogleHomepage() {
        googlePage.openGooglePage();
    }

    @When("I search for {string}")
    public void searchFor(String searchTerm) {
        googlePage.enterSearchTerm(searchTerm);
        googlePage.submitSearch();
    }

    @Then("I should see results")
    public void verifyResults() {
        assert googlePage.areResultsVisible();
    }
}