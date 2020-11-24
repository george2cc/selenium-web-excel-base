Feature: Shopping cart on an e-commerce website 
	Custumer is able to view search feature, categories, basket, login, wishlist and logo
	
@signinsignout 
Scenario: Sign im and sign out 
	Given customer is on homepage  
	When customer sign in 
	Then customer sign out 
	
@contactus
Scenario: Contact Us Action 
	Given customer is on homepage   
	When customer perform contact us actions 

