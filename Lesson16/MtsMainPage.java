package Lesson16;

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

    public void cookieCancel() {
        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }

    public String getConnectionPhone() throws NoSuchElementException {
        return driver.findElement(connectionPhoneLocator).getAttribute("placeholder");
    }

    public String getConnectionSum() throws NoSuchElementException {
        return driver.findElement(connectionSumLocator).getAttribute("placeholder");
    }

    public String getConnectionEmail() throws NoSuchElementException {
        return driver.findElement(connectionEmailLocator).getAttribute("placeholder");
    }

    public String getInternetPhone() throws NoSuchElementException {
        return driver.findElement(internetPhonesLocator).getAttribute("placeholder");
    }

    public String getInternetSum() throws NoSuchElementException {
        return driver.findElement(internetSumLocator).getAttribute("placeholder");
    }

    public String getInternetEmail() throws NoSuchElementException {
        return driver.findElement(internetEmailLocator).getAttribute("placeholder");
    }

    public String getScoreInstalment() throws NoSuchElementException {
        return driver.findElement(scoreInstalmentLocator).getAttribute("placeholder");
    }

    public String getInstalmentSum() throws NoSuchElementException {
        return driver.findElement(instalmentSumLocator).getAttribute("placeholder");
    }

    public String getInstalmentEmail() throws NoSuchElementException {
        return driver.findElement(instalmentEmailLocator).getAttribute("placeholder");
    }

    public String getScoreArrears() throws NoSuchElementException {
        return driver.findElement(scoreArrearsLocator).getAttribute("placeholder");
    }

    public String getArrearsSum() throws NoSuchElementException {
        return driver.findElement(arrearsSumLocator).getAttribute("placeholder");
    }

    public String getArrearsEmail() throws NoSuchElementException {
        return driver.findElement(arrearsEmailLocator).getAttribute("placeholder");
    }

    public void setConnectionPhone(String phone) {
        driver.findElement(connectionPhoneLocator).sendKeys(phone);
    }

    public void setConnectionSum(String sum) {
        driver.findElement(connectionSumLocator).sendKeys(sum);
    }

    public void setConnectionEmail(String email) {
        driver.findElement(connectionEmailLocator).sendKeys(email);
    }

    public void clickPayButton() {
        driver.findElement(submitButtonLocator).click();
    }

    public String getFrameLink() throws NoSuchElementException {
        return driver.findElement(framePayLocator).getAttribute("src");
    }

    public String getPaySectionTitle() {
        return driver.findElement(paySectionTitleLocator).getText();
    }

    public String getPaySectionLink() {
        return driver.findElement(paySectionLinkLocator).getAttribute("href");
    }

    public void clickPaySectionLink() {
        driver.findElement(paySectionLinkLocator).click();
    }

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
