package com.google2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static java.util.concurrent.TimeUnit.SECONDS;

// наследуем драйвер и вейт у абстрактного класса
public class GoogleSearchPage extends AbstractPage{

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchField;

    public GoogleSearchPage(WebDriver webDriver){super(webDriver);}

    public void searchForData(String searchData){

        //настраиваем кастомное ожидание
        //Wait<WebDriver> wait = new
                //FluentWait<WebDriver>(driver)
                //.withTimeout(20, SECONDS)
                //.pollingEvery(1, SECONDS)
                //.ignoring(NoSuchElementException.class);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(searchField));

        searchField.sendKeys(searchData);
        searchField.submit();
    }
}
