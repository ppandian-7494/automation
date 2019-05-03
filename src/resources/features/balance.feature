#  Each feature contains one feature
#  Feature files use Gherkin language - business language(plain English)
Feature: Test the Balance Page

#  A feature may have given different specific scenarios
#  Scenarios use Given-When-Then structure
  Scenario: the user should be able to navigate to https://www.exercise1.com/values page
    Given user is on the balance page
    Then user see all values appear on the screen
    And user see values are greater than zero
    And user see total balance is sum of all values
    And user see values are formatted as currencies
    Then user close the balance page
