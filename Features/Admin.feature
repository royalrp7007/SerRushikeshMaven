Feature:Admin

 @smoke
 Scenario: Login with valid credential
  Given User launch Chrome Browser
  When User open url "https://www.bhaane.com/"
  And User enter Email as "rushikesh.p1210@gmail.com" and password as "Rushikesh@1818"
  And User click on Login button 
  Then Verify account user name display as "Rushikesh"
  Then User Verify Dashboard page
  And close browser
  
 @smoke 
 Scenario: Login with valid credential
  Given User launch Chrome Browser
  When User open url "https://www.bhaane.com/"
  And User enter Email as "rushikesh.p1210@gmail.com" and password as "Rushikesh@1818"
  And User click on Login button 
  Then Verify account user name display as "Rushikesh"
  Then User Verify Dashboard page
  And close browser
  
  @sanity
 Scenario: Login with valid credential
  Given User launch Chrome Browser
  When User open url "https://www.bhaane.com/"
  And User enter Email as "rushikesh.p1210@gmail.com" and password as "Rushikesh@1818"
  And User click on Login button 
  Then Verify account user name display as "Rushikesh"
  Then User Verify Dashboard page
  And close browser

Scenario Outline: 