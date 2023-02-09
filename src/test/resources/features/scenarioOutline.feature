Feature: scenarioOutline
Scenario Outline: eating
  Given there are <start> cucumbers
  Then User click
Examples:
| start |
|    12 |
|    20 |