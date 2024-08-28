package com.testinium.stepDefs;

import com.testinium.pages.BasketPage;
import com.testinium.pages.HomePage;
import com.testinium.pages.ProductsPage;
import com.testinium.pages.ShirtProductPage;
import io.cucumber.java.en.When;

public class SearchProduct {
    HomePage homePage = new HomePage();

    @When("The user enters product name to the search button row {int}, column {int} and clear the search button")
    public void the_user_enters_product_name_to_the_search_button_row_column_and_clear_the_search_button(int row, int column) throws InterruptedException {
        homePage.enterProductNameToSearchBox(row,column);
    }
    @When("The user enters product name to the search button row {int}, column {int} and presses enter button")
    public void the_user_enters_product_name_to_the_search_button_row_column_and_presses_enter_button(int row, int column) {
        homePage.enterProductNameAndPressEnterForSearchBox(row, column);
    }
}
