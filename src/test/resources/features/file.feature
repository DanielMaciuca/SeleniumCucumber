Feature: second

  Scenario: Get login one
    Given User is on page
    Then User click
    Then User click again
    Then User click again "Name" and price 1002
    Then User enters <100>

  Scenario: Get login two
    Given user enters another name
    Then user enters second password "admin2"

  Scenario: Get login three
    Given User is on page
    Then User click
    Then User click again
    Then User click again "Name" and price 10011121
    Then User enters <100>
    Then User enters <1004>

 @Run
  Scenario: Get login fourth
    Given user enters another name
    Then user enters second password "admin"
commit 1 main branch

   nnnnnnnnnnnnnnnnn