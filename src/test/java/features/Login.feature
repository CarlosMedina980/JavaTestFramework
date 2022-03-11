Feature: Login Feature
  This feature is to test all scenarios of login feature

  Scenario: Check Login with Correct User And Password
    Given I see application has loaded
    And I click login link
    And I enter Username and Password
      | Username | Password |
      | admin    | password |
    When I click Login button
    Then I should see the user name which logged in


