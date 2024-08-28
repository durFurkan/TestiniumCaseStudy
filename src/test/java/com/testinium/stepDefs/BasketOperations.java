package com.testinium.stepDefs;

import com.testinium.pages.BasketPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketOperations {
    BasketPage basketPage = new BasketPage();

    @When("The user increase the quantity of the product to {string}")
    public void the_user_increase_the_quantity_of_the_product_to(String quantity) {
        basketPage.changeQuantityOfTheProduct(quantity);
    }

    @Then("Verify that the quantity of the product is {string}")
    public void verify_that_the_quantity_of_the_product_is(String quantity) {
        basketPage.verifyQuantityOfTheProduct(quantity);
    }

    @When("The user deletes the products from the basket")
    public void the_user_deletes_the_products_from_the_basket() {
        basketPage.deleteBasketButton.click();
    }

    @Then("Verify that the basket is empty msg {string}")
    public void verify_that_the_basket_is_empty_msg(String msg) {
        basketPage.verifyNoProductOnBasket(msg);
    }
}
