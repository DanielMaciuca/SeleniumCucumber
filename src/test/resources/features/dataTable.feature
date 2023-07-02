
Feature: login

  Scenario: Get login 1
    Given User is on page
    Then User click
    Then User enters the following details:
      | Item  | Age | Password | Ultima |
      | name  | 11  | 25       | gender |
      | admin | 22  | 18       | M      |