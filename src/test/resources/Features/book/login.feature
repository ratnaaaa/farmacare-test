Feature: login

  Scenario: Login
    Given I open Book Depository Page
    When I click login icon
    And I input email and password
    And I click login button
    Then I can login successfully