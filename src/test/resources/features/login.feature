Feature: login

  Scenario: Get login 1 5 7
    Given User is on page
    Then User click
    Then User click again "Name" and price 1001
    Then User enters <100>
  @Run
  Scenario: Get login updated
    Given user enters another name
    Then user enters second password "admin"

    file 1