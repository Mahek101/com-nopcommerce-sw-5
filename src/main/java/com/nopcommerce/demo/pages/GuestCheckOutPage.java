package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GuestCheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "BillingNewAddress.Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;
    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[1]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAirButton;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[4]")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement masterCard;
    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement cardholderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[5]")
    WebElement getContinueButton3;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement getTextCreditCard;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement getTextOfShippingethod;
    @CacheLookup
    @FindBy(xpath = "(//strong[text()='$2,950.00'])[2]")
    WebElement getTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement getThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement getOrderProcessedText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButton4;

    public void enterDetails() {
        CustomListeners.test.log(Status.PASS, "enter first name");
        Reporter.log("enter first name" + firstNameField.toString());
        sendTextToElement(firstNameField, "Xyz");
        CustomListeners.test.log(Status.PASS, "enter last name");
        Reporter.log("enter last name" + lastNameField.toString());
        sendTextToElement(lastNameField, "Patel");
        CustomListeners.test.log(Status.PASS, "enter email");
        Reporter.log("enter email" + emailField.toString());
        sendTextToElement(emailField, "abcxyz@gmail.com");
        CustomListeners.test.log(Status.PASS, "enter country");
        Reporter.log("enter country" + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, "United Kingdom");
        CustomListeners.test.log(Status.PASS, "enter city");
        Reporter.log("enter city" + cityField.toString());
        sendTextToElement(cityField, "London");
        CustomListeners.test.log(Status.PASS, "enter address");
        Reporter.log("enter address" + addressField.toString());
        sendTextToElement(addressField, "129 Pinner Road");
        CustomListeners.test.log(Status.PASS, "enter postcode");
        Reporter.log("enter postcode" + postCodeField.toString());
        sendTextToElement(postCodeField, "NW11AD");
        CustomListeners.test.log(Status.PASS, "enter phone number field");
        Reporter.log("enter phone number field" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, "01234567890");
    }

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS, "click on continue button");
        Reporter.log("click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAir() {
        CustomListeners.test.log(Status.PASS, "click on next day air");
        Reporter.log("click on next day air" + nextDayAirButton.toString());
        clickOnElement(nextDayAirButton);
    }

    public void clickOnContinue() {
        CustomListeners.test.log(Status.PASS, "click on continue button");
        Reporter.log("click on continue button" + continueButton.toString());
        clickOnElement(continueButton1);
    }

    public void clickOnCreditCard() {
        CustomListeners.test.log(Status.PASS, "click on credit card");
        Reporter.log("click on credit card" + creditCard.toString());
        clickOnElement(creditCard);
    }

    public void clickOnContinue1() {
        CustomListeners.test.log(Status.PASS, "click on continues");
        Reporter.log("click on continues" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    public void selectMasterCard() {
        CustomListeners.test.log(Status.PASS, "select master card");
        Reporter.log("select master card" + masterCard.toString());
        selectByValueFromDropDown(masterCard, "MasterCard");
    }

    public void enterDetailsOfCard() {
        CustomListeners.test.log(Status.PASS, "enter card holder name");
        Reporter.log("enter card holder name" + cardholderName.toString());
        sendTextToElement(cardholderName, "MR NO ONE");
        CustomListeners.test.log(Status.PASS, "enter card number");
        Reporter.log("enter card number" + cardNumber.toString());
        sendTextToElement(cardNumber, "5100 0000 0000 0511");
        CustomListeners.test.log(Status.PASS, "enter month");
        Reporter.log("enter month" + month.toString());
        selectByVisibleTextFromDropDown(month, "01");
        CustomListeners.test.log(Status.PASS, "enter year");
        Reporter.log("enter year" + year.toString());
        selectByVisibleTextFromDropDown(year, "2026");
        CustomListeners.test.log(Status.PASS, "enter card code");
        Reporter.log("enter card code" + cardCode.toString());
        sendTextToElement(cardCode, "123");
    }

    public void clickOnContinueButton3() {
        CustomListeners.test.log(Status.PASS, "click on continue button3");
        Reporter.log("click on continue button3" + getContinueButton3.toString());
        clickOnElement(getContinueButton3);
    }

    public String verifyCreditCardPaymentMethod() {
        CustomListeners.test.log(Status.PASS, "verify credit card payment method");
        Reporter.log("verify credit card payment method" + getTextCreditCard.toString());
        return getTextFromElement(getTextCreditCard);
    }

    public String verifyShippingMethod() {
        CustomListeners.test.log(Status.PASS, "verify shipping method");
        Reporter.log("verify shipping method" + getTextOfShippingethod.toString());
        return getTextFromElement(getTextOfShippingethod);
    }

    public String verifyTotalPrice() {
        CustomListeners.test.log(Status.PASS, "verify total price");
        Reporter.log("verify total price" + getTotalPrice.toString());
        return getTextFromElement(getTotalPrice);
    }

    public void clickOnConfirm() {
        CustomListeners.test.log(Status.PASS, "click on confirm");
        Reporter.log("click on confirm" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouMessage() {
        CustomListeners.test.log(Status.PASS, "verify thank you message");
        Reporter.log("verify thank you message" + getThankYouText.toString());
        return getTextFromElement(getThankYouText);
    }

    public String verifyOrderPlacedSuccessfullyText() {
        CustomListeners.test.log(Status.PASS, "verify order placed successfully text");

        Reporter.log("verify order placed successfully text" + getOrderProcessedText.toString());
        return getTextFromElement(getOrderProcessedText);
    }

    public void clickOnContinueButton4() {
        CustomListeners.test.log(Status.PASS, "click on continue button4");
        Reporter.log("click on continue button4" + continueButton4.toString());
        clickOnElement(continueButton4);
    }
}
