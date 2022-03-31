package ru.deliveryClub;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://kex888.kz");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("KEX Group - Информационная система для ресторанов"));

        driver.quit();
    }

}
