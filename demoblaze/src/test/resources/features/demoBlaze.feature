@tag 
Feature: DemoBlaze Application testing 
	Login and buy products

@TC_0 
Scenario Outline: Login with demoblaze 
	Given user launches demoblaze website 
	When user click on login button 
	Then user enter <username> and <password> and click on login 
	
	
	Examples: 
		| username  | password  | 
		| user_3    | user1pass | 
		
		
		
		@TC_0 
		Scenario: Add phone to cart 
			Given user click on phone 
			When user click on the desired mobile phone 
			And user clicks add to cart 
			Then click on cart 
			
		@TC_0 
		Scenario: Add laptop to cart 
			Given user click on laptop 
			When user click on desired laptop 
			And add product to cart 
			Then navigate to cart page 
			
		@TC_0 
		Scenario: Add Monitor to cart 
			Given user click on monitor 
			When user click on dersired monitor 
			And add desired monitor to cart 
			Then succeed to cart 
			
			
		@TC_0 
		Scenario: Purchase a product 
			Given user click on desired product 
			When user click on add to cart 
			And move to cart page 
			And click on place order 
			And fill the details 
			And click on purchase 
			Then click on ok 
			
		@TC_0 
		Scenario Outline: Signup 
			Given user clicks on signup button 
			Then user enters <username> and <password> 
			Then click on signup 
			
			Examples: 
				| username  | password  | 
				| user_6    | user1pass | 
				|	user_7	| user1pass |
				
				
				@TC_0 
				Scenario: No of mobiles 
					Given user launch demoblaze application 
					And user check the number of products in a webpage 
					Then print the number of products in a webpage 
					
					
					
					
					
					
					
					
					
					
					
					
					
					
