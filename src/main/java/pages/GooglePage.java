package pages;  // Make sure this matches the file location

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com")
public class GooglePage extends PageObject {
    private static final By SEARCH_BOX = By.name("q");
    private static final By SEARCH_RESULTS = By.id("search");

    public void openGooglePage() {
        getDriver().get("https://www.google.com");
        getDriver().manage().window().maximize();
    }

    public void enterSearchTerm(String searchTerm) {
        $(SEARCH_BOX).type(searchTerm);
    }

    public void submitSearch() {
        $(SEARCH_BOX).submit();
    }

    public boolean areResultsVisible() {
        return $(SEARCH_RESULTS).isVisible();
    }
}