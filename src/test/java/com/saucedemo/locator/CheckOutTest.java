package com.saucedemo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckOutTest {

    @Test
    public void checkOutTest() {
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

        WebElement checkOutButton = driver.findElement(By.name("checkout"));
        checkOutButton.click();

        WebElement inputFirstName = driver.findElement(By.id("first-name"));
        inputFirstName.sendKeys("Bilbo");
        WebElement inputLastName = driver.findElement(By.id("last-name"));
        inputLastName.sendKeys("Baggins");
        WebElement inputPostalCode = driver.findElement(By.name("postalCode"));
        inputPostalCode.sendKeys("220020");

        WebElement continueButton = driver.findElement(By.cssSelector("[type='submit'][value='Continue']"));
        continueButton.click();

        WebElement finishButton = driver.findElement((By.name("finish")));
        finishButton.click();
        driver.quit();
    }
}
