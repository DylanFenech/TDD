Feature: BottomUpTesting

	Scenario: Giving Invalid Command Params
	
	Given command is given invalid params
	
	When the command is executed
	
	Then the command result should be false
	
	
	Scenario: Giving null Command Params
	
		Given command is given null params
	
	When the command is executed
	
	Then the command result should be false
	
	
	
	
	Scenario: Giving valid Manipulate File Params 
	
	Given Valid Manipulate File Params are given
	
	When the command is executed
	
	Then the command result should be true
	
	
	Scenario: Giving Manipulate File empty Params
	
	Given Giving Manipulate File empty Params
	
	When the command is executed
	
	Then the command result should be false
	
	Scenario: Giving Manipulate File null Params
	
	Given Giving Manipulate File null Params
	
	When the command is executed
	
	Then the command result should be false
	
	
	
	
	Scenario: Giving valid Download File Params 
	
	Given Valid Download File Params are given
	
	When the command is executed
	
	Then the command result should be true
	
	
	Scenario: Giving Download File empty Params
	
	Given Giving Download File empty Params
	
	When the command is executed
	
	Then the command result should be false
	
	Scenario: Giving Download File null Params
	
	Given Giving Download File null Params
	
	When the command is executed
	
	Then the command result should be false
	
	
	
	Scenario: Giving valid Email Params 
	
	Given Valid Email Params are given
	
	When the command is executed
	
	Then the command result should be true
	
	
	Scenario: Giving Email empty Params
	
	Given Giving Email empty Params
	
	When the command is executed
	
	Then the command result should be false
	
	Scenario: Giving Email missing Params
	
	Given Giving Email missing Params
	
	When the command is executed
	
	Then the command result should be false
	
	Scenario: Giving Email null Params
	
	Given Giving Email null Params
	
	When the command is executed
	
	Then the command result should be false
	
	
