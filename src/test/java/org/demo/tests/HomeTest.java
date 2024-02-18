package org.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{


    @Test
    public void verifyClickingOnRegisterBTN(){
        homePage.clickRegisterBTN();
        String actualCurrentURL = driver.getCurrentUrl();
        Assert.assertEquals(actualCurrentURL,"https://demo.nopcommerce.com/register?returnUrl=%2F","Check Register Button");
    }

    @Test
    public void verifyEuroText(){
        //Navigate to the website

        //Locate the element
        //Select Euro Option
        homePage.selectEuroCurrency();
        //Assert actual text and expected text
        String actualText = homePage.getEuroText();
        Assert.assertTrue(actualText.contains("ro"));

    }

}
