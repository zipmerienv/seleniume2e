package com.google.pages;
import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultPage{

    private WebDriver driver;
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div/div[1]/div/a/div[1]");
    private WebElement linkField;

    public GoogleSearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findElement(){
        linkField  = driver.findElement(linkLocator);
        return linkField;
    }
}
