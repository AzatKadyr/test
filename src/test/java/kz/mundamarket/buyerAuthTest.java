package kz.mundamarket;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static kz.mundamarket.variable.*;

public class buyerAuthTest extends WebDriverSettings{

    @Test
    public void regBuyer() throws InterruptedException {
        buyer bayerPage = PageFactory.initElements(driver, buyer.class);
        bayerPage.open(registrationUrl);
        bayerPage.insertPhone(phone);
        bayerPage.clickBtn();
    }

}
