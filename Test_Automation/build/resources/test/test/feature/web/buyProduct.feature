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
@tag
Feature: Buy product
  I want to buy a product and validate if it was added to the shopping cart

  @tag1
  Scenario: Add a product to the shopping cart
    Given I'm on the home page
    When I look for the product Blouse
    And Add the Blouse to the shopping cart
    Then Validate that the Blouse has been successfully added to the cart