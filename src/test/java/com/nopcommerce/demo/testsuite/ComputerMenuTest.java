package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

@Listeners(CustomListeners.class)
public class ComputerMenuTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    AddToCartPage addToCartPage;
    ShoppingCartPage shoppingCartPage;
    CheckOutPage checkOutPage;
    GuestCheckOutPage guestCheckOutPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        addToCartPage = new AddToCartPage();
        shoppingCartPage = new ShoppingCartPage();
        checkOutPage = new CheckOutPage();
        guestCheckOutPage = new GuestCheckOutPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnComputerTab();
        computerPage.clickOnDesktop();
        ArrayList<String> originalProductList = desktopPage.defaultProductList();
        System.out.println(originalProductList);
        Collections.reverse(originalProductList);
        System.out.println(originalProductList);
        desktopPage.sortByPositionByNameZtoA();
        ArrayList<String> afterSortByZtoAList = desktopPage.defaultProductList();
        System.out.println(originalProductList);
        Assert.assertEquals(afterSortByZtoAList, afterSortByZtoAList);

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerTab();
        computerPage.clickOnDesktop();
        desktopPage.sortByPositionByNameZtoA();
        Thread.sleep(1000);
        desktopPage.clickOnAddToCart();
        Assert.assertEquals(addToCartPage.verifyBuildYourOwnComputerText(), "Build your own computer", "Not found");
        addToCartPage.selectProcessor();
        addToCartPage.selectRam();
        addToCartPage.selectHDD();
        addToCartPage.selectOS();
        Thread.sleep(1000);
        addToCartPage.selectSoftware();
        Thread.sleep(2000);
        Assert.assertEquals(addToCartPage.verifyThePrice(), "$1,475.00", "Wrong Price");
        addToCartPage.clickOnAddToCart();
        Assert.assertEquals(addToCartPage.verifyAddToCartSuccessfully(), "The product has been added to your shopping cart");
        addToCartPage.clickOnCrossButton();
        addToCartPage.mouceHoverToShopingCart();
        addToCartPage.clickOnGoToCart();
        Assert.assertEquals(shoppingCartPage.verifyShoppingCartText(), "Shopping cart");
        shoppingCartPage.changeTheQuantity();
        Assert.assertEquals(shoppingCartPage.verifyTotalPrice(), "$2,950.00");
        shoppingCartPage.clickOnCheckBox();
        shoppingCartPage.clickOnCheckOut();
        Assert.assertEquals(checkOutPage.verifyWelcomeText(), "Welcome, Please Sign In!");
        checkOutPage.clickOnCheckOutAsGuest();
        guestCheckOutPage.enterDetails();
        guestCheckOutPage.clickOnContinueButton();
        guestCheckOutPage.clickOnNextDayAir();
        guestCheckOutPage.clickOnContinue();
        guestCheckOutPage.clickOnCreditCard();
        guestCheckOutPage.clickOnContinue1();
        guestCheckOutPage.selectMasterCard();
        guestCheckOutPage.enterDetailsOfCard();
        guestCheckOutPage.clickOnContinueButton3();
        Assert.assertEquals(guestCheckOutPage.verifyCreditCardPaymentMethod(), "Payment Method: Credit Card");
        Assert.assertEquals(guestCheckOutPage.verifyShippingMethod(), "Shipping Method: Next Day Air");
        Assert.assertEquals(guestCheckOutPage.verifyTotalPrice(), "$2,950.00");
        guestCheckOutPage.clickOnConfirm();
        Assert.assertEquals(guestCheckOutPage.verifyThankYouMessage(), "Thank you");
        Assert.assertEquals(guestCheckOutPage.verifyOrderPlacedSuccessfullyText(), "Your order has been successfully processed!");
        guestCheckOutPage.clickOnContinueButton4();
        Assert.assertEquals(homePage.verifyWelcomeText(), "Welcome to our store");
    }
}
