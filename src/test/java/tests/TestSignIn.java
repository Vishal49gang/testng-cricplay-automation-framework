package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SignInObjects;

public class TestSignIn {

    // <-- Setting up -->

    static WebDriver driver = null;
    static SignInObjects obj = new SignInObjects();
    static com.aventstack.extentreports.ExtentReports extent;
    static ExtentHtmlReporter htmlReporter;

    @BeforeSuite
    public void setupTest() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://qa.cricplay.com");
        obj.setDriver(driver);

        htmlReporter = new ExtentHtmlReporter("/Users/Shared/paste/extentReport.html");
        extent = new com.aventstack.extentreports.ExtentReports();
        extent.attachReporter(htmlReporter);


    }

    // <-- Tests starts -->

    @Test
    public static void contactLink(){

        ExtentTest test = extent.createTest("Contact us test", "Check whether contact us is present");
        Assert.assertTrue(obj.otpScreen());
        test.pass("Test passed");

    }

    @Test
    public static void sign(){

        obj.signIn();
    }

    // <-- Tests ends -->

    @AfterSuite
    public void tearDownTest() {

        driver.quit();
        System.out.println("Completed Successfully");

    }

}
