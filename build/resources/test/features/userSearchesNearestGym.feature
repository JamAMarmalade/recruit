Feature: Search postcode

  Scenario: I search my postcode
    Given I go to the website "https://www.nuffieldhealth.com/"
    And I click on "Gym tab"
    And I find and click on the link "join a gym"
    And I input "SE1 9AA" to the field "Search Gym"
    And I can see the link with text "arrange a visit"

    Scenario: I go to reed
      Given I go to the website "https://www.reed.com/candidates"
      And I click on "Allow Cookies"
      And I input "Accountant" to the field "Role"
      And I input "London, UK" to the final field "Location"
      And I click on "Search Job"
      And I can see the link with text "Search jobs on Reed.co.uk"
      Then I can view the job applications

    Scenario: I go to Linkedin
      Given I go to the website "https://www.linkedin.com"
      And I input "tomia_@hotmail.com" to the field "Email field"
      And I input "STDstd123" to the field "Password field"
      And I click on "Agree"
      And I click on "Skip"
      And I input "Deloitte" to the final field "Employer search"
      And I click on the "Deloitte" link
      And I find the employer details

  Scenario: I go to
    Given I go to the website "https://www.indeed.co.uk"
    And I input "accountant" to the field "Indeed Role"
    And I input "London" to the field "Indeed Location"
    And I click on "Indeed reject"
    And I click on "Indeed job search"
    And I click on the "Accountant" link text