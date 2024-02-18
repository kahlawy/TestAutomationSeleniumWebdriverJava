import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        WebElement gender = driver.findElement(By.id("gender-male"));
        WebElement firstName = driver.findElement(By.name("FirstName"));
        WebElement lastName = driver.findElement(By.id("LastName"));


        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue("1");

        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByIndex(3);

        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByVisibleText("1917");

        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        WebElement company = driver.findElement(By.id("Company"));
        WebElement newsLatter = driver.findElement(By.name("Newsletter"));
        WebElement password = driver.findElement(By.cssSelector("#Password"));
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
        WebElement loginBtn = driver.findElement(By.id("register-button"));

        gender.click();
        firstName.sendKeys("Ahmed");
        lastName.sendKeys("Ali");
        email.sendKeys("ahmedali@outlook.com");
        company.sendKeys("Nezam");
        newsLatter.click();
        password.sendKeys("1235896ass");
        confirmPassword.sendKeys("1235896ass");
        loginBtn.click();




    }

}
