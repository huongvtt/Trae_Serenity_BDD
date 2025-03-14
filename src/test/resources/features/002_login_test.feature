Feature: Login Test
  Scenario: Login with valid credentials
    Given I open the login page
    When I enter username "tomsmith"
    And I enter password "SuperSecretPassword!"
    And I click the login button
    Then I should see the secure area