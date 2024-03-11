Feature: Schedule Home Visit 

    Scenario Outline: Home Visit functionality

        Given I am on home page 
        When I click on Stores near you inside Support 
        And enter the "<location>"
        And click on Schedule home visit button
        And enter my "<name>","<mobileNumber>",what i am interested in,"<flatNumber>","<colony>","<pincode>"
        And pick my slot
        And click on Continue button
        Then home visit should be scheduled
        Examples:
        |   location    |   name    |   mobileNumber    |   flatNumber  |   colony  |   pincode |
        |       2       |     3     |       4           |       5       |     6     |      7    |
