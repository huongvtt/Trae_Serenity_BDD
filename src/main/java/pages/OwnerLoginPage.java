package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://owner.nailshop.dev.mttjsc.com")
public class OwnerLoginPage extends PageObject {
    
    private static final By USERNAME_FIELD = By.name("username");
    private static final By PASSWORD_FIELD = By.name("password");
    private static final By LOGIN_BUTTON = By.xpath("//button[span[contains(text(),'Đăng nhập')]]");
    private static final By HOMEPAGE_INDICATOR = By.xpath("//article[contains(text(),'Tổng quan')]");
    
    public void openLoginPage() {
        getDriver().get("https://owner.nailshop.dev.mttjsc.com");
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
    
    public boolean isHomePageVisible() {
        return $(HOMEPAGE_INDICATOR).isVisible();
    }
}