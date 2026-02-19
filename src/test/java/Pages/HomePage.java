package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;


 //  @FindBy (xpath = "//button[@class='btn btn-primary btn-lg' and  @ng-click='customer()']")
  // WebElement customerLoginButton_xpath;

     By customerLoginButton_xpath = By.xpath("//button[@class='btn btn-primary btn-lg' and  @ng-click='customer()']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    public void clickCustomerLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(customerLoginButton_xpath)).click();


    }

}
