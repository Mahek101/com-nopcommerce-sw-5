package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BooksPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement booksPage;

    public String getBooksText() {
        Reporter.log("Navigating to Books Page" + booksPage.toString());
        getTextFromElement(booksPage);
        CustomListeners.test.log(Status.PASS, "Navigating to Books Page");
        return booksPage.getText();
    }
}
