package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement getShoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "(//strong[text()='$2,950.00'])[2]")
    WebElement getPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement getQty;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement getTextPrice;

    public String verifyShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "verify shopping cart text");
        Reporter.log("verify shopping text" + getShoppingCartText.toString());
        return getTextFromElement(getShoppingCartText);
    }

    public void changeTheQuantity() {
        clickOnElement(changeQty);
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(changeQty, "2");
        clickOnElement(updateCart);
        CustomListeners.test.log(Status.PASS, "change the quantity");
        Reporter.log("change the quantity" + changeQty.toString());

    }

    public String verifyTotalPrice() {
        CustomListeners.test.log(Status.PASS, "verify total price");
        Reporter.log("verify total price" + getPriceText.toString());
        return getTextFromElement(getPriceText);
    }

    public void clickOnCheckBox() {
        CustomListeners.test.log(Status.PASS, "click on check box");
        Reporter.log("click on check box" + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String verifyQty() {
        String expectedQty = "2";
        WebElement actualElement = getQty;
        String actualQty = actualElement.getAttribute("value");
        CustomListeners.test.log(Status.PASS, "verify Qty");
        Reporter.log("verify Qty" + getQty.toString());
        return actualQty;
    }

    public String verifyPriceText() {
        CustomListeners.test.log(Status.PASS, "verify price text");
        Reporter.log("verify price text" + getTextPrice.toString());
        return getTextFromElement(getTextPrice);
    }

}
