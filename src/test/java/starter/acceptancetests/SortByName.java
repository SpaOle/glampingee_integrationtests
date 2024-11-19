package starter.acceptancetests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class SortByName extends UIInteractions {
    public static final By SORTFIELD_MENU = By.id("sort-field-dropdown");

    public static final By SORTORDER_MENU = By.id("sort-direction-dropdown");

    public static final By FILTER_BUTTON =  By.id("filter");

    public static final By FIRST_CARD =  By.className("card-title");
    @Step("User logins to the app")
    public void sort(String field, String order) {

        find(SORTFIELD_MENU).click();
        find(By.linkText(field)).click();
        find(SORTORDER_MENU).click();
        find(By.linkText(order)).click();
        find(FILTER_BUTTON).click();
    }

    @Step("Get name of first glamping")
    public String getFirstCardName() {
        waitForRenderedElementsToBePresent(FIRST_CARD);
        return find(FIRST_CARD).getText();
    }
}