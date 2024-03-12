Feature:Search

    Scenario Outline: Hotel Search Functionality

        Given i am on Home Page
        When i click on Hotels Option
        And i enter "<location>" in location field
        And i enter in check-in date 
        And i enter in check-out date 
        And i click on search button
        Then i will land on hotel search results page

        Examples:
        |location |
        |New Delhi|
        
    Scenario Outline: Flight Search Functionality

        Given i am on Home Page
        When i enter "<departfrom>" depart-from field
        And i enter on "<goingto>" going-to field
        And i select date in departure date field
        And i select date in return date field
        And i click on Senior Citizen checkbox
        And i click on Search Flight button
        Then i will land on flight search results page
        And i verify the text Stops is visible or not

        Examples:
        |departfrom |goingto|
        |Bangalore (BLR)|Chennai International|
        

    Scenario Outline: Holiday Search Functionality

        Given i am on Home Page
        When i click on Holiday Option
        When i enter "<departfrom>" in depart-from field
        And i enter on "<goingto>" in going-to field
        And i select the month of travel
        And i click on Search Holiday button
        Then i will land on holiday search results page
        And i verify if the destination city is on the page

        Examples:
        |departfrom |goingto|
        |Jaipur|Bengaluru|
        
