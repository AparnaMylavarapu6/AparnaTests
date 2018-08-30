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

Feature: Validate the following functionalities on the Login module 
As an Admin User,Application should accept only Admin credentials
if there is an invalid user name and password user must validate the error message
if the user forgot the user name and password, the user should be able to reset

 @smoketest
  Scenario: This scenario is designed to validate the Valid Credentails of Admin User
 Given Launch "browsertype" Browser and "Url"
 |ff|http://server/bank/|
  Then Enter Username and Password
  And Verify the Admin page is displayed
  

 