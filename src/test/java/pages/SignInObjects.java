package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class SignInObjects {

	static By signInButton = By.cssSelector(".user");
	static By inputTel = By.xpath(
			"//body[@class='fontLoaded']/div[@role='dialog']/div[@role='document']/div//section[@class='login-section']//section[@class='login-section-left-content']/form//input[@value='']");
	static By continueButton = By.cssSelector("form button");
	static By contactSupport = By.linkText("CONTACT SUPPORT");
	static By otp1 = By.cssSelector(".login-otp-input-container .input-group:nth-of-type(1)");
	static By otp2 = By.cssSelector(".login-otp-input-container .input-group:nth-of-type(2)");
	static By otp3 = By.cssSelector(".login-otp-input-container .input-group:nth-of-type(3)");
	static By otp4 = By.cssSelector(".login-otp-input-container .input-group:nth-of-type(4)");
	static By otp5 = By.cssSelector(".login-otp-input-container .input-group:nth-of-type(5)");
	static By otp6 = By.cssSelector(".login-otp-input-container .input-group:nth-of-type(6)");



    WebDriver driver;

    public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void signIn() {

        driver.findElement(signInButton).click();
		driver.findElement(inputTel).sendKeys("9968259396");
		driver.findElement(continueButton).click();
	}

	public boolean otpScreen() {

        if (driver.findElement(contactSupport).isDisplayed()) return true;
        else return false;

	}


}
