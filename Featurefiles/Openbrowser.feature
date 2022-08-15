Feature: open app
Scenario: Open app url
    Given Open chrome browser
    When Navigate to app url
    Then Verify the page title
    And close browser
