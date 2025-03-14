Feature: Owner Login Test
  Scenario: Login Owner with valid credentials
    Given I open the owner login page
    When I enter owner username "thanh.tran@mttjsc.com"
    And I enter owner password "123456"
    And I click the owner login button
    Then I should see the owner homepage