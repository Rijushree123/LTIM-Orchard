Feature: Starting a SIP 

    Scenario Outline: SIP Functionality

        Given I am in homepage
        When I click on SIP under Insurance product tab
        And enter name as "<name>" and mobile no as "<mobNo>" 
        And click on view plan
        And click on proceed
        And enter Gender, email Id as "<email>" and date of birth as "<dob>"
        And click proceed
        And enter pincode as "<pincode>"
        And click on review details
        And after redirecting scroll down and enable check box
        And click on checkoutbutton
        Then verify the text 'choose payment mode' is available and capture screenshot.
    
        Examples:
        |   name   |  mobNo |   email   |   dob    |   pincode |
        |    2     |    7   |     3     |    4     |      6    |
    