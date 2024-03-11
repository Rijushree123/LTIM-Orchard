Feature: Buying a Business Insurance

    Scenario Outline: Business Insurance functionality 

        Given I am in homepage
        When I click on Business Insurance inside View All Products
        And select Shop Owner Insurance
        And enter your "<companyName>","<mobileNumber>"
        And click on View plans button
        And select city as Delhi 
        And select radio button for More Than one and half crore
        And select Business Type as Cafe shop
        And enter "<ShopBuildingValue>"
        And click on Continue
        And select the first plan
        Then I land on the selected plan page to verify if Thank You is present or not
        Examples:
        |   companyName |   mobileNumber    |   ShopBuildingValue   |
        |       2       |       3           |           4           |

