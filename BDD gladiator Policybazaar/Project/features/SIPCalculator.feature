Feature: SIP Calculator
	Scenario Outline: SIP Calculator Functionality
		Given I am in home page
		When I hover over Insurance Products to click on SIP Calculator
		And I click on Yearly SIP
		And I am redirected to the SIP calculator page where I enter the "<investment amount>"
		And I enter the "<investment years>" and "<expected return rate>"
		Then I should see the Expected Total Wealth
	Examples:
		| investment amount | investment years | expected return rate |
		|		2			|		3		   | 		 4			  |	