
Feature: login

  Scenario: Get login 1
    Given User is on page
    Then User click
    Then User enters the following details:
      | Item       | Quantity | Price |
      | Apples     | 5        | 2.50  |
      | Bananas    | 3        | 1.20  |
      | Chocolate  | 2        | 3.75  |