package com.testinium.stepDefs;

import com.testinium.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigateToTheURL {
    HomePage homePage = new HomePage();

    @Given("The user navigate to the URL and Select the Gender")
    public void the_user_navigate_to_the_url_and_select_the_gender() {
        homePage.navigateToTheURL("genderManButton");
    }

    @Then("The user verifies that the navigate to the site is successful")
    public void the_user_verifies_that_the_navigate_to_the_site_is_successful() {
        Assert.assertTrue(homePage.header.isDisplayed());
    }
}
