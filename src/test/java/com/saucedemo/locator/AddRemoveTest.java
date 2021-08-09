package com.saucedemo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddRemoveTest {

    @Test
    public void addRemoveProducts() {

        System.setProperty(
                "webdriver.chrome.driver",
                "F:\\QA12WorkSpace\\Webdriver1\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit'][value='Login']"));
        loginButton.click();

        WebElement addProduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addProduct.click();
        WebElement addAnotherProduct = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
        addAnotherProduct.click();
        WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
        shoppingCart.click();

        WebElement removeProduct = driver.findElement(By.name("remove-sauce-labs-backpack"));
        removeProduct.click();
        WebElement continueShopping = driver.findElement(By.name("continue-shopping"));
        continueShopping.click();
        driver.quit();
    }
}