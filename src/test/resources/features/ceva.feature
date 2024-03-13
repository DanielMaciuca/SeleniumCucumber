@MainPage
Feature: ceva

  Background:
    Given something in back

@PC100
  Scenario: portocala
    Given check if <100> equal <100>

  Scenario: Get login 1
    Given User is on page
    Then User click
    Then User click again
    Then User click again "Name" and price 1002
    Then User enters <100>
