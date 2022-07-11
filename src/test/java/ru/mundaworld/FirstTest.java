package ru.mundaworld;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    public void testRegistr() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://mundaworld.com/registration");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("7052418070");
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();



        //WebElement input = driver.findElement(By.cssSelector());

        driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("Azat");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(), 'Фамилия')]/following-sibling::input")).sendKeys("Kadyr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type, 'email')]")).sendKeys("9677226@mail.rur");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();

        Thread.sleep(1000);

        driver.findElement(By.className("multiselect")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("multiselect__element")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/div[3]/ul/li[10]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(), 'Адрес*')]/following-sibling::input")).sendKeys("Тестовый адрес");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(), 'Почтовый индекс')]/following-sibling::input")).sendKeys("050000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[1]/div/input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[1]/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();


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
