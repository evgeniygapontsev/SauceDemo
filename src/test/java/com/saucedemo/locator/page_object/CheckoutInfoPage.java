package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage extends BasePage{

    @FindBy(id = "first-name")
    private WebElement inputFirstName;
    @FindBy(id = "last-name")
    private WebElement inputLastName;
    @FindBy(name = "postalCode")
    private WebElement inputPostalCode;
    @FindBy(css = "[type='submit'][value='Continue']")
    private WebElement continueButton;

    public CheckoutInfoPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void enterInfo(String firstName, String lastName, String postalCode) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputPostalCode.sendKeys(postalCode);
    }

    public void contButton() {
        continueButton.click();
    }
}
