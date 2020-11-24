Feature: Order Summary 

@OrderSummary
Scenario: Verify order Summary page and proceed 
	Given customer is on homepage 
	When customer sign in 
	Then I select a dress and proceed to checkout 
	Then I verify details on shoppingCart summary page 
	Then I verify address and proceed 
	Then I verify shipping details and proceed 
	Then I verify payment details page and proceed
	Then I verify order summary page and proceed 
