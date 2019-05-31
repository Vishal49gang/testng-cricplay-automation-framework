package tests;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePreLoginObjects;

public class TestHomePreLogin {

    // <-- Setting up -->

    static WebDriver driver;
    static HomePreLoginObjects obj1 = new HomePreLoginObjects();
    static com.aventstack.extentreports.ExtentReports extent;
    static ExtentHtmlReporter htmlReporter;

    @BeforeSuite
    public void setupTest() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://qa.cricplay.com");
        obj1.setDriver(driver);
        System.out.println("Home Page Test Starts");

        htmlReporter = new ExtentHtmlReporter("extentReport.html");
        extent = new com.aventstack.extentreports.ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    // <-- Testing starts -->

    @Test
    public void homeSectionsTest() {

        ExtentTest test = extent.createTest("Home sections","App sections is displayed test");
        Assert.assertTrue(obj1.homeSectionsIsDisplayed());
        test.pass("Home sections displayed");

    }

    @Test
    public static void pvtCardTest() {

        Assert.assertTrue(obj1.joinPvtCardIsDisplayed());
    }

    @Test
    public static void referCard() {

        Assert.assertTrue(obj1.referWithFriendCardIsDisplayed());

    }

    @Test
    public static void coinsWalletTest(){

        Assert.assertTrue(obj1.coinsWalletIsDisplayed());
    }

    // <-- Tests ends here -->

    @AfterSuite
    public void tearDownTest() {

        driver.quit();
        System.out.println("Completed Successfully");
        extent.flush();

    }
}
