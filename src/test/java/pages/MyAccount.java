package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {

    // <-- WebDriver initialisation -->

    WebDriver driver;

    // <-- Web Elements on page -->

    By userDetails = By.cssSelector(".userDetails");
    By cashWallet = By.cssSelector("[href='\\/account\\/winnings']");
    By coinsWallet = By.cssSelector(".tabBlock [href='\\/account\\/coins']");
    By referral = By.linkText("Referral Refer a friend and earn 24 coins");
    By messageInbox = By.linkText("Message Inbox Get updates & offers");
    By helpSupport = By.cssSelector(".tabBlock .false:nth-child(5)");
    By withdrawButton = By.cssSelector(".header-button");
    By getMoreCoinsButton = By.cssSelector(".header-button");
    By shareReferralButton = By.cssSelector(".share-dialog-children");
    By howReferralWorks = By.cssSelector(".howItWorks");
    By messageInboxTabs = By.cssSelector(".tabContent");


    // <-- Check and return web elements on the web page -->

    public boolean userDetailsIsPresent(){

        return driver.findElement(userDetails).isDisplayed();
    }

    public boolean cashWalletIsPresent(){

        return driver.findElement(cashWallet).isDisplayed();
    }

    public boolean coinsWalletIsPresent(){

        return driver.findElement(coinsWallet).isDisplayed();
    }

    public boolean referralIsPresent(){

        return driver.findElement(referral).isDisplayed();
    }

    public boolean messageBoxIsPresent(){

        return driver.findElement(messageInbox).isDisplayed();
    }

    public boolean helpSupportIsPresent(){

        return driver.findElement(helpSupport).isDisplayed();
    }

    public boolean withDrawButtonIsPresent(){

        return driver.findElement(withdrawButton).isDisplayed();
    }

    public boolean myCoinsIsWorking(){

        driver.findElement(coinsWallet).click();
        return  driver.findElement(getMoreCoinsButton).isDisplayed();
    }

    public boolean referralIsWorking(){

        driver.findElement(referral).click();
        return driver.findElement(shareReferralButton).isDisplayed();
    }

    public boolean howItWorksLinkIsWorking(){

        driver.findElement(referral).click();
        return driver.findElement(howReferralWorks).isEnabled();
    }

    public boolean messageBoxIsWorking(){

        driver.findElement(messageInbox).click();
        return driver.findElement(messageInboxTabs).isDisplayed();
    }

    

    


}
