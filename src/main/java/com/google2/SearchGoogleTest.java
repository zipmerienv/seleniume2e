package com.google2;

import com.google2.core.WebDriverTestBase;
import com.google2.pages.GoogleSearchPage;
import com.google2.pages.GoogleSearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

// Используем другой подход с PageFactory

public class SearchGoogleTest extends WebDriverTestBase {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchField;

    @FindBy(how = How.XPATH, using = "//*[@id='rso']/div[1]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/h3/a")
    private WebElement linkField;

    private String searchData = "Selenium";

    @Test
    public void searchGooglePageObjectTet(){
        driver.get("https://www.google.com.ua");
        GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        searchPage.searchForData(searchData);

        GoogleSearchResultPage resultPage = PageFactory.initElements(driver,GoogleSearchResultPage.class);
        assertTrue(resultPage.findElement().getText().contains(searchData));
    }
}
