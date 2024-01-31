@Run
Feature: second
  Scenario: Get login 1
    Given User is on page
    Then User click
    Then User click again
    Then User click again "Name" and price 1002
    Then User enters <100>

  Scenario: Get login 2
    Given user enters another name
    Then user enters second password "admin2"

  Scenario: Get login 3
    Given User is on page
    Then User click
    Then User click again
    Then User click again "Name" and price 10011121
    Then User enters <100>
    Then User enters <1004>


  Scenario: Get login 4 updated again
    Given user enters another name
    Then user enters second password "admin"

