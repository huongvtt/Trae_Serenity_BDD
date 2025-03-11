package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GoogleSearchSteps extends PageObject {

    @Given("I open Google homepage")
    public void openGoogleHomepage() {
        getDriver().get("https://www.google.com");
    }

    @When("I search for {string}")
    public void searchFor(String searchTerm) {
        $(By.name("q")).sendKeys(searchTerm);
        $(By.name("q")).submit();
    }

    @Then("I should see results")
    public void verifyResults() {
        $(By.id("search")).shouldBeVisible();
    }
}