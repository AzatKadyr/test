package ru.mundaworld;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static ru.mundaworld.variable.*;

public class FirstTest extends WebDriverSettings {


    @Test
    public void testRegistr() throws InterruptedException {

        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://mundaworld.com/registration");

        driver.manage().window().maximize();
        System.out.println(driver.getLocalStorage());
        //driver.getLocalStorage();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys(phone);
        Thread.sleep(6000);
        System.out.println(phone);
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


 @Test
    public void deleteuSER() throws InterruptedException {



     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("http://admin.mundamarket.kz/");

     Date dateNow = new Date();
     SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
     String fileName = format.format(dateNow) + ".png";
     File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     try {
         FileUtils.copyFile(screenshot, new File("C:\\screenshot\\" + fileName));
     } catch (IOException e) {
         e.printStackTrace();
     }

     driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     driver.findElement(By.id("emailaddress")).sendKeys(admin);
     Thread.sleep(1000);
     driver.findElement(By.id("password")).sendKeys(passwordadmin);
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-block']")).click();
     Thread.sleep(3000);
     driver.get("http://admin.mundamarket.kz/users/buyers");
     Thread.sleep(1000);
     driver.findElement(By.id("membersearch-input")).sendKeys(phone);
     driver.findElement(By.id("membersearch-input")).sendKeys(Keys.ENTER);
     Thread.sleep(2500);

     driver.findElement(By.xpath("//a[contains(text(), 'Изменить')]/following-sibling::button")).click();


     close();

 }

}
