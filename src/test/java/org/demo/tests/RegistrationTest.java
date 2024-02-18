package org.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void verifyValidRegistration() {
        homePage.clickRegisterBTN();
        registrationPage.setUserData();
        registrationPage.setDate();
        registrationPage.clickRegisterBtn();
        String actualRegistrationMsg = registrationPage.actualRegistrationStatus();
        Assert.assertEquals(actualRegistrationMsg,"Your registration completed");
    }

}
