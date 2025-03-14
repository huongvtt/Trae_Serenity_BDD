package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://the-internet.herokuapp.com/login")
public class HerokuLoginPage extends PageObject {
    
    private static final By USERNAME_FIELD = By.id("username");
    private static final By PASSWORD_FIELD = By.id("password");
    private static final By LOGIN_BUTTON = By.cssSelector(".radius");
    private static final By SUCCESS_MESSAGE = By.cssSelector(".flash.success");
    
    public void openLoginPage() {
        getDriver().get("https://the-internet.herokuapp.com/login");
        getDriver().manage().window().maximize();
    }
    
    public void enterUsername(String username) {
        $(USERNAME_FIELD).type(username);
    }
    
    public void enterPassword(String password) {
        $(PASSWORD_FIELD).type(password);
    }
    
    public void clickLoginButton() {
        $(LOGIN_BUTTON).click();
    }
    
    public boolean isSuccessMessageVisible() {
        return $(SUCCESS_MESSAGE).isVisible();
    }
}