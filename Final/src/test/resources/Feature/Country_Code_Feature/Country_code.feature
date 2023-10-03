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

Feature: Find and validation using country code
  

  
  Scenario Outline: All the country within a given country code
  
    Given Find country using <country_code>
    When Validation the <status_code>
    Then valideting the responseBody <country>
    

    Examples: 
      | country_code  | status_code | status  		|
      | AF 						|     200 		| Afghanistan |
      | AU 		 				|     200 		| Australia   |
      | CA 		 				|     200 		| Canada    	|
      | DE 						|     200 		| Germany	    |
      | IN 		 				|     200 		| India		    |
      | IT		 				|     200 		| Italy		    |
      | JP		 				|     200 		| Japan		    |
      | KZ						|     200 		| Kazakhstan  |
      | MV		 				|     200 		| Maldives    |
