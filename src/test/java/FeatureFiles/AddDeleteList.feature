Feature: Add And Delete Functionality

  Background:
    Given Navigate to Trendyol
    When Enter user information
    And Click login
    Then Verify successful login
  @Regression
  Scenario: Add Product to Cart
    Then Click on the element in Content
      | searchInput |
    When Send keys to input in website
      | searchInput | monster |
    When Click on the element in Content
      | searchButton |

   And Select Product and Add to Cart
    Then Verify Product Added to Cart
    Then delete product in cart
    Then Success message should be displayed




