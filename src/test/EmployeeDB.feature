Feature: Employee DB Validation 

Scenario: Successful fetch for all employee detail 
	Given Employee Database exist 
	When User calls employee database API 
	Then All employee details are returned 
	
Scenario Outline: Get employee by id 
	Given Employee Database exist 
	When User calls employee database API using "<ID>" 
	Then Employee details is returned
	
	Examples: Employee Ids
	|ID|
	|1|
	|2|