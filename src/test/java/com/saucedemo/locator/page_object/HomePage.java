package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement openMenu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addProduct;
    @FindBy(name = "add-to-cart-sauce-labs-bike-light")
    private WebElement addAnotherProduct;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCart;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select")
    private WebElement productSortContainer;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]")
    private WebElement fromZToASort;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")
    private WebElement fromLowToHigh;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")
    private WebElement fromHighToLow;
    @FindBy(id = "reset_sidebar_link")
    private WebElement resetAppState;

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

    public void addFirstProduct() {
        addProduct.click();
    }

    public void addSecondProduct() {
        addAnotherProduct.click();
    }

    public void goToShoppingCart() {
        shoppingCart.click();
    }

    public void productSort() {
        productSortContainer.click();
        fromZToASort.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productSortContainer.click();
        fromLowToHigh.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productSortContainer.click();
        fromHighToLow.click();
    }

    public void resetApp() {
        resetAppState.click();
    }
}
