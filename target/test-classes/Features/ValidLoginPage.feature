Feature: To check login functionality

  Scenario: UI
    Given Chrome is opened and apollo247 app is opened
    When User navigate on landing page
    Then Fields on navigation page are visible to the user

  Scenario: Landing Page
    Given Chrome is opened and apollo247 app is opened
    When User navigate on landing page 
  

  Scenario: Check login is successfull with valid credentials
    Given Chrome is opened and apollo247 app is opened
    When User navigate on landing page
    Then Fields on navigation page are visible to the user
    When  User clicks on login button 
    Then User enters mobile number
    When User click on arrow button
    And After entering OTP click on arrow button
    Then Users details are printed on the console
    Then User will click on orders button for navigating on my orders page 
    Then User will go back to home page 
    
    
    

    