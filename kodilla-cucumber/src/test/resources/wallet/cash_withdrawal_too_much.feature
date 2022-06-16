Feature: Cash Withdrawal Too Much
  Scenario: Unsuccessful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $300
    Then I should be told that I have insufficient funds in my account