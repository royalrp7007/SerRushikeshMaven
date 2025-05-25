Feature: Make A Payment

 Scenario Outline: To check multiple users for Make A Payment
  Given User launch Chrome Browser
  When User open url "<url>"
  And User enter Email as "<Username>" and password as "<Password>"
  And User click on Login button 
  Then Verify account user name display as "<User>"
  Then User Verify Dashboard page
  And close browser
  
  Examples:
  |url                    |Username                  |Password            |User|
  |www.hdfc.com           |Rushieksh@gmail.com       |Rushi123            |Rushi|
  |www.hdfc.com           |Prashant@gmail.com        |Prashant            |Pasha|
  |www.hdfc.com           |Mayuri@gmail.com          |Mayuri12            |Mayuri|


