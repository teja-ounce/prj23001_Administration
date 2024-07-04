Feature: Verify lookups page

  Scenario: Verify lookups
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on adminstration app
    And Clicks on lookups tab
    Then Lookups tab will display
    When User clicks on add lookup button
    And Fill all lookup details
    And Click on lookup save button
    Then Lookup will add successfully
    When User clicks on lookupList button
    And Click on add lookup value button
    And Fill lookup value details
    And Click on lookup value save button
    Then Lookup values will add successfully
    Then User get logout
