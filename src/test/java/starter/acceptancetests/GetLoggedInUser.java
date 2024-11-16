package starter.acceptancetests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class GetLoggedInUser extends UIInteractions {
    public static final By WELCOME = By.id("welcome_current_user");

    @Step("User logins to the app")
    public String getUsername() {

        waitForRenderedElementsToBePresent(WELCOME);
        return find(WELCOME).getText();
    }
}
