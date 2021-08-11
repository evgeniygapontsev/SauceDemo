package com.saucedemo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest {

    @Test
    public void logInTest() {
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

        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
        WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
        shoppingCart.click();

        WebElement confirmationProductNameElement = driver.findElement(By.className("inventory_item_name"));
        String productName = confirmationProductNameElement.getText();
        Assert.assertEquals(productName, "Sauce Labs Backpack");

        WebElement confirmationPriceElement = driver.findElement(By.className("inventory_item_price"));
        String itemPrice = confirmationPriceElement.getText();
        Assert.assertEquals(itemPrice, "$29.99");

    }
}
