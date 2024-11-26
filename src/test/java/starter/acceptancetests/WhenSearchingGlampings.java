package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingGlampings {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    NavigateActions navigate;
    @Steps
    SearchAction search;


    @Test
    @DisplayName("Search by name Mesi")
    void testSearchByName1() {
        navigate.toPage("http://localhost:3000/explore");
        search.search("Mesi");
        assertThat(search.getFirstCardName().contains("Mesipesa Yellow Lodge & outdoor sauna")).isTrue();
    }

    @Test
    @DisplayName("Search by name River")
    void testSearchByName2() {
        navigate.toPage("http://localhost:3000/explore");
        search.search("River");
        assertThat(search.getFirstCardName().contains("House in Natural Paradise Close To River And Sea")).isTrue();
    }

    @Test
    @DisplayName("Search by name Cabin")
    void testSearchByName3() {
        navigate.toPage("http://localhost:3000/explore");
        search.search("Cabin");
        assertThat(search.getFirstCardName().contains("Modern forest cabin with a cozy hot tub in Telise")).isTrue();
    }

}
