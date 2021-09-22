package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement openMenu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public HomePage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void openBurgerMenu(){
        openMenu.click();
    }

    public void logout(){
        logoutButton.click();
    }
}
