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
Feature: Enter Invoice
  I want to enter total_amount and customer_name in database

  Scenario: Invoice Info Entered successfully
    Given I want to enter total_amount  and customer_name
    When I enter valid <total_amount> and <customer_name>
    Then I have entered Info successfully

    Examples: 
      | total_amount | customer_name  |
      | t_amt1 | c_name1   |
      | t_amt2 | c_name2   |
      | t_amt3 | c_name3   |
      | t_amt4 | c_name4   |

