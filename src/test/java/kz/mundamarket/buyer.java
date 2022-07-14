package kz.mundamarket;
import org.openqa.selenium.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import static kz.mundamarket.variable.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class buyer{

    WebDriver driver;

    public buyer(WebDriver driver) {this.driver = driver;}

    @FindBy(xpath = "//input[contains(@type, 'tel')]")
    @CacheLookup
    private WebElement userPhone;

    @FindBy(xpath = "//button[@class = 'button -orange button-position mt-48']")
    @CacheLookup
    private WebElement buttonReg;

    @FindBy(xpath = "//input[contains(@type, 'text')]")
    @CacheLookup
    private WebElement userName;

    @FindBy(xpath = "//span[contains(text(), 'Фамилия')]/following-sibling::input")
    @CacheLookup
    private WebElement userSurname;

    @FindBy(xpath = "//input[contains(@type, 'email')]")
    @CacheLookup
    private WebElement userEmail;

    @FindBy(xpath = "//input[contains(@type, 'checkbox')]")
    @CacheLookup
    private WebElement userIagree;

    @FindBy(className = "multiselect")
    @CacheLookup
    private WebElement userCountry;

    @FindBy(className = "multiselect__element")
    @CacheLookup
    private WebElement userCountryElement;

    @FindBy(xpath = "//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div")
    @CacheLookup
    private WebElement userCity;

    @FindBy(xpath = "//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/div[3]/ul/li[10]/span")
    @CacheLookup
    private WebElement userCityElement;

    @FindBy(xpath = "//span[contains(text(), 'Адрес*')]/following-sibling::input")
    @CacheLookup
    private WebElement userAdress;

    @FindBy(xpath = "//span[contains(text(), 'Почтовый индекс')]/following-sibling::input")
    @CacheLookup
    private WebElement userPostIndex;

    @FindBy(xpath = "//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[1]/div/input")
    @CacheLookup
    private WebElement userPassword;

    @FindBy(xpath = "//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/input")
    @CacheLookup
    private WebElement userPasswordRepeat;

    public void open(String pageurl) {
        driver.get(baseUrl+ pageurl);
        driver.manage().window().maximize();
    }

    public void insertPhone(String phone) {
        userPhone.sendKeys(phone);
    }

    public void clickBtn() {
        buttonReg.click();
    }

    public static String getRandomPhone() {
        String s = "123456789";
        StringBuffer phoneNumber = new StringBuffer();

        for (int i = 0; i < 7; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }

        String phone = "787"+phoneNumber.toString();
        return phone;
    }

    public static String getRandomEmail() {
        String s = "123456789";
        StringBuffer phoneNumber = new StringBuffer();

        for (int i = 0; i < 7; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }

        String email = phoneNumber.toString()+"@test-munda.kz";
        return email;
    }


}
