package com.google.core;

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
        protected By searchFieldLocator = By.xpath ("//*[@id=\'lst-ib\']");
        protected WebElement searchField;
        protected String searchData = "Selenium";
        protected By linkLocator = By.xpath("//a[contains(text(),'Selenium')]");
        protected List<WebElement> linkField;
        protected By buttonLocator = By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]");
        protected WebElement button;


        @BeforeClass
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "/Users/mac/Documents/e2eselenium/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();//ОБЯЗАТЕЛЬНО!
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//ОБЯЗАТЕЛЬНО!{
        }
        @AfterClass
        public void tearDown(){
            driver.close();
        }
}