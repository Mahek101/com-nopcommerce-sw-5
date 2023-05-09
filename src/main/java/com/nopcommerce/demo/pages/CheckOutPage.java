package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement getWelcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuest;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement loginLink;


    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkOutBox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countrySelection;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateSelection;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement month;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cvvCode;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;
    @CacheLookup
    @FindBy(xpath = "//div[@class='payment-method-info']/ul/li")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//div[@class='shipping-method-info']/ul/li")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//tr[@class ='order-total']/td[2]/span//strong[text()='$698.00']")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']//button")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement getThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement getOrderPlacedText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButton4;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement getWelcomeToOurStore;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continue5;

    public String verifyWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Get text Welcome");
        Reporter.log("Get text Welcome" + getWelcomeText.toString());
        return getTextFromElement(getWelcomeText);
    }

    public void clickOnCheckOutAsGuest() {
        Reporter.log("Click on checkout automation" + checkOutAsGuest.toString());
        clickOnElement(checkOutAsGuest);
        CustomListeners.test.log(Status.PASS, "Click on checkout automation");
    }

    public void clickOnCheckOutBox() {
        Reporter.log("Click on Check Out Box" + checkOutBox.toString());
        clickOnElement(checkOutBox);
        CustomListeners.test.log(Status.PASS, "Click on Check Out Box");
    }

    public void clickOnCheckOutButton() {
        Reporter.log("Click on Check Out Button" + checkOutButton.toString());
        clickOnElement(checkOutButton);
        CustomListeners.test.log(Status.PASS, "Click on Check Out Button");
    }


    public void clickOnContinue() {
        Reporter.log("Click on Continue Button" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }

    public void clickOnradioButton() {
        Reporter.log("Click on Radio Button" + radioButton.toString());
        clickOnElement(radioButton);
        CustomListeners.test.log(Status.PASS, "Click on Radio Button");
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on Continue Button" + continueButton1.toString());
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }

    public void clickOnCreditCard() {
        Reporter.log("Click on Credit card option" + creditCard.toString());
        clickOnElement(creditCard);
        CustomListeners.test.log(Status.PASS, "Click on Credit card option");
    }

    public void selectCardType() {
        Reporter.log("Select Card Type" + cardType.toString());
        selectByVisibleTextFromDropDown(cardType, "Visa");
        CustomListeners.test.log(Status.PASS, "Select Card Type");
    }

    public void enterCardDetails() {
        Reporter.log("Select Card Holder name" + cardHolderName.toString());
        sendTextToElement(cardHolderName, "XYZ NO ONE");
        CustomListeners.test.log(Status.PASS, "Select Card Holder name");
        Reporter.log("Enter Card number" + cardNumber.toString());
        sendTextToElement(cardNumber, "5100 0000 0000 0511");
        CustomListeners.test.log(Status.PASS, "Enter Card number");
        Reporter.log("Enter month" + month.toString());
        selectByVisibleTextFromDropDown(month, "01");
        CustomListeners.test.log(Status.PASS, "Enter month");
        Reporter.log("Select year" + year.toString());
        selectByVisibleTextFromDropDown(year, "2026");
        CustomListeners.test.log(Status.PASS, "Select year");
        Reporter.log("Enter CVV" + cvvCode.toString());
        sendTextToElement(cvvCode, "123");
        CustomListeners.test.log(Status.PASS, "Enter CVV");
    }

    public void clickOnContinueButton2() {
        Reporter.log("Click on Continue Button" + continueButton2.toString());
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }

    public void clickOnContinueButton3() {
        Reporter.log("Click on Continue Button" + continueButton3.toString());
        clickOnElement(continueButton3);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }

    public String verifyPaymentMethod() {
        Reporter.log("Get Text Payment Method" + paymentMethod.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Payment Method");
        return getTextFromElement(paymentMethod);
    }

    public String verifyShippingMethod() {
        Reporter.log("Get Text Shipping Method" + shippingMethod.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Payment Method");
        return getTextFromElement(shippingMethod);
    }

    public String verifyTotalPrice() {
        Reporter.log("Get Text Total Price" + totalPrice.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Total Price");
        return getTextFromElement(totalPrice);
    }

    public void clickOnConfirm() {
        Reporter.log("Click on Confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
        CustomListeners.test.log(Status.PASS, "Click on Confirm button");
    }

    public String verifyThankYouMessage() {
        Reporter.log("Get Text Thank You" + getThankYouText.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Thank You");
        return getTextFromElement(getThankYouText);
    }

    public String verifyOrderPlacedMessageText() {
        Reporter.log("Get Text Order Placed" + getOrderPlacedText.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Order Placed");
        return getTextFromElement(getOrderPlacedText);
    }

    public void clickOnContinueButton4() {
        Reporter.log("Click on continue button" + continueButton4.toString());
        clickOnElement(continueButton4);
        CustomListeners.test.log(Status.PASS, "Click on continue button");
    }

    public String verifyWelcomeToOurStoreText() {
        Reporter.log("Get Text Welcome to Our Store" + getWelcomeToOurStore.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Welcome to Our Store");
        return getTextFromElement(getWelcomeToOurStore);
    }

    public void clickOnLogOutLink() {
        Reporter.log("Click on Log out Link" + loginLink.toString());
        clickOnElement(logoutLink);
        CustomListeners.test.log(Status.PASS, "Click on Log out Link");
    }

    public String verifyCurrentUrl() {
        Reporter.log("Get text of Current URL" + driver.getCurrentUrl().toString());
        CustomListeners.test.log(Status.PASS, "Get text of Current UR");
        return driver.getCurrentUrl();
    }
}
