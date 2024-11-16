package starter.acceptancetests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    @Step("User opens the login page")
    public void toPage(String page) {
        openUrl(page);
    }
}


