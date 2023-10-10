Feature: Multiplication By Num
  Scenario: Multiply by num
  Scenario: Add two numbers
    Given I have entered 1, 2, 3, 4, 7, 9, 8, 11, 0 into the calculator
    And I have entered 2 into the calculator
    When I press multiply
    Then the result should be 2, 4, 6, 8, 14, 18, 16, 22, 0 on the screen
