package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
    WebDriver driver;
    WebDriverWait wait;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    By AccountNumber = By.id("accountSelect");

    By DepositButton = By.xpath("//button[@ng-class=\'btnClass2\']");

    By AmountInput = By.xpath("//input[@type='number' and @ng-model='amount']");

    By SuccessMessage = By.xpath("//span[@class='error ng-binding']");


    public void SelectAccount(){
        Select select = new Select (wait.until(ExpectedConditions.elementToBeClickable(AccountNumber)));
        select.selectByIndex(0);
    }

    public void ClickDeposit(){
        wait.until(ExpectedConditions.elementToBeClickable(DepositButton)).click();

    }

    public void EnterAmount(String amount){
        wait.until(ExpectedConditions.elementToBeClickable(AmountInput)).sendKeys(amount);
    }

    public void verifysucessMessage(){
        String expectedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage)).getText();

    }


}
