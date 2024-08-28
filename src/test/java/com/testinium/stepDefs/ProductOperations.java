package com.testinium.stepDefs;

import com.testinium.pages.ProductsPage;
import com.testinium.pages.ShirtProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductOperations {
    ProductsPage productPage = new ProductsPage();
    ShirtProductPage shirtProductPage = new ShirtProductPage();

    @When("The user click on the Linen Shirt Product")
    public void the_user_click_on_the_linen_shirt_product() {
        productPage.linenShirt.click();
    }

    @When("The user saves the selected product product information and amount information in a txt file.")
    public void the_user_saves_the_selected_product_product_information_and_amount_information_in_a_txt_file() {
        shirtProductPage.writeToTxt();
    }

    @When("The user adds the product to the basket")
    public void the_user_adds_the_product_to_the_basket() {
        shirtProductPage.addToBasket();
    }

    @Then("Verify that the price in the page and basket are matched")
    public void verify_that_the_price_in_the_page_and_basket_are_matched() throws InterruptedException {
        shirtProductPage.compareThePrices();
    }
}
