Feature: Verify applications page

  Background: 
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on adminstration app
    Then home page should display with active users
    And User clicks on applications page

  @AddApplication
  Scenario: Verify add application
    When User clicks on add application button
    And User fill all application details
    And User click on save button
    Then Application will add successfully
    Then User should logout

  @AddMenu
  Scenario: Verify add Menu
    When User clicks on menus
    And User clicks on add menu button
    And User fill menu fields
    And Click on add menu button
    Then Menu will add successfully
    Then User should logout

  @AddUser
  Scenario: Verify add Users
    When User click on users menu
    And User click on add User button
    And Fill all user fields
    And User clicks on save button
    Then User will add successfully
    Then User should logout

  @AddRole
  Scenario: Verify add role
    When User clicks on roles
    And User click on add role button
    And User fill role data
    And Click on save button
    Then Role will add successfully
    Then User should logout

  @VerifyAddedData
  Scenario: Verify data in applications page
    When User clicks on applications page
    And Search for added application
    And Click on go to users icon
    Then Verify added users to this application
    When User navigate back
    And Search for added application
    And Click on go to roles icon
    Then Verify added roles to this application
    When User navigate back
    And Search for added application
    Then Delete the added application
    When User navigate to Users page
    And Search for added user
    Then Delete the user
    When User navigate to roles page
    And Search for added role
    Then Delete the role
    When User navigate to menus page
    And Search for added menu
    And Delete the menu
    Then User will logout
