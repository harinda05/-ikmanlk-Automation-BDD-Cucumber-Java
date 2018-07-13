Feature: To get property details from ikman

@smokeTest
Scenario: Ikman Automation
  Given I open chrome and go to ikmanlk
  When I click on property button
  And I click on houses
  And I click on Colombo
  And  I set min,max prices and the bed count
  Then i should be ale to get verified advertisement details
