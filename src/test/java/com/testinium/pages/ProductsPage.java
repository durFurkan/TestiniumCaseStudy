package com.testinium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//a[@href='/tr/p_beymen-club-comfort-fit-beyaz-keten-gomlek_1374210']")
    public WebElement linenShirt;
}
