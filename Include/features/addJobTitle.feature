Feature: Add Job Title
Scenario: Verify the functionality of adding a new job title in the system

Given User navigates to login page with valid credentials
When User navigates to the job titles section
And User insert <jobTitle> for the job title input field
And User click save button
Then Job title is successfully added

Examples: 
		| jobTitle      |
		| IT Support    |
		| IT Consultant |
			 
