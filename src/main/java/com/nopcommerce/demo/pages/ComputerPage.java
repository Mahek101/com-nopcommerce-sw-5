package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;

    public String verifyComputerText() {
        Reporter.log("Get text Computer" + computerText.toString());
        CustomListeners.test.log(Status.PASS, "Get text Computer");
        return getTextFromElement(computerText);
    }

    public void clickOnDesktop() {
        Reporter.log("Click on Desktop" + desktop.toString());
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS, "Click on Desktop");
    }
}
