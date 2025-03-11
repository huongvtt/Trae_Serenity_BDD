Feature: Sample Test
  Scenario: Open Google and search
    Given I open Google homepage
    When I search for "Serenity BDD"
    Then I should see results