package com.saucedemo.locator;

import com.saucedemo.locator.page_object.DriverProvider;
import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import com.saucedemo.locator.page_object.ShoppingCartPage;
import org.testng.annotations.Test;

public class AddRemoveTest {

    @Test
    public void addRemoveProducts() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        HomePage homePage = new HomePage();
        homePage.addFirstProduct();
        homePage.addSecondProduct();
        homePage.goToShoppingCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.removeProductFromCart();
        shoppingCartPage.backToShopping();
        DriverProvider.quit();

    }
}