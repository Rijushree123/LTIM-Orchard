@Second
Feature: Car Insurance Plan Selection

  Scenario Outline: Select car insurance plan and verify critical details
    Given I am on the home page
    When I hover over Insurance product on the top navigation bar
    And I click on Car Insurance
    And I input the "<carNumber>" and click on View prices
    Then I should be redirected to the plans page
    And I click on Accessories Cover under Sort & Filter section on the left side
    And I select the Electrical Accessories checkbox
    And I click on the first insurance price amount
    And I verify the label Critical details is present and capture a screenshot

    Examples:
    | carNumber |
    |     2     |