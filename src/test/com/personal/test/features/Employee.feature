Feature: Employee Feature
  This feature is to test all scenarios of EmployeeList feature

  Scenario: Create Employee with all details
    Given I see application has loaded
    And I click login link
    And I enter Username and Password
      | Username | Password |
      | admin    | password |
    And I click Login button
    And I click employeeList link
    And I click createnew button
    When I enter following details
      | Name     | Salary | DurationWorked | Grade | Email           |
      | AutoUser | 4000   | 30             | 1     | autouser@ea.com |
    And I click create button

