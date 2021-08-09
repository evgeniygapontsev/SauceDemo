package com.saucedemo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProductSortTest {

    @Test
    public void productSort() {
        System.setProperty(
                "webdriver.chrome.driver",
                "F:\\QA12WorkSpace\\Webdriver1\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);


        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit'][value='Login']"));
        loginButton.click();

        WebElement productSortContainer = driver.findElement(
                By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        productSortContainer.click();
        WebElement fromZToASort = driver.findElement(
                By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        fromZToASort.click();
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        productSortContainer.click();
        WebElement fromLowToHigh = driver.findElement(
                By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]"));
        fromLowToHigh.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        productSortContainer.click();
        WebElement fromHighToLow = driver.findElement(
                By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]"));
        fromHighToLow.click();

    }
}
