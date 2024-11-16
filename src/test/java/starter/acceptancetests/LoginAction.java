package starter.acceptancetests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class LoginAction extends UIInteractions {
    public static final By USERNAME = By.id("formEmail");
    public static final By PASSWORD = By.id("formPassword");
    public static final By LOGIN_BUTTON =  By.className("btn-success");

    @Step("User logins to the app")
    public void login(String username, String password) {

        find(USERNAME).sendKeys(username);
        find(PASSWORD).sendKeys(password);
        find(LOGIN_BUTTON).click();
    }
}
