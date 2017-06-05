Feature: TopDownTesting

	Scenario: Giving Invalid Command Params
	
	Given command is given invalid params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	
	Scenario: Giving null Command Params
	
	Given command is given null params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	
	
	
	Scenario: Giving valid Manipulate File Params 
	
	Given Valid Manipulate File Params are given - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be true
	
	
	Scenario: Giving Manipulate File empty Params
	
	Given Giving Manipulate File empty Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	Scenario: Giving Manipulate File null Params
	
	Given Giving Manipulate File null Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	
	
	
	Scenario: Giving valid Download File Params 
	
	Given Valid Download File Params are given - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be true
	
	
	Scenario: Giving Download File empty Params
	
	Given Giving Download File empty Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	Scenario: Giving Download File null Params
	
	Given Giving Download File null Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	
	
	Scenario: Giving valid Email Params 
	
	Given Valid Email Params are given - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be true
	
	
	Scenario: Giving Manipulate File empty Params
	
	Given Giving Email empty Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	Scenario: Giving Manipulate File missing Params
	
	Given Giving Email missing Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	Scenario: Giving Manipulate File null Params
	
	Given Giving Email null Params - TD
	
	When the topdown toolbox is executed
	
	Then the topdown toolbox result should be false
	
	
