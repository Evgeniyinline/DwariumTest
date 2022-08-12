package dwarium;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DwariumFirstTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://w2.dwar.ru/index.php";
        Configuration.browserBinary = "/path/to/dwarium";
        Configuration.browser = "Dwarium";
        Configuration.browserSize = "400x900";

    }

    @Test
    void dwariumFirstTest () {
        open("https://w2.dwar.ru/index.php");
        $("#tbl-nws_link_red").shouldHave(text("ОБ ИГРЕ"));
    }
}
