@B&CashFeature
Feature: Techfios billing loginpage functionality validation


  Scenario Outline: user should be able to make new account with valid credentials in bank & cash menu
  Given User is on the techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    When user clicks on sign in button
    Then user should be able to land on dashboard page
  	 When User clicks on Bank & Cash Menu button
    When User clicks on New account under Bank & cash menu button
    Then User should be able to land on Accounts Page
    When User enters account Title as "<Account Title>"
    When User enters description as "<Description>"
    When User enters initial balance as "<Initial balance>"
    When User enters account number as "<Account number>"
    When User enters contact person as "<Contact person>"
    When User enters phone as "<Phone>"
    When User enters internet banking url as "<Internet banking url>"
    When User clicks on submit button
    Then User should be able to land on Accounts page

    Examples: 
    | username          | password | Account Title    | Description  | Initial balance | Account number | Contact person | Phone     | Internet banking url |
    | demo@techfios.com | abc123   | Checking Account | saving money |          200000 |      123456789 | MGA            | 987654321 | www.bofa.com         |
    
    
      
      
