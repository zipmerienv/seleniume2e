package com.google2.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.google2.core.BrowserEnums.CHROME;
import static com.google2.core.BrowserEnums.FIREFOX;

public class WebDriverTestBase {

        protected WebDriver driver;
        protected By searchFieldLocator = By.xpath ("//*[@id=\'lst-ib\']");
        protected WebElement searchField;
        protected String searchData = "Selenium";
        protected By linkLocator = By.xpath("//a[contains(text(),'Selenium')]");
        protected List<WebElement> linkField;
        protected By buttonLocator = By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]");
        protected WebElement button;
        public String browser = System.getProperty("browser", "CHROME");

        @BeforeClass
        public void setup() {

            //System.setProperty("webdriver.chrome.driver", "/Users/mac/Documents/e2eselenium/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();//ОБЯЗАТЕЛЬНО!
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ОБЯЗАТЕЛЬНО!{
            BrowserEnums brows = BrowserEnums.valueOf(browser);// конвертируем все в стингу
            switch (brows){
                case CHROME:
                    ChromeDriverManager.getInstance().setup();
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    FirefoxDriverManager.getInstance().setup();
                    driver = new FirefoxDriver();
                    break;
            }

        }
        @AfterClass
        public void tearDown(){
            driver.close();
        }
}