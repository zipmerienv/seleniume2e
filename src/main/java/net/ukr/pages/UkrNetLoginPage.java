package net.ukr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UkrNetLoginPage {

    private WebDriver driver;

    private By loginFieldLocator = By.xpath("//*[@id=\"user-login-form\"]/input[2]]");
    private WebElement loginField;
    private String email = "'mariiiii@ukr.net";

    private By passFiekdLocator = By.xpath("//*[@id=\"user-login-form\"]/input[3]");
    private WebElement passField;
    private String password = "Samer300815";

    private By subButtonLocator = By.xpath("//*[@id=\"user-login-form\"]/div[2]/div/button");
    private WebElement suBbutton;


    public UkrNetLoginPage(WebDriver driver){
        this.driver = driver;
    }


    public void logIn(String email, String password){

        loginField = driver.findElement(loginFieldLocator);
        loginField.sendKeys(email);

        passField = driver.findElement(passFiekdLocator);
        passField.sendKeys(password);

        suBbutton = driver.findElement(subButtonLocator);
    }
}
