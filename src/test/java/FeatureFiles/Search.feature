Feature: Search Functionality

  Background:
    Given Navigate to Trendyol
    When Enter user information
    And Click login
    Then Verify successful login
  @Regression
  Scenario: Search for the desired product
    Then Click on the element in Content
      | searchInput |
    When Send keys to input in website
      | searchInput | laptop |
    When Click on the element in Content
      | searchButton |
    Then The searched text should appear

