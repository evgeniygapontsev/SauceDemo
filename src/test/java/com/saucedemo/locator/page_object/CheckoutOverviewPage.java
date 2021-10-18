package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage{

    @FindBy(name = "finish")
    private WebElement finishButton;

    public CheckoutOverviewPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void finishCheckout() {
        finishButton.click();
    }
}
