Feature: To check invalid login functionality



Scenario Outline: Check login is unsuccessfull with invalid mobilenumber
    Given Chrome is opened and apollo247 app is opened
    When User navigate on landing page
    Then Fields on navigation page are visible to the user
    Then User clicks on login button
    Then User enters invalid "<invalidmobilenumber>" mobile number 
    Then User should get the invalid mobile error text on console
   
  Examples:
   | invalidmobilenumber    | 
   | 0000000000             |   
      
         
  
Scenario Outline: Check login is unsuccessfull with invalid otp
    Given Chrome is opened and apollo247 app is opened
    When User navigate on landing page
    Then Fields on navigation page are visible to the user
    Then User clicks on login button
    Then User enters valid "<validmobilenumber>" mobile number 
    When User click on arrow button
    When User enters invalid OTP
    Then User should get the invalid OTP error text on console
   
  Examples:
   | validmobilenumber   | 
   | 8078632273          |   
      
       





    