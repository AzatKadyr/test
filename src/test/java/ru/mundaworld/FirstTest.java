package ru.mundaworld;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import static ru.mundaworld.variable.*;

public class FirstTest extends WebDriverSettings {


    @Test
    public void testRegistr() throws InterruptedException {


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://mundaworld.com/registration");

        driver.manage().window().maximize();
        System.out.println(driver.getLocalStorage());
        //driver.getLocalStorage();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys(phone);
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();

        driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(), 'Фамилия')]/following-sibling::input")).sendKeys(surname);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type, 'email')]")).sendKeys(email);
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
        driver.findElement(By.xpath("//span[contains(text(), 'Адрес*')]/following-sibling::input")).sendKeys(adress);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(), 'Почтовый индекс')]/following-sibling::input")).sendKeys(postindex);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[1]/div/input")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[1]/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/input")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"authLayout\"]/div/div/div/div[2]/div[4]/div[2]/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class = 'button -orange button-position mt-48']")).click();

        String ele = driver.getTitle();
        System.out.println(ele);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"defaultLayout\"]/div[3]/div[3]/div[2]/div/a[1]/div/div[1]")).click();



 }


}
