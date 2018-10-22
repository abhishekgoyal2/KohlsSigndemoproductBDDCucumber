Feature: Product demo app 

Scenario Outline: Validate Product API respone 

	Given User hits the request with a given REST API end point 
	Then Print the response Returned for "<city>" 
	Then validate the respone code "<city>" 
	Then validate Status code for invalid state
	Then get Post response "<uri>" and type "<Jsonbody>" 
	
	Examples: 
		|city|uri|jsonbody|
		|Hyderabad|http://restapi.demoqa.com/utilities/weather/city/Hyderabad||Json|
		|Noida|http://restapi.demoqa.com/utilities/weather/city/Hyderabad||Json|
		|Delhi|http://restapi.demoqa.com/utilities/weather/city/Hyderabad||Json|