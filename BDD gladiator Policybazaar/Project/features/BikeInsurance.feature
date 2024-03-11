Feature:Bike Insurance 

    Scenario Outline: Bike Insurance

        Given I am in home page
        When I hover on Insurance Product to click on Bike Insurance
        And I land on Bike Insurance page to enter the "<Bike_Number>" 
        And I click on View Prices button
        And on the next page I click on first plan
        And I land on Bike form page to fill the "<name>", "<email>" and "<phone_number>"
        And click on Pay Now button
        Then I land on Payment Page to verify the email

        Examples:
        |   Bike_Number |   name   |    email   |phone_number|
        |       2       |     3    |      4     |     5      |
        