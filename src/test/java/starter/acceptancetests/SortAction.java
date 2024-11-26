package starter.acceptancetests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class SortAction extends UIInteractions {
    public static final By FILTERS_BUTTON =  By.id("filters");

    public static final By SORTFIELD_MENU = By.id("sort-field-dropdown");

    public static final By SORTORDER_MENU = By.id("sort-direction-dropdown");

    public static final By APPLYFILTER_BUTTON =  By.id("apply-filters");

    public static final By FIRST_CARD =  By.className("card-title");
    @Step("User chooses how to sort")
    public void sort(String field, String order) {

        waitForRenderedElementsToBePresent(FILTERS_BUTTON);
        find(FILTERS_BUTTON).click();
        waitForRenderedElementsToBePresent(SORTFIELD_MENU);
        find(SORTFIELD_MENU).click();
        find(By.linkText(field)).click();
        find(SORTORDER_MENU).click();
        find(By.linkText(order)).click();
        find(APPLYFILTER_BUTTON).click();
    }

    @Step("Get name of first glamping")
    public String getFirstCardName() {
        waitForRenderedElementsToBePresent(FIRST_CARD);
        return find(FIRST_CARD).getText();
    }
}