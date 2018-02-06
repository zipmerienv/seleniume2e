package com.google2.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResultPage{

    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id='rso']/div[1]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/h3/a")
    private WebElement linkField;

    public GoogleSearchResultPage (WebDriver driver){this.driver = driver;}

    public WebElement findElement(){
        //настраиваем дефолтное ожидание
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element =
                wait.until(ExpectedConditions.elementToBeClickable(linkField));
        return linkField;
    }
}
