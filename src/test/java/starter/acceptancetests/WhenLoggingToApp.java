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
class WhenLoggingToApp {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    NavigateActions navigate;
    @Steps
    LoginAction login;

    GetLoggedInUser loggedInUser;

    @Test
    @DisplayName("Login test")
    void testLoginToApplication() {
        navigate.toPage("http://localhost:3000/login");
        login.login("oleg.test@gmail.com", "123456");
        String username = loggedInUser.getUsername();
        assertThat(username.contains("oleg.test@gmail.com")).isTrue();
    }
}
