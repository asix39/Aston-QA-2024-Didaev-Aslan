package Lesson16;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PayFrame {

    public WebDriver driver;

    public PayFrame(WebDriver driver, WebElement frameLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
        // Ждем полной загрузки окна по одному из элементов формы
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname=creditCard] + label")));
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    By descriptionCostLocator = By.cssSelector("div.pay-description__cost span:nth-child(1)");
    By acceptButtonLocator = By.cssSelector("div.card-page__card button");
    By descriotionPhoneLocator = By.cssSelector("div.pay-description__text span:nth-child(1)");
    By cardNumberPlaceholderLocator = By.cssSelector("input[formcontrolname=creditCard] + label");
    By expiredDatePlaceholderLocator = By.cssSelector("input[formcontrolname=expirationDate] + label");
    By cvcPlaceholderLocator = By.cssSelector("input[formcontrolname=cvc] + label");
    By cardHolderPlaceholderLocator = By.cssSelector("input[formcontrolname=holder] + label");

    @FindBy(css = "div.cards-brands img")
    private List<WebElement> payImgages;

    @Step("Получаем сумму к оплате из заголовка окна пополнения")
    public String getDescriptionCost() {
        return driver.findElement(descriptionCostLocator).getText();
    }

    @Step("Получаем сумму к оплате из кнопки <Оплатить>")
    public String getPayFrameBtnText() {
        return driver.findElement(acceptButtonLocator).getText();
    }

    @Step("Получаем пополняемый номер из окна пополнения")
    public String getPayFrameDescriptionPhone() {
        return driver.findElement(descriotionPhoneLocator).getText();
    }

    @Step("Получаем svg изображения систем оплат из окна пополнения")
    public boolean isDisplayedImg(String scr) throws NoSuchElementException {
        for (WebElement payImage : payImgages) {
            if (payImage.getAttribute("src").contains(scr)) {
                return payImage.isDisplayed() || payImage.getAttribute("style").contains("opacity: 0") ;
            }
        }
        return false;
    }

    @Step("Получить плейсхолдер <Номер карты>")
    public String getCardNumberPlaceholder() throws NoSuchElementException {
            return driver.findElement(cardNumberPlaceholderLocator).getText();
    }

    @Step("Получить плейсхолдер <Срок действия карты>")
    public String getExpiredDatePlaceholder() throws NoSuchElementException {
        return driver.findElement(expiredDatePlaceholderLocator).getText();
    }

    @Step("Получить плейсхолдер <CVC>")
    public String getCvcPlaceholder() throws NoSuchElementException {
        return driver.findElement(cvcPlaceholderLocator).getText();
    }

    @Step("Получить плейсхолдер <Имя носителя карты>")
    public String getCardHolderPlaceholder() throws NoSuchElementException {
        return driver.findElement(cardHolderPlaceholderLocator).getText();
    }
}
