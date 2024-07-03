Feature: Verify Messages page

  Scenario: Verify messages
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on adminstration app
    And Click on messages tab
    Then Messages tab will display
    When User clicks on add message button
    And Fill all message details
    And Click on message save button
    Then Message will add successfully
    Then User get logout
