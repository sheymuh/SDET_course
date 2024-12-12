import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SelenideExample {
    @BeforeClass
    void init() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "edge";
    }

    @Test
    public void test1() {
        open("https://www.simbirsoft.com/");
        $(By.xpath("//*[contains(@href, '/portfolio/sozdanie-korporativnykh-produktov-dlya-tatnefti/')]"))
                .scrollTo()
                .shouldBe(visible)
                .click();
        sleep(5000);
    }

    @Test
    public void test2() {
        open("https://www.simbirsoft.com/");
        $(By.xpath("//*[contains(@class, 'gh-nav-item gh-nav-item--career')]"))
                .shouldHave(text("Карьера"))
                .hover();
        $(By.linkText("Пригласи друга"))
                .shouldHave(text("Пригласи друга"))
                .click();
        $(By.xpath("//h1"))
                .shouldHave(text("Порекомендуйте друга — получите вознаграждение!"))
                        .shouldBe(visible);
        $(By.xpath("//*[contains(@alt, 'Золотой кубок')]"))
                .shouldBe(visible)
                        .shouldBe(image);
        webdriver().shouldHave(url("https://www.simbirsoft.com/career/friends/"));
        sleep(5000);
    }
}
