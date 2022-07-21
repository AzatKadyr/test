package kz.mundamarket;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static kz.mundamarket.variable.*;

public class buyerAuthTest extends WebDriverSettings{

    @Test
    public void regBuyer() throws Exception {
        buyer bayerPage = PageFactory.initElements(driver, buyer.class);

        bayerPage.getpost("Тестирование начато");
        bayerPage.uploadImg();

        bayerPage.open(registrationUrl);
        bayerPage.insertPhone(phone);
        bayerPage.clickBtn();
        bayerPage.sleep(2000);
        bayerPage.insertName(name);
        bayerPage.sleep(1000);
        bayerPage.insertSurName(surname);
        bayerPage.sleep(1000);
        bayerPage.insertEmail(email);
        bayerPage.sleep(1000);
        bayerPage.clickIagree();
        bayerPage.sleep(1000);
        bayerPage.screenShots(1);
        bayerPage.clickBtnNext();

        bayerPage.sleep(1000);
        bayerPage.clickCountry();
        bayerPage.sleep(1000);
        bayerPage.clickCountryElement();

        bayerPage.sleep(1000);
        bayerPage.clickCity();
        bayerPage.sleep(1000);
        bayerPage.clickCityElement();
        bayerPage.sleep(1000);
        bayerPage.insertAdress(adress);
        bayerPage.sleep(1000);
        bayerPage.insertPostIndex(postindex);
        bayerPage.clickBtnNext2();
        bayerPage.screenShots(1);

        bayerPage.sleep(1000);
        bayerPage.insertPassword(password);
        bayerPage.sleep(1000);
        bayerPage.insertPassword2(password);
        bayerPage.screenShots(1);

        bayerPage.getpost("Тест прошел успешно. Тест кейс №");

    }

}
