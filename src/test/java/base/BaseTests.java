package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

//import static org.testng.Assert.assertTrue;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){


    }

    @Test
    public void testSuccessfulLogin(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/schanakya/AppData/Local/rasjani/WebDriverManager/chrome/103.0.5060.134/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
        /**/

        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHH working");
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
    //    assertTrue(secureAreaPage.getAlertText()
    //                    .contains("You logged into a secure area!"),
    //            "Alert text is incorrect");

        /*  */
        driver.quit();
        System.out.println("ssssssssssssssssssssssss working");
    }


    public void tearDown(){

    }
}