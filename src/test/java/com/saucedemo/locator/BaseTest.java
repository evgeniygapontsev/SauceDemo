package com.saucedemo.locator;

import com.saucedemo.locator.page_object.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import static com.saucedemo.locator.page_object.DriverProvider.quit;


public class BaseTest {


    @AfterMethod
    public void driverQuit() {
        DriverProvider.quit();
    }
}

