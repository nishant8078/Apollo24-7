Feature: To check invalid login functionality


   
Scenario Outline: Check login is unsuccessfull with invalid credentials
    Given Chrome is opened and apollo247 app is opened
    When User navigate on landing page
    Then Fields on navigation page are visible to the user
    Then User clicks on login button
    Then User enters invalid "0000000000" mobile number 
    When User enters invalid OTP
    Then User should get the error text on console
   

       
    
    