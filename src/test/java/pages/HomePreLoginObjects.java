package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePreLoginObjects {

	// <-- Setting up -->

    WebDriver driver;

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	// <-- Web page elements -->

	By home_sections = By.cssSelector(".tab-pills");
	By joinPvtCon_card = By.cssSelector(".join-private-contest");
	static By referWithFriend_card = By.cssSelector(".refer-to-earn");
	By coin_wallet = By.cssSelector(".user-profile-section-list-item-link");


	// <-- Tests Starts here -->

	public boolean homeSectionsIsDisplayed() {

	    return driver.findElement(home_sections).isDisplayed();
	}

	public boolean joinPvtCardIsDisplayed() {

		return driver.findElement(joinPvtCon_card).isDisplayed();

	}

	public boolean referWithFriendCardIsDisplayed() {

		return driver.findElement(referWithFriend_card).isDisplayed();

	}

	public boolean coinsWalletIsDisplayed(){

		return driver.findElement(coin_wallet).isDisplayed();
	}

}
