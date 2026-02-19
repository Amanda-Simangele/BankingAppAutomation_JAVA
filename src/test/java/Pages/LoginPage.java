package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

   /* @FindBy (id = "userSelect")
    WebElement dropdown_id;

    @FindBy (xpath = "//button[@type=\"submit\"]")
    WebElement loginButton_xpath;*/

    By Dropdown = By.id("userSelect");

        By loginButton = By.xpath("//button[@type=\"submit\"]");


    public void selectUserFromDropdown(String username) {
        Select select = new Select(wait.until(ExpectedConditions.elementToBeClickable(Dropdown)));
        select.selectByVisibleText(username);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }


}
