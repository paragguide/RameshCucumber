Feature: Amazon Document
  I want to use this document for testing amazon pages

  @amazon @uid
  Scenario: validate userid
    Given I want to open "chrome" and get url "https://www.amazon.in"
    And i click on signin link
    When I enter valid userid "paragguide@yahoo.co.in"
    And  click continue button
    Then I get password textbox
    But does not get error

  @amazon @pwd
  Scenario: validate password
   Given userid is valid
   When i enter correct password "RMinfotech"
   Then i should login
   
   @amazon @search
   Scenario Outline: searching products
    Given i am logged in 
    When i search product <product> in price <price>
    Then i get results
    
    Examples:
    |product|price|
    |Mobile| 15000|
    |LCD| 50000|
    |Speaker| 500|