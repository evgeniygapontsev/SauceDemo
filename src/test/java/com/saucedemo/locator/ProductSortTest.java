package com.saucedemo.locator;

import com.saucedemo.locator.page_object.DriverProvider;
import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import org.testng.annotations.Test;


public class ProductSortTest{


    @Test
    public void productSort() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        HomePage homePage = new HomePage();
        homePage.productSort();
        homePage.openBurgerMenu();
        homePage.logout();
        DriverProvider.quit();

    }
}
