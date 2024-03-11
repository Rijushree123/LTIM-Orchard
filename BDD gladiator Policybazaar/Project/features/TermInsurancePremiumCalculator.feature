Feature: Term Insurance Premium Calculator

  Scenario: Calculate premium for term insurance
    Given I am on homepage
    When I mouseover Insurance Product on the top navigation bar
    And I click on Term Insurance calculator under Term Insurance
    Then I should be redirected to the premium calculator page
    And I choose gender as Female under Regular plans
    And I select age
    And I select Life Cover required
    And I select Cover till age
    And I print the amount of Premium displayed
    And I capture the screenshot