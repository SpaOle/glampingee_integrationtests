package starter.acceptancetests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class SearchAction extends UIInteractions {
    public static final By SEARCH_TEXT = By.id("search-text");
    public static final By SEARCH_BUTTON = By.id("search-btn");
    public static final By FIRST_CARD =  By.className("card-title");

    @Step("User enters serch text")
    public void search(String text) {

        find(SEARCH_TEXT).sendKeys(text);
        find(SEARCH_BUTTON).click();
    }

    @Step("Get name of first glamping")
    public String getFirstCardName() {
        waitForRenderedElementsToBePresent(FIRST_CARD);
        return find(FIRST_CARD).getText();
    }
}
