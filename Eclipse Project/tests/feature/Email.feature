Feature: EmailTesting

	
Scenario: Email Valid
	
	Given email valid
	
	When email is executed
	
	Then email result should be true
	
Scenario: Email empty params
	
	Given email empty params
	
	When email is executed
	
	Then email result should be false
	
Scenario: Email null params
	
	Given email null params
	
	When email is executed
	
	Then email result should be false
	
Scenario: Email missing params
	
	Given email missing params
	
	When email is executed
	
	Then email result should be false
	
Scenario: Email empty to param
	
	Given email empty params list
	
	When email is executed
	
	Then email result should be false
	