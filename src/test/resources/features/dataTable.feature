Feature: login

  Scenario: Get login 1
    Given User is on page
    Then User click
    Then User enters the following details
      | name  | password      | age | gender |
      | admin | adminpassword | 18  | M      |