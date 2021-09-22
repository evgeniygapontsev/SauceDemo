package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(css = "input[placeholder='Username']")
    private WebElement username;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement password;
    @FindBy(css = "[type='submit'][value='Login']")
    private WebElement loginButton;

    public LoginPage(){
        super();
        PageFactory.initElements(driver, this);
    }


    public HomePage login(String userName, String inpPassword) {
        username.clear();
        username.sendKeys("standard_user");
        password.clear();
        password.sendKeys("secret_sauce");
        loginButton.click();
        return new HomePage();
    }

}
