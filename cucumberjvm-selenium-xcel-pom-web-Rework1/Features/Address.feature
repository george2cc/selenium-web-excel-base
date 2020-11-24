Feature: Verify Address 
	Customers addresses are verified 

@Addresses
Scenario: Verify address in the workflow and proceed 
	Given customer is on homepage 
	When customer sign in 
	Then I select a dress and proceed to checkout 
	Then I verify details on shoppingCart summary page