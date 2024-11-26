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
class WhenSortingGlampings {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    NavigateActions navigate;
    @Steps
    SortAction sort;


    @Test
    @DisplayName("Sort by name descending")
    void testSortByNameDescending() {
        navigate.toPage("http://localhost:3000/explore");
        sort.sort("Name", "Descending");
        assertThat(sort.getFirstCardName().contains("Wild glamping house for two")).isTrue();
    }

    @Test
    @DisplayName("Sort by name ascending")
    void testSortByNameAscending() {
        navigate.toPage("http://localhost:3000/explore");
        sort.sort("Name", "Ascending");
        assertThat(sort.getFirstCardName().contains("Auksi holiday home-2")).isTrue();
    }

    @Test
    @DisplayName("Sort by price descending")
    void testSortByPriceDescending() {
        navigate.toPage("http://localhost:3000/explore");
        sort.sort("Price", "Descending");
        assertThat(sort.getFirstCardName().contains("Kuusemäe Holiday Home")).isTrue();
    }

    @Test
    @DisplayName("Sort by price ascending")
    void testSortByPriceAscending() {
        navigate.toPage("http://localhost:3000/explore");
        sort.sort("Price", "Ascending");
        assertThat(sort.getFirstCardName().contains("Glamping \"Birch\"")).isTrue();
    }

    @Test
    @DisplayName("Sort by county descending")
    void testSortByCountyDescending() {
        navigate.toPage("http://localhost:3000/explore");
        sort.sort("County", "Descending");
        assertThat(sort.getFirstCardName().contains("Nights at Rõuge")).isTrue();
    }

    @Test
    @DisplayName("Sort by county ascending")
    void testSortByCountyAscending() {
        navigate.toPage("http://localhost:3000/explore");
        sort.sort("County", "Ascending");
        assertThat(sort.getFirstCardName().contains("Jungle treehouse")).isTrue();
    }
}
