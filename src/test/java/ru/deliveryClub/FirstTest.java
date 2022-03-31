package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }
    @Test
    public void firstTest() {

        driver.get("https://kex888.kz");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("KEX Group - Информационная система для ресторанов"));

    }

    @Test
    public void firstTest2() {

        driver.get("https://kex888.kz");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("KEX Group - Информационная система для ресторанов"));

    }

    @After
    public void close() {
        driver.quit();
        System.out.println("test close");
    }

}
