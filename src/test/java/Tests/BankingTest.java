package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class BankingTest extends BaseTest {
    @Test
    public void test1(){
        homePage.clickCustomerLoginButton();
        loginPage.selectUserFromDropdown("Harry Potter");
        loginPage.clickLoginButton();
        welcomePage.SelectAccount();
        welcomePage.ClickDeposit();
        welcomePage.EnterAmount("1500");
      //  welcomePage.verifysucessMessage();

    }

}
