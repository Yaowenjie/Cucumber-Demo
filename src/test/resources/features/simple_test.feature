@base_flow
Feature: This is a simple test using Cucumber.
  I can go to my blog home page
  When I search one article using one key word
  Then I can click the search result and enter one article page

  Scenario:
    Given I enter my blog address "http://localhost:4000" and go to Home page
    # Search Button Feature:
    When I click the search button
    And I enter "PowerShell" in the input field
    And I click the first result of search
    Then I go to the article page with title containing "PowerShell"

