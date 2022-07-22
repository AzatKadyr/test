package kz.mundamarket;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static kz.mundamarket.variable.*;

public class buyerAuthTest extends WebDriverSettings{

    @Test
    public void regBuyer() throws Exception {

        String testcase = "1.1 ����������� ���������� (��������� ��������� �������)";
        buyer bayerPage = PageFactory.initElements(driver, buyer.class);
        deleteAllFilesFolder();
        bayerPage.getpost("���� ���� �"+ testcase +" ������������ ������");

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
        bayerPage.screenShots(testcase);
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
        bayerPage.screenShots(testcase);

        bayerPage.sleep(1000);
        bayerPage.insertPassword(password);
        bayerPage.sleep(1000);
        bayerPage.insertPassword2(password);
        bayerPage.screenShots(testcase);
        bayerPage.sleep(1000);
        bayerPage.clickBtnNext3();
        bayerPage.sleep(3000);
        bayerPage.checkCurrentUrl(baseUrl);
        bayerPage.getpost("���� ���� �"+ testcase +" ������������ ������� ���������");

    }


    @Test
    public void regBuyerErrorFalsePhone() throws Exception {

        String testcase = "1.1 ����������� ���������� (��������� ������)";
        buyer bayerPage = PageFactory.initElements(driver, buyer.class);

        bayerPage.getpost("���� ���� �"+ testcase +" ������������ ������");

        bayerPage.open(registrationUrl);
        bayerPage.insertPhone(falsePhone);
        bayerPage.clickBtn();
        bayerPage.sleep(3000);
        bayerPage.getpost("���� ���� �"+ testcase +" ������������ ������� ���������");
        bayerPage.screenShots(testcase);

    }

}
