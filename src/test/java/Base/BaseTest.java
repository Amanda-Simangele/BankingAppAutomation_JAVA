package Base;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.TranscationPage;
import Pages.WelcomePage;
import Utils.BrowserFactory;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
     protected WebDriver driver;
     protected LoginPage loginPage;
     protected HomePage homePage;
     protected TranscationPage transcationPage;
     protected WelcomePage welcomePage;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeMethod
    public void Setup(){
       driver = BrowserFactory.startBrowser();
       driver.get(ConfigReader.get("url"));

       // Create page objects
       loginPage = new LoginPage(driver);
       homePage = new HomePage(driver);
       transcationPage = new TranscationPage(driver);
       welcomePage = new WelcomePage(driver);



    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}
