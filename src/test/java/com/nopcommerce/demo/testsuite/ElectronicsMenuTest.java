package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsMenuTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    AddToCartPage addToCartPage;
    ShoppingCartPage shoppingCartPage;
    CheckOutPage checkOutPage;
    GuestCheckOutPage guestCheckOutPage;
    CellPhonesPage cellPhonesPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        addToCartPage = new AddToCartPage();
        shoppingCartPage = new ShoppingCartPage();
        checkOutPage = new CheckOutPage();
        guestCheckOutPage = new GuestCheckOutPage();
        cellPhonesPage = new CellPhonesPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        homePage.mouseHoverToElectronic();
        Thread.sleep(1000);
        homePage.mouseHoverToElectronicAndClickOnCellPhone();
        Assert.assertEquals(cellPhonesPage.verifyTextCellPhone(), "Cell phones");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverToElectronic();
        homePage.mouseHoverToElectronicAndClickOnCellPhone();
        Assert.assertEquals(cellPhonesPage.verifyTextCellPhone(), "Cell phones");
        cellPhonesPage.clickOnListView();
        Thread.sleep(2000);
        cellPhonesPage.clickOnNokiaLumia1020();
        Assert.assertEquals(cellPhonesPage.verifyTextNokiaLumia1020(), "Nokia Lumia 1020");
        Assert.assertEquals(cellPhonesPage.verifyPrice(), "$349.00");
        cellPhonesPage.changeThatQty();
        cellPhonesPage.clickOnAddToCart();
        Assert.assertEquals(cellPhonesPage.verifyAddToCartSuccessfully(), "The product has been added to your shopping cart");
        cellPhonesPage.clickOnCrossButton();
        cellPhonesPage.mouseHoverToShoppingCart();
        shoppingCartPage.verifyShoppingCartText();
        Assert.assertEquals(shoppingCartPage.verifyQty(), "2");
        Assert.assertEquals(shoppingCartPage.verifyPriceText(), "$698.00");
    }
}
