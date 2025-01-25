Feature: OrangeHRM Application

  Scenario: Validate LoginPage Functionality
    Given User should open browser "chrome"
    When User should be on login page
    And User enter username as "Admin" and password as "admin123"
    Then User should click on login button

  Scenario: validate HomePage Functionality
    When user is on homepage and user validate Logo
    And user validate Title
    And user click on pimPage link
