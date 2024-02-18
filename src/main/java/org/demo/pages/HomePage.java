package org.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

    private final By registerBTN = By.linkText("Register");
    private final By currencyBTN = By.id("customerCurrency");

    public void clickRegisterBTN(){
        click(registerBTN);
    }

    public void selectEuroCurrency(){
        Select s = new Select(find(currencyBTN));
        s.selectByIndex(1);
    }

    public String getEuroText(){
        return find(currencyBTN).getText();
    }


}
