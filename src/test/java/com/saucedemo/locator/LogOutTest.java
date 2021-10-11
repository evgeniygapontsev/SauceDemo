package com.saucedemo.locator;

import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class LogOutTest extends BaseTest {


    @Test(description = "This is LogOut test.")
    public void logOut() {

        login("standard_user", "secret_sauce");
        logout();
    }

    @Step("Login on the site")
    public void login(String userName, String inpPassword) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(userName, inpPassword);
        HomePage homePage = new HomePage();
        homePage.openBurgerMenu();
      //  saveScreenshot();

    }

    @Step("And then logout")
    public void logout() {
        HomePage homePage = new HomePage();
        homePage.logout();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
