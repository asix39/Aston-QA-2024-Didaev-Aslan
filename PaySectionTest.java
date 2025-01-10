package Lesson16;

import io.qameta.allure.Severity;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
import static io.qameta.allure.SeverityLevel.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Проверка блока <Онлайн-пополнение без комиссии>")
public class PaySectionTest {
    public static WebDriver driver;
    public static MtsMainPage mtsMainPage;
    public static final String URL = "https://mts.by/";

    @BeforeAll
    static void setUp() {
        driver = new ChromeDriver();
        driver.get("https://mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mtsMainPage = new MtsMainPage(driver);
        mtsMainPage.cookieCancel();
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Заголовок формы")
    @Severity(MINOR)
    public void title() {
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = mtsMainPage.getPaySectionTitle();
        assertEquals(expectedTitle, actualTitle, "Заголовок блока не совпадает. \nОжидаемый результат: " + expectedTitle + "\nФактический результат: " + actualTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"})
    @DisplayName("Картинки платёжных систем")
    @Severity(MINOR)
    void images(String src) {
        assertTrue(mtsMainPage.isDisplayedImg(src), "Картинка не отображается");
    }

    @Test
    @DisplayName("Ссылка <Подробнее о сервисе>")
    @Severity(NORMAL)
    void link() {
        driver.get("https://mts.by/");
        String actualValue = mtsMainPage.getPaySectionLink();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", actualValue, "Неверный адрес ссылки");
        mtsMainPage.clickPaySectionLink();
        assertTrue(true, "Ссылка не открылась");
    }

    @Test
    @DisplayName("Кнопка <Продолжить> в блоке оплаты")
    @Severity(CRITICAL)
    void button() {
        mtsMainPage.setConnectionPhone("297777777");
        mtsMainPage.setConnectionSum("40");
        mtsMainPage.setConnectionEmail("test@gmail.com");
        mtsMainPage.clickPayButton();
        String actualValue = mtsMainPage.getFrameLink();
        assertEquals("https://checkout.bepaid.by/widget_v2/index.html", actualValue, "Окно оплаты не открылось");
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдеров")
    @Severity(MINOR)
    @CsvSource({
            "connection-phone, Номер телефона",
            "connection-sum, Сумма",
            "connection-email, E-mail для отправки чека",
            "internet-phone, Номер абонента",
            "internet-sum, Сумма",
            "internet-email, E-mail для отправки чека",
            "score-instalment, Номер счета на 44",
            "instalment-sum, Сумма",
            "instalment-email, E-mail для отправки чека",
            "score-arrears, Номер счета на 2073",
            "arrears-sum, Сумма",
            "arrears-email, E-mail для отправки чека"
    })
    public void checkPlaceholders(String id, String expectedPlaceholder) {
        try {
            String actualPlaceholder = "";
            switch (id) {
                case ("connection-phone"):
                    actualPlaceholder = mtsMainPage.getConnectionPhone();
                    break;
                case ("connection-sum"):
                    actualPlaceholder = mtsMainPage.getConnectionSum();
                    break;
                case ("connection-email"):
                    actualPlaceholder = mtsMainPage.getConnectionEmail();
                    break;
                case ("internet-phone"):
                    actualPlaceholder = mtsMainPage.getInternetPhone();
                    break;
                case ("internet-sum"):
                    actualPlaceholder = mtsMainPage.getInternetSum();
                    break;
                case ("internet-email"):
                    actualPlaceholder = mtsMainPage.getInternetEmail();
                    break;
                case ("score-instalment"):
                    actualPlaceholder = mtsMainPage.getScoreInstalment();
                    break;
                case ("instalment-sum"):
                    actualPlaceholder = mtsMainPage.getInstalmentSum();
                    break;
                case ("instalment-email"):
                    actualPlaceholder = mtsMainPage.getInstalmentEmail();
                    break;
                case ("score-arrears"):
                    actualPlaceholder = mtsMainPage.getScoreArrears();
                    break;
                case ("arrears-sum"):
                    actualPlaceholder = mtsMainPage.getArrearsSum();
                    break;
                case ("arrears-email"):
                    actualPlaceholder = mtsMainPage.getArrearsEmail();
                    break;
            }
            assertEquals(expectedPlaceholder, actualPlaceholder);
        } catch (NoSuchElementException e) {
            assertTrue(false, "Плейсхолдер не найден");
        }
    }
}
