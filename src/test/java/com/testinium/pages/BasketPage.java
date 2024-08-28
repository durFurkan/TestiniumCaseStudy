package com.testinium.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BasketPage extends BasePage {
    @FindBy(id = "quantitySelect0-key-0")
    public WebElement quantitySelect;
    @FindBy(id = "removeCartItemBtn0-key-0")
    public WebElement deleteBasketButton;
    @FindBy(className = "m-empty__messageTitle")
    public WebElement noProductMsg;

    public void changeQuantityOfTheProduct(String quantity) {
        Select select = new Select(quantitySelect);
        select.selectByValue(quantity);
    }
    public void verifyQuantityOfTheProduct(String quantity) {
        String ariaLabel = quantitySelect.getAttribute("aria-label");
        Assert.assertTrue(ariaLabel.contains(quantity));
    }
    public void verifyNoProductOnBasket(String msg) {
        Assert.assertEquals(msg, noProductMsg.getText());
    }
}
