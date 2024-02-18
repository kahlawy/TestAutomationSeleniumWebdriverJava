package org.demo.tests;

import org.demo.pages.BasePage;
import org.demo.pages.HomePage;
import org.demo.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    //Configurations

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected RegistrationPage registrationPage;

    @BeforeTest
    public void loadApplication(){
        driver = new EdgeDriver();
        basePage = new BasePage();
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
        basePage.setDriver(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }







}
