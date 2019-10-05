#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginFunctionality
Feature: Login with Multiple Data

  @SmokeTest
  Scenario Outline: Login newtour website with multiple user
    Given User is on newtours website
    When User enter "<username>" and "<password>" correctly
    Then Logged in successfully

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | aakash   | aakash   |
