Feature: Sample Test
  Scenario: Open Google and search
    Given I open Google homepage
    When I search for "flower"
    Then I should see results