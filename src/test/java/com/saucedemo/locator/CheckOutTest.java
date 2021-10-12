package com.saucedemo.locator;

import com.saucedemo.locator.page_object.*;
import org.testng.annotations.Test;

public class CheckOutTest{

    @Test
    public void checkOutTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        HomePage homePage = new HomePage();
        homePage.addFirstProduct();
        homePage.goToShoppingCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.checkOut();
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage();
        checkoutInfoPage.enterInfo("Bilbo", "Baggins", "220020");
        checkoutInfoPage.contButton();
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutOverviewPage.finishCheckout();
        DriverProvider.quit();

    }
}
