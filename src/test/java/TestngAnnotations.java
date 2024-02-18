import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAnnotations {

    WebDriver driver = new EdgeDriver();

    @BeforeTest
    public void navigateToGoogle(){
        driver.get("https://www.google.com");
    }

//    @Test(priority = 2)
//    public void verifyTitle(){
//        String webName = driver.getTitle();
//        Assert.assertEquals(webName,"Google");
//    }

    @Test(priority = 1)
    public void verifyURL() {
        String actualWebURL = driver.getCurrentUrl();
        String webName = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        Assert.assertTrue(actualWebURL.contains("google"));
        Assert.assertEquals(webName,"Google");

        softAssert.assertTrue(actualWebURL.contains("ggle"),"URL");
        softAssert.assertEquals(webName,"Google","Title");
        softAssert.assertAll();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
