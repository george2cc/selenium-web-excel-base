Feature: Shopping Cart summary page verification

@ShoppingCartSummary
  Scenario: Verify values on shopping cart summary page
	Given customer is on homepage 
	When customer sign in 
	Then I select a dress and proceed to checkout
    Then I verify details on shoppingCart summary page