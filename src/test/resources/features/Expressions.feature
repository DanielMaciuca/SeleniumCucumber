Feature: Learn expressions

  Scenario: Custom variables
    Then Dog color is white
    And Cat color is anything

  Scenario: Data tables
    Then I like dogs to be:
      | red   |
      | black |
      | blue  |

