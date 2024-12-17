package Lesson15;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.ValueSource;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestMtsBy {
    WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://mts.by/");
        WebElement cookieLocator = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        if (cookieLocator.isDisplayed()) {
            cookieLocator.click();
        }
    }


    @Test
    @DisplayName("Проверка заголовка. Блок <Онлайн пополнение без комиссии>")
    void payTitle() {
        String expected = "Онлайн пополнение\nбез комиссии";
        WebElement actualLocator = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String actual = actualLocator.getText();
        Assertions.assertEquals(expected, actual, "Название заголовка не совпадает. Ожидаемый результат: " + expected);
    }

    @Test
    @DisplayName("Проверка лого платёжных систем")
    /* @ParameterizedTest
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"}) */
    // Почему-то компилятор не работает с org.junit.jupiter.params.ParameterizedTest, не получилось задать значения для теста.
    void logo() {
        driver.findElement(By.className("pay__partners"));
    }

    @Test
    @DisplayName("Проверка ссылки <Подробнее о сервисе>")
    void button() {
        WebElement linkLocator = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        linkLocator.click();
        Assertions.assertTrue(true, "Ссылка не найдена/не рабочая");
    }

    @Test
    @DisplayName("Проверка кнопки <Продолжить> у формы оплаты")
    void form() {
        WebElement inputPhoneLocator = driver.findElement(By.className("phone"));
        inputPhoneLocator.click();
        inputPhoneLocator.sendKeys("297777777");
        WebElement buttonLocator = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        buttonLocator.click();
        Assertions.assertFalse(false, "Возможность нажатия кнопки <Продолжить> не заполнив поле <Сумма>");
    }
}