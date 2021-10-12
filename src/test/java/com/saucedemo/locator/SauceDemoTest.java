package com.saucedemo.locator;

import com.saucedemo.locator.page_object.DriverProvider;
import com.saucedemo.locator.page_object.LoginPage;
import org.testng.annotations.Test;

public class SauceDemoTest {

    @Test
    public void logInTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        DriverProvider.quit();
    }
}
