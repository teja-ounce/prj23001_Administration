Feature: Verify login

  Scenario: Successfull login with vallid credentials
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on profile picture
    And Select logout from options
    Then User will logout
