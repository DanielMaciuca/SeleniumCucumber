Feature: Web Login1
  Scenario: User should be able to login with valid credentials
    Given he user is on login page
    When the user enters the righ credentials
    And hits submit button
    Then the user is logged in successfully
