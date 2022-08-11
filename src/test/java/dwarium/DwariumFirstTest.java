package dwarium;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DwariumFirstTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://w2.dwar.ru/index.php";
        Configuration.browser = "Dwarium";
        Configuration.browserSize = "400x900";

    }

    @Test
    void dwariumFirstTest () {
        open("/first_battle.php");
    }
}
