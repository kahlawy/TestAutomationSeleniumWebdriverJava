package org.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class RegistrationPage extends BasePage{

    private final By maleGender = By.id("gender-male");
    private final By firstName = By.id("FirstName");
    private final By lastName = By.id("LastName");
    private final By dayBtn = By.name("DateOfBirthDay");
    private final By yearBtn = By.name("DateOfBirthYear");
    private final By monthBtn = By.name("DateOfBirthMonth");
    private final By email = By.id("Email");
    private final By companyName = By.name("Company");
    private final By password = By.id("Password");
    private final By confirmPassword = By.id("ConfirmPassword");
    private final By registerBtn = By.name("register-button");
    private final By registrationSuccessMsg = By.className("result");

    public void setDate(){
        Select day = new Select(find(dayBtn));
        Select month = new Select(find(monthBtn));
        Select year = new Select(find(yearBtn));
        day.selectByIndex(2);
        month.selectByIndex(2);
        year.selectByIndex(5);
    }

    public void setUserData(){
        send(firstName,"Mahmoud");
        send(lastName,"Kareem");
        click(maleGender);
        send(email,"mahmoud@outlook.com");
        send(companyName,"vois");
        send(password,"123456@A");
        send(confirmPassword,"123456@A");
    }

    public void clickRegisterBtn(){
        click(registerBtn);
    }

    public String actualRegistrationStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(registrationSuccessMsg)).getText();

    }
}
