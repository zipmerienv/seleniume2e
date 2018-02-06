package net.ukr.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class WebDriverTestBase {
    protected WebDriver driver;

    protected By loginFieldLocator = By.xpath("");
    protected WebElement loginField;
    protected String email = "zipstudies77@gmail.com";

    protected By passFiekdLocator = By.xpath("//*[@id=\"user-login-form\"]/input[3]");
    protected WebElement passField;
    protected String pass = "Samer300815";

    protected By subButtonLocator = By.xpath("//*[@id=\"user-login-form\"]/div[2]/div/button");
    protected WebElement suBbutton;


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/Documents/e2eselenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterClass
    public void tearDown(){
        driver.close();
    }
}