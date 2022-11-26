Feature: To test the features of Simple Calculator

  Scenario Outline: Addition of two integers <one> and <two>
    Given there is integer <one>
    And there is a second integer <two>
    When the numbers are added
    Then the total is <result>

    Examples:
      | one | two | result |
      | 56  | 2   | 58     |
      | 0   | 0   | 0      |
      | 5   | 1   | 6      |
      | 1   | 1   | 2      |


  Scenario Outline: Multiplication of two numbers <one> and <two>
    Given there is number <one>
    And there is a second number <two>
    When the numbers are multiplied
    Then the result is <result>

    Examples:

      | one | two | result |
      | 1   | 2   | 2      |
      | 0.5 | 0.8 | 0.4    |
      | 5.5 | 1.8 | 9.9    |
      | 1.8 | 0   | 0      |


  Scenario Outline: Add even numbers of an array containing <type> numbers
    Given there is an array of "<type>"
    When I do the sum of even numbers from the array
    Then the sum of the even numbers is <result>

    Examples:
      | type  | result |
      | even  | 108      |
      | odd   | 0      |
      | mixed | 48      |

