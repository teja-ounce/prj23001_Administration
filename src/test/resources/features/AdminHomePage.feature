Feature: Verify home page data and links

  Background: 
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on adminstration app
    Then home page should display with active users

  @ApplicationCount
  Scenario: Verify navigation to application page
    When User clicks on applications navigation linkbutton
    And User navigate to applications page and validate application count
    Then user navigate back to home page
    And Select logout from admin options
    Then User should logout

  @RolesCount
  Scenario: Verify navigation to roles page
    When User clicks on roles navigation linkbutton
    And User navigate to roles page and validate roles count
    Then user navigate back to home page
    And Select logout from admin options
    Then User should logout

  @UsersCount
  Scenario: Verify navigation to users page
    When User clicks on users navigation linkbutton
    And User navigate to users page and validate users count
    Then user navigate back to home page
    And Select logout from admin options
    Then User should logout

  @TableData
  Scenario: Verify table data application wise
    When User read the table data and validate user count
    And Select logout from admin options
    Then User should logout
