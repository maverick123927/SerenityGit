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

Feature: Find and validation using currency code 

  
  Scenario Outline: Finding the currency Using given currency code
    Given Sent endpoint using <currency_code>
    When Validation the <status_code>
    Then valideting the responseBody <country>

    Examples: 
      | currency_code | status_code | country     |
      | BRL		 				|    200 			| BRAZIL	    |
      | EGP		 				|    200 			| EGYPT       |
      | EUR		 				|    200 			| Mayotte     |
      | HUF		 				|    200 			| HUNGARY     |
      | KZT		 				|    200 			| KAZAKHSTAN  |
      | KGS		 				|    200 			| KYRGYZSTAN  |
      | MXN		 				|    200 			| MEXICO	    |
      | SGD		 				|    200 			| SINGAPORE   |
