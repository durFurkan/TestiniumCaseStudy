package com.testinium.pages;

import com.testinium.utilities.BrowserUtils;
import com.testinium.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ShirtProductPage extends BasePage {
    String strPriceOnPage;
    @FindBy(id = "priceNew")
    public WebElement priceOnPage;
    @FindBy(className = "a-productFeature")
    public WebElement productDetails;
    @FindBy(xpath = "//span[text()='S']")
    public WebElement productSize;
    @FindBy(id = "addBasket")
    public WebElement addBasket;
    @FindBy(xpath = "//a[@href='/tr/cart']")
    public WebElement basket;
    @FindBy(className = "priceBox__salePrice")
    public WebElement priceOnBasket;

    public void addToBasket() {
        strPriceOnPage = priceOnPage.getText();
        productSize.click();
        addBasket.click();
    }
    public void writeToTxt() {
        String productPriceText = priceOnPage.getText();
        String productDetailsText = productDetails.getText();
        String filePath = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write("Product Information: " + productDetailsText);
            writer.newLine();
            writer.write("Price Information: " + productPriceText);
            writer.newLine();
            writer.write("------------------------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void compareThePrices() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(4000);
        basket.click();
        BrowserUtils.waitForVisibility(priceOnBasket, 5);
        String price1 = strPriceOnPage.replace(" TL", "");
        String price2 = priceOnBasket.getText().replace(" TL", "");
        Assert.assertTrue(price2.contains(price1));
    }
}
