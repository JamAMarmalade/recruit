Feature: Search postcode

  Scenario: I search my postocde
    Given I go to the website "https://www.nuffieldhealth.com/"
    And I click on "Gym tab"
    And I find and click on the link "join a gym"
    And I input "SE1 9AA" to the field "Search Gym"
    And I can see the link with text "arrange a visit"