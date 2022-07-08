package ru.mundaworld;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("7029677226");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class = 'button -orange mt-48']")).click();


    }

    @Test
    public void testNomen(){
        //firstTest2();
        driver.get("https://mundamarket.kz/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//img[@class = 'product_img']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
    @Test
    public void testRegistr() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://mundaworld.com/registration");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
        */
        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("7052418079");
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();



        //WebElement input = driver.findElement(By.cssSelector());

        driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("Azat");
        driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("Kadyr");
        driver.findElement(By.xpath("//input[contains(@type, 'email')]")).sendKeys("9677226@mail.rur");
        driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]")).click();
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();


        //driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("4");

        //driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("4");
 }


    @Test
    public void manualTest() {


        testNomen();
        //driver.get("http://mundaworld.com/products/3/508cf800-8e26-11ec-8354-294afdd4d882");
        //driver.get(driver.getCurrentUrl());

    }


    @Test
    public void testTest() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://mundaworld.com/");


    }

}
