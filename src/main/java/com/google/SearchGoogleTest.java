package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.GoogleSearchPage;
import com.google.pages.GoogleSearchResultPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;// Нужно подключить  Webdriver а потом попробовать firefox
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;

public class SearchGoogleTest extends WebDriverTestBase{

    private By searchFieldLocator = By.name("q");
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div/div[1]/div/a/div[1]");
    private WebElement searchField;
    private WebElement linkField;
    private String searchData = "Selenium";

    @Test
    public void searchGoogleTest() {
        driver.get("https://www.google.com.ua");
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchData);
        searchField.submit();
        linkField = driver.findElement(linkLocator);
        assertTrue(linkField.getText().contains(searchData));
    }
    @Test
    public void searchGooglePageObjectTet(){
        driver.get("https://www.google.com.ua");
        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        searchPage.searchForData(searchData);
        GoogleSearchResultPage resultPage = new GoogleSearchResultPage(driver);
        assertTrue(resultPage.findElement().getText().contains(searchData));
    }
}