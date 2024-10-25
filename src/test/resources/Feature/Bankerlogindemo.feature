Feature: banker login

  
  Scenario: login with valid credentials
    Given open browser
    When enter the url of primus bank
    Then homepage is displayed
    When enter the username & password
    And click on login button
    Then close the browser
