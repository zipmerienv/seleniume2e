package net.ukr.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UrkNetHomePage {

    private WebDriver driver;
    private By textLocator = By.xpath("");
    private WebElement textLine;


    public UrkNetHomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findElement(){
        textLine  = driver.findElement(textLocator);
        return textLine;
    }
}
