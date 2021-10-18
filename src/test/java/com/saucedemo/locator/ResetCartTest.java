package com.saucedemo.locator;

import com.saucedemo.locator.page_object.DriverProvider;
import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import org.testng.annotations.Test;

public class ResetCartTest {

    @Test
    public void resetAppState() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        HomePage homePage = new HomePage();
        homePage.addFirstProduct();
        homePage.openBurgerMenu();
        homePage.resetApp();
        homePage.goToShoppingCart();
        DriverProvider.quit();

    }
}
