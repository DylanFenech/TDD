Feature: DownloadFileTesting

	
Scenario: download File Valid
	
	Given download valid
	
	When download is executed
	
	Then download result should be true
	
Scenario: download File empty params
	
	Given download empty params
	
	When download is executed
	
	Then download result should be false
	
Scenario: download File null params
	
	Given download null params
	
	When download is executed
	
	Then download result should be false
	
Scenario: download File missing params
	
	Given download missing params
	
	When download is executed
	
	Then download result should be false
	
Scenario: download File empty file name
	
	Given download empty url
	
	When download is executed
	
	Then download result should be false
	