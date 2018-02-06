package net.ukr;

import net.ukr.pages.UrkNetHomePage;
import net.ukr.pages.UkrNetLoginPage;
import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

//import org.openqa.selenium.firefox.FirefoxDriver;// Нужно подключить  Webdriver а потом попробовать firefox

public class LoginUkrNetlTest extends WebDriverTestBase{

    private By loginFieldLocator = By.xpath("//*[@id=\"user-login-form\"]/input[2]]");
    private WebElement loginField;
    private String email = "zipstudies77@gmail.com";

    private By passFiekdLocator = By.xpath("//*[@id=\"user-login-form\"]/input[3]");
    private WebElement passField;
    private String password = "Samer300815";

    private By subButtonLocator = By.xpath("//*[@id='user-login-form']/div[2]/div/button");
    private WebElement button;



    @Test
    public void logInTest(){
        driver.get("https://www.ukr.net/");
        UkrNetLoginPage loginPage = new UkrNetLoginPage(driver);
        loginPage.logIn(email,password);
        UrkNetHomePage ukrNetassert = new UrkNetHomePage(driver);
        ukrNetassert.findElement();
        assertTrue(ukrNetassert.findElement().getText().contains(searchData));
        }
    }
