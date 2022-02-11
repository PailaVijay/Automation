Feature: Application login

   Scenario: Home page default login
    Given user is on netbanking landing page
    When User login into apllication with "abc" and password "123"
    Then home page is papulated
    And cards are displayed "true"



Scenario: Home page default login
    Given user is on netbanking landing page
    When User login into apllication with "vijay" and password "12345"
    Then home page is papulated
    And cards are displayed "false"
    