@wip
Feature: Complete the Trade Functionality

  Scenario: The user should be able to complete the trade
    Given The user navigate to the URL and Select the Gender
    Then The user verifies that the navigate to the site is successful
    When The user enters product name to the search button row 1, column 1 and clear the search button
    And The user enters product name to the search button row 1, column 2 and presses enter button
    And The user click on the Linen Shirt Product
    And The user saves the selected product product information and amount information in a txt file.
    And The user adds the product to the basket
    Then Verify that the price in the page and basket are matched
    When The user increase the quantity of the product to "2"
    Then Verify that the quantity of the product is "2"
    When The user deletes the products from the basket
    Then Verify that the basket is empty msg "Sepetinizde Ürün Bulunmamaktadır"
