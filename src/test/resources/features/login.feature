Feature: login
  Scenario: Get login
    Given User is on page
    Then User click
    Then User click again
    Then User click again "Name" and price 1001
    Then User enters <100>
  Scenario: Get login updated
    Given user enters another name
    Then user enters second password "admin"
main file 1
    main ultima