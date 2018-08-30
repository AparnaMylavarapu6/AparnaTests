Feature: Validate the following functionalities on the Login module 
As an Admin User,Application should accept only Admin credentials
if there is an invalid user name and password user must validate the error message
if the user forgot the user name and password, the user should be able to reset

Background:
Given Launch "browsertype" Browser and "Url"
 |ff|http://server/bank/|
 Then Verify the Home page is displayed
   
 @homepage1
  Scenario: This scenario is designed to validate the Homepage 
  Then Verify the Home page tabs are displayed in correct order
  
  @homepage
  Scenario: This scenario is designed to validate the all the tabs are functional is Home page 
  Then click on each tab and verify that user navigates to correct page.
