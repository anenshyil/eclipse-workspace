Feature: Automation Practice Test using DataDriven concept


Scenario Outline: User information are given in Signup page

Given User clicks Sign-in button from Automation Home Page
Then User checks Create an Account is present on page
When User gives "Email" in Create an account buttom
Then Clicks create an account button
When User selects the radio button for (mr/mrs)  
When User gives "First Name" and "Last name" of the customer "<id>" 
And User gives "Password" and gives a "Password" for customer "<id>"
And User gives DOB  "2" & "2" & "1990" for customer
And User gives checks on NewsLetter and Options checkbox
And User gives company name "Company" for customer "<id>" 
And User gives address Line as "Final" for customer "<id>" 
And User gives address Line Additional as "(Line 2)" for customer "<id>"
And User gives City name "City" for Customer "<id>"
And User chooses State name State "14" for Customer 
And User chooses "Zip/Postal Code" for customer "<id>"
And User chooses Country "21" for country 	
And User gives "Additional information" for customer "<id>"
And user gives "Home phone" and "Mobile phone"  number for customer "<id>"
And user gives "Assign an address alias for future reference. " address for customer "<id>"

Examples:
|id|
|1|
|2|

Scenario: User Verifies and login the application


Given User Check Whether phone number is available on the Home Page
And User Checks Logo is available on the Home Page 
When User Clicks on signin button in top of the Home Page
Then User Checks Create an account is available
Then User gives the Username in the Sign-in Page
And User gives the password in the Sign-in Page
Then user click the sign-in button in Home Page


Scenario: Order Placing after Login by User

Given User checks User name is correct
And User checks contact us is present
Then User Clicks then women menu in the Order Page
When User Clicks Casual dress sub menu in Order Page
Then User Sorts in the list of results in ascending order
And User checks that Casual dress is present in the Order Page
Then User clicks the Add to cart opton over the selected product


Scenario: Click on proceed to confirm Order

Given User clicks Proceed to payment to continue order placement
Then User checks User name is correct
And User checks contact us is present
Then User clicks on Plus sign to add one more quantity
And User checks Address is displayed in the order confirmation Page
Then User clicks Proceed to payment to continue order placements

Scenario: Check and confirm address

Given User selects my same address from drop down
Then User clicks Proceed to payment to continue order placements
And User clicks checkbox to agree terms and conditions
Then User clicks Proceed to payment to continue order placements

Scenario: Bank payment page

Given User clicks Pay by wire option for bank payment page
When User clicks Proceed to confirm my order
Then User logout from the application


Scenario: User Verifies and login the application

Given User launches the browser and hit the Automation Practice Application
Then User Check Whether phone number is available on the Home Page
And User Checks Logo is available on the Home Page 
When User Clicks on signin button in top of the Home Page
Then User Checks Create an account is available
Then User gives the Username in the Sign-in Page
And User gives the password in the Sign-in Page
Then user click the sign-in button in Home Page

Scenario Outline: Order Placing Using search after Login


Given User checks User name is correct
And User checks contact us is present
When User gives "<productname>" in search field
And User clicks search in Order Page
Then User Sorts in the list of results in ascending order

Examples:
|productname|
|T-Shirt|
|cotton|
|Dresses|
Scenario:Clicking Add to cart

Given User clicks the Add to cart opton over the selected required product

Scenario: Click on proceed to confirm Order

Given User clicks Proceed to payment to continue order placement
Then User checks User name is correct
And User checks contact us is present
Then User clicks on Plus sign to add one more quantity
And User checks Address is displayed in the order confirmation Page
Then User clicks Proceed to payment to continue order placements

Scenario: Check and confirm address

Given User selects my same address from drop down
Then User clicks Proceed to payment to continue order placements
And User clicks checkbox to agree terms and conditions
Then User clicks Proceed to payment to continue order placements

Scenario: Bank payment page

Given User clicks Pay by wire option for bank payment page
When User clicks Proceed to confirm my order
Then User logout from the application
