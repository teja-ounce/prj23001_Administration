Feature: Verify applications page

  Background: 
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on adminstration app
    Then home page should display with active users
    And User clicks on applications page
    

Scenario: Verify add application
	When User clicks on add application button
	And User fill all application details
	And User click on save button
	
	When User clicks on users icon
	Then Applications Users page should display
	When User click on add user button
	And Fill all user fields
	And User clicks on save button
	When User navigates back 
	Then Applications page should display
	When User clicks on roles button
	Then Roles page will dispaly
	When User clicks on add role button
	And User fill required data
	And Click on add button
	When User navigates back 
	Then Applications page should display
	And Delete added application
	Then User should logout
	
	
	