Feature: Employee


  Scenario: New Employee
    Given open browser
    When enter the url of primus bank
    Then homepage is displayed
    When enter the username & password
    And click on login button
    Then primusbank homepage will displayed
    When click on employee main&employee sub menu
    And click on new Employee
    Then enters the details in New Employee Creation
    And click on submit button
    And close the browser
