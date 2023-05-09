package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddToCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement os;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement getAddToCartText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement getAddToCartSuccessfull;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCart;


    public String verifyBuildYourOwnComputerText() {
        CustomListeners.test.log(Status.PASS, "Get Text Build your own computer");
        Reporter.log("Get Text Build your own computer" + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor() {
        Reporter.log("Select 2.2 GHz Intel Pentium Dual-Core E2200" + processor.toString());
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
        CustomListeners.test.log(Status.PASS, "Select 2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRam() {
        Reporter.log("Select 8GB [+$60.00]" + ram.toString());
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");
        CustomListeners.test.log(Status.PASS, "Select 8GB [+$60.00]");
    }

    public void selectHDD() {
        Reporter.log("Select HDD" + hdd.toString());
        clickOnElement(hdd);
        CustomListeners.test.log(Status.PASS, "Select HDD");
    }

    public void selectOS() {
        Reporter.log("Select OS" + os.toString());
        clickOnElement(os);
        CustomListeners.test.log(Status.PASS, "Select OS");
    }

    public void selectSoftware() {
        Reporter.log("Select Software" + software.toString());
        clickOnElement(software);
        CustomListeners.test.log(Status.PASS, "Select Software");
    }

    public String verifyThePrice() {
        Reporter.log("Verify Price" + price.toString());
        CustomListeners.test.log(Status.PASS, "Verify Price");
        return getTextFromElement(price);
    }

    public void clickOnAddToCart() {
        Reporter.log("Get Text Add to Cart" + getAddToCartText.toString());
        clickOnElement(getAddToCartText);
        CustomListeners.test.log(Status.PASS, "Get Text Add to Cart");
    }

    public String verifyAddToCartSuccessfully() {
        Reporter.log("Get Text Add to Cart Successfully" + getAddToCartText.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Add to Cart");
        return getTextFromElement(getAddToCartSuccessfull);
    }

    public void clickOnCrossButton() {
        Reporter.log("Click on cross button" + crossButton.toString());
        clickOnElement(crossButton);
        CustomListeners.test.log(Status.PASS, "Click on cross button");
    }

    public void mouceHoverToShopingCart() {
        Reporter.log("Mouse Hover to Shopping Cart" + shoppingCart.toString());
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Mouse Hover to Shopping Cart");
    }

    public void clickOnGoToCart() {
        Reporter.log("Click on Go to Cart" + goToCart.toString());
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Click on Go to Cart");
    }

}
