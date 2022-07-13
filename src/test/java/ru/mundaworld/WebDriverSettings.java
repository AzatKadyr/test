package ru.mundaworld;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    @After
    public void close() {
        //driver.quit();
        System.out.println("test close");
    }

    public static String getRandomPhone() {
        String s = "123456789";
        StringBuffer phoneNumber = new StringBuffer();

        for (int i = 0; i < 7; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }

        String phone = "7787"+phoneNumber.toString();
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
