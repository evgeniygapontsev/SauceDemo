package com.saucedemo.locator;

import com.saucedemo.locator.page_object.DriverProvider;
import org.testng.annotations.AfterTest;


    public class BaseTest {
        @AfterTest
        public void afterTest() {
            DriverProvider.quit();
        }

    }
