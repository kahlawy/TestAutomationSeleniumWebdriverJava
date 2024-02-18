package org.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {

    protected static WebDriver driver;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void send(By locator, String text){
        find(locator).sendKeys(text);
    }

}
