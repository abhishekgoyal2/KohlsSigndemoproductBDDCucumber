Feature: Product demo app 

Scenario: Validate Product API respone 

	Given User hits the request with a given REST API end point 
	Then Print the response Returned 
	Then validate the respone code 
	Then validate Status code for invalid state 
	Then get Post response "<uri>" and type "<Json>" 
	
	