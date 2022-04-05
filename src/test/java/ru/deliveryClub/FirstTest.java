package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FirstTest extends WebDriverSettings {


    @Test
    public void firstTest() {

        driver.get("http://mundaworld.com/login");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("KEX Group - Информационная система для ресторанов"));

    }

    @Test
    public void firstTest2() {

        driver.get("http://mundaworld.com/login");

        String title = driver.getTitle();

        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("7052418077");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("180323");
        driver.findElement(By.xpath("//button[@class = 'button -orange mt-48']")).click();


    }

    @Test
    public void testRegistr() {

        driver.get("http://mundaworld.com/registration");

        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("7052418079");
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();

        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("4");
 }


    @Test
    public void manualTest() {

        firstTest2();
        driver.get("http://mundaworld.com/products/3/508cf800-8e26-11ec-8354-294afdd4d882");
        driver.get(driver.getCurrentUrl());

    }

}
