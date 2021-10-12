package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage{

    @FindBy(name = "remove-sauce-labs-backpack")
    private WebElement removeProduct;
    @FindBy(name = "continue-shopping")
    private WebElement continueShopping;
    @FindBy(name = "checkout")
    private WebElement checkOutButton;

    public ShoppingCartPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void removeProductFromCart() {
        removeProduct.click();
    }

    public void backToShopping() {
        continueShopping.click();
    }

    public void checkOut() {
        checkOutButton.click();
    }
}
