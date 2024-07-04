Feature: Verify functions page

  Scenario: Verify functions
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on adminstration app
    And User clicks on functions tab
    Then Functions tab will display
    When User clicks on add function button
    And Fill all function details
    And Click on function save button
    Then Function will add successfully
    Then User get logout
