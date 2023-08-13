Feature:  Login Functionality

  @SmokeTest  @Regression
  Scenario: User should login to Trendyol web application successfully
    Given Navigate to Trendyol
    When Enter user information
    And Click login
    Then Verify successful login


