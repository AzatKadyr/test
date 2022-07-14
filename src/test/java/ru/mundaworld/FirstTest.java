package ru.mundaworld;
import org.junit.Test;
import org.openqa.selenium.*;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static ru.mundaworld.variable.*;

public class FirstTest extends WebDriverSettings {


    @Test
    public void testRegistr() throws InterruptedException {

        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(registrationUrl);

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
     driver.get(adminCabinetUrl);

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
    @Test
    public void logOutUser() throws InterruptedException {

        String testcase = ("Тест кейс №2.3 Выход из аккаунта");
        System.out.println(testcase + " начато тестирование");

        driver.manage().window().maximize();
        driver.get(baseUrl);

        driver.findElement(By.xpath("//a[text()=' Мой профиль ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=' Выйти из аккаунта ']")).click();
        System.out.println(testcase + " успешно завершен");
    }

    @Test
    public void authUser() throws InterruptedException {

        String testcase = ("Тест кейс №2.1 Авторизация покупателя");
        System.out.println(testcase + " начато тестирование");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        driver.findElement(By.xpath("//*[@id=\"defaultLayout\"]/div[1]/div[3]/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys(phone);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys(password);

        Thread.sleep(2000);
        boolean isTrue = driver.findElements(By.xpath("//button[@class = 'button -orange mt-48']")).size() > 0;

        if(isTrue!=true){
            System.out.println("После заполнения всех полей не активировалась кнопка // Свойство кнопки: " + isTrue);
            close();
        }else{

            System.out.println("Кнопка активирована");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@class = 'button -orange mt-48']")).click();

            Thread.sleep(1000);

            boolean isErrorMessage = driver.findElements(By.xpath("//div[contains(@class, 'errors')]")).size() > 0;

            if(isErrorMessage!=false){

                System.out.println("Наличие ошибки " + isErrorMessage);
                String mes = driver.findElement(By.xpath("//div[contains(@class, 'errors')]")).getText();

                if(mes!=null){
                    System.out.println("Произошла ошибка во время авторизации, текст ошибки: " + mes);

                    Date dateNow = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
                    String fileName = format.format(dateNow) + ".png";
                    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    String path = "C:\\screenshot\\" + fileName;
                    try {
                        FileUtils.copyFile(screenshot, new File(path));
                        System.out.println("Скриншот сохранен в директории " + path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }else{
                System.out.println(testcase + " успешно завершен");
            }


        }
    }

}
