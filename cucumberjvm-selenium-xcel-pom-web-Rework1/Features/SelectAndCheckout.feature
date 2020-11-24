Feature: Select and checkout a dress 

# step2 select a dress
@selectcheckout 
Scenario: Select summer dress and proceed to checkout 
	Given customer is on homepage 
	When customer sign in 
	Then I select a dress and proceed to checkout