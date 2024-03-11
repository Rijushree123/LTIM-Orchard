Feature: FD Calculator
	Scenario Outline: FD Calculator Functionality
		Given I am in home page
		When I click on FD Calculator in the Footer Section
		And I enter "<name>" and "<mobile>" number on the next page
		And I click on View Plans
		Then I should be redirected to a page where investment plan is the title
	Examples:
		| name 	| 	mobile 	 | 
		| 	2 	| 	  3 	 | 