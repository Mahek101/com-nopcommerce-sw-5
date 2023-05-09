package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement getTextCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement getTextNokia;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement getPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement addToCartSuccessfully;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;


    public String verifyTextCellPhone() {
        CustomListeners.test.log(Status.PASS, "Get Text Cell Phone");
        Reporter.log("Get Text Cell Phone" + getTextCellPhone.toString());
        return getTextFromElement(getTextCellPhone);
    }

    public void clickOnListView() {
        CustomListeners.test.log(Status.PASS, "Click on List View");
        clickOnElement(listView);
        Reporter.log("Click on List View" + listView.toString());
    }

    public void clickOnNokiaLumia1020() {
        CustomListeners.test.log(Status.PASS, "Click on Nokia Lumia 1020");
        clickOnElement(nokiaLumia1020);
        Reporter.log("Click on List View" + listView.toString());
    }

    public String verifyTextNokiaLumia1020() {
        CustomListeners.test.log(Status.PASS, "Click on Nokia Lumia 1020");
        Reporter.log("Click on List View" + listView.toString());
        return getTextFromElement(getTextNokia);
    }

    public String verifyPrice() {
        CustomListeners.test.log(Status.PASS, "Get Price Text");
        Reporter.log("Get Price Text" + getPrice.toString());
        return getTextFromElement(getPrice);
    }

    public void changeThatQty() {
        Reporter.log("Change Qty" + changeQty.toString());
        clickOnElement(changeQty);
        changeQty.clear();
        sendTextToElement(changeQty, "2");
        CustomListeners.test.log(Status.PASS, "Change Qty");
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart" + addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart");
    }

    public String verifyAddToCartSuccessfully() {
        Reporter.log("Get text Add to Cart Successfully" + addToCartSuccessfully.toString());
        CustomListeners.test.log(Status.PASS, "Get text Add to Cart Successfully");
        return getTextFromElement(addToCartSuccessfully);
    }

    public void clickOnCrossButton() {
        Reporter.log("Click on Cross Button" + crossButton.toString());
        clickOnElement(crossButton);
        CustomListeners.test.log(Status.PASS, "Click on Cross Button");
    }

    public void mouseHoverToShoppingCart() {
        Reporter.log("Mouse hover to Shopping cart" + goToCart.toString());
        mouseHoverToElement(shoppingCart);
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover to Shopping cart");
    }
}
