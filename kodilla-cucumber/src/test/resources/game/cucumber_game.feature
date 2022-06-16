Feature: Cucumber game
  I want to enter a number and get an answer

  Scenario Outline: Get answer based on played number
    Given <number>
    When I enter a number
    Then I should be told the correct <answer>
    Examples:
      | number | answer |
      | divisible by three | "Fizz" |
      | divisible by five  | "Buzz" |
      | divisible by three and five |"FizzBuzz" |
      | another case       | "None" |