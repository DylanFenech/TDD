Feature: ManipulateFileTesting

	
Scenario: Manipulate File Valid
	
	Given manipulate valid
	
	When manipulate is executed
	
	Then manipulate result should be true
	
Scenario: Manipulate File empty params
	
	Given manipulate empty params
	
	When manipulate is executed
	
	Then manipulate result should be false
	
Scenario: Manipulate File null params
	
	Given manipulate null params
	
	When manipulate is executed
	
	Then manipulate result should be false
	
Scenario: Manipulate File missing params
	
	Given manipulate missing params
	
	When manipulate is executed
	
	Then manipulate result should be false
	
Scenario: Manipulate File empty file name
	
	Given manipulate empty file name
	
	When manipulate is executed
	
	Then manipulate result should be false
	