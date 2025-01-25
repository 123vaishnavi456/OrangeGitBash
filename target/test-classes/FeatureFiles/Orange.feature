Feature: OrangeHRM Application

Scenario: Validate LoginPage Functionality
Given User should open browser "chrome"
When User should be on login page
And User enter username as "Admin" and password as "admin123"
Then User should click on login button
