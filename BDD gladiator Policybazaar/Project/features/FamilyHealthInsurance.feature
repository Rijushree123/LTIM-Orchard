Feature:FamilyHealth Insurance 

    Scenario Outline: Family health Insurance

        Given I am in home page
        When I hover over Insurance product and click Family health insurance
        And I select gender as female 
        And I select member of family as son and husband 
        And I click on Continue button 
        And I choose age of husband as Thirty seven and sons age as three 
        And I click on Continue button and enter "<city>" and click continue
        And I enter "<name>" and "<mobilenumber>" and click Continue 
        And I click on second option in medical history page and press view all 
        And I click on cover 
        And I select  five to nine lakh and click on apply button 
        And I click on second plan from list of plan 
        And I select policy peroids as two years 
        And I select safeguard benefits 
        And I click on proceed to proposal button 
        And I click on Skip and continue 
        Then I verify the text Total premium is available 
        Examples:
        |   city    |   name    |   mobilenumber    |
        |     2     |     3     |         4         |