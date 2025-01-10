package Lesson16;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MtsMainPage {
    public WebDriver driver;

    public MtsMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Локаторы полей ввода и кнопки оплаты
    By paySectionTitleLocator = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2");
    By paySectionLinkLocator = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");
    By paySectionImagesLocator = By.xpath("//section[@class='pay']//img");
    By connectionPhoneLocator = By.id("connection-phone");
    By connectionSumLocator = By.id("connection-sum");
    By connectionEmailLocator = By.id("connection-email");
    By internetPhonesLocator = By.id("internet-phone");
    By internetSumLocator = By.id("internet-sum");
    By internetEmailLocator = By.id("internet-email");
    By scoreInstalmentLocator = By.id("score-instalment");
    By instalmentSumLocator = By.id("instalment-sum");
    By instalmentEmailLocator = By.id("instalment-email");
    By scoreArrearsLocator = By.id("score-arrears");
    By arrearsSumLocator = By.id("arrears-sum");
    By arrearsEmailLocator = By.id("arrears-email");
    By submitButtonLocator = By.cssSelector("section.pay button[type='submit']");
    By framePayLocator = By.xpath("/html/body/div[8]/div/iframe");

    @FindBy(css = "iframe.bepaid-iframe")
    public WebElement payFrame;

    @Step("Нажатие на кнопку отмены от кук")
    public void cookieCancel() {
        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }

    @Step("Получить плейсхолдер поля <Номер телефона>. Меню <Услуги связи>")
    public String getConnectionPhone() throws NoSuchElementException {
        return driver.findElement(connectionPhoneLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Сумма>. Меню <Услуги связи>")
    public String getConnectionSum() throws NoSuchElementException {
        return driver.findElement(connectionSumLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <E-mail>. Меню <Услуги связи>")
    public String getConnectionEmail() throws NoSuchElementException {
        return driver.findElement(connectionEmailLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Номер абонента>. Субменю <Домашний интернет>")
    public String getInternetPhone() throws NoSuchElementException {
        return driver.findElement(internetPhonesLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Сумма>. Субменю <Домашний интернет>")
    public String getInternetSum() throws NoSuchElementException {
        return driver.findElement(internetSumLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <E-mail>. Субменю <Домашний интернет>")
    public String getInternetEmail() throws NoSuchElementException {
        return driver.findElement(internetEmailLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Номер счета на 44>. Субменю <Рассрочка>")
    public String getScoreInstalment() throws NoSuchElementException {
        return driver.findElement(scoreInstalmentLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Сумма>. Субменю <Рассрочка>")
    public String getInstalmentSum() throws NoSuchElementException {
        return driver.findElement(instalmentSumLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <E-mail>. Субменю <Рассрочка>")
    public String getInstalmentEmail() throws NoSuchElementException {
        return driver.findElement(instalmentEmailLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Номер счета на 2073>. Субменю <Задолженность>")
    public String getScoreArrears() throws NoSuchElementException {
        return driver.findElement(scoreArrearsLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <Сумма>. Субменю <Задолженность>")
    public String getArrearsSum() throws NoSuchElementException {
        return driver.findElement(arrearsSumLocator).getAttribute("placeholder");
    }

    @Step("Получить плейсхолдер поля <E-mail>. Субменю <Задолженность>")
    public String getArrearsEmail() throws NoSuchElementException {
        return driver.findElement(arrearsEmailLocator).getAttribute("placeholder");
    }

    @Step("Установить значения для поля <Номер телефона>. Субменю <Услуги связи>")
    public void setConnectionPhone(String phone) {
        driver.findElement(connectionPhoneLocator).sendKeys(phone);
    }

    @Step("Установить значения для поля <Сумма>. Субменю <Услуги связи>")
    public void setConnectionSum(String sum) {
        driver.findElement(connectionSumLocator).sendKeys(sum);
    }

    @Step("Установить значения для поля <E-mail>. Субменю <Услуги связи>")
    public void setConnectionEmail(String email) {
        driver.findElement(connectionEmailLocator).sendKeys(email);
    }

    @Step("Нажатие на кнопку <Оплатить>")
    public void clickPayButton() {
        driver.findElement(submitButtonLocator).click();
    }

    @Step("Получить ссылку на страницу оплаты")
    public String getFrameLink() throws NoSuchElementException {
        return driver.findElement(framePayLocator).getAttribute("src");
    }

    @Step("Получить заголовок страницы оплаты")
    public String getPaySectionTitle() {
        return driver.findElement(paySectionTitleLocator).getText();
    }

    @Step("Получить ссылку на страницу оплаты")
    public String getPaySectionLink() {
        return driver.findElement(paySectionLinkLocator).getAttribute("href");
    }

    @Step("Перейти на страницу оплаты")
    public void clickPaySectionLink() {
        driver.findElement(paySectionLinkLocator).click();
    }

    @Step("Проверить, что картинка существует")
    public boolean isDisplayedImg(String src) {
        List<WebElement> images = driver.findElements(paySectionImagesLocator);
        for (WebElement image : images) {
            if (image.getAttribute("src").equals(src)) {
                return true;
            }
        }
        return false;
    }
}
