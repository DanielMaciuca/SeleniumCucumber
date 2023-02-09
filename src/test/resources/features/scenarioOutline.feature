Feature: scenarioOutline

  Scenario Outline: eating
    Given there are <start> cucumbers and <end>
    Then User click
    Examples:
      | start | end |
      | 12    | 24  |
      | 20    | 40  |