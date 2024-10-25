Feature: Branches

  
  Scenario: Branch creation
    Given open browser
    When enter the url of primus bank
    Then homepage is displayed
    When enter the username & password
    And click on login button
    Then click on the branches
    And click on new Branch
    When enters the new Branch entry
    And click on submit
    And close the browser
