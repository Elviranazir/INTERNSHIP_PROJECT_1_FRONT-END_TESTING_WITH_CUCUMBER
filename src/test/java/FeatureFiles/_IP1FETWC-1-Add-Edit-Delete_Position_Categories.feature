#As an Admin User
#I should be able to Add-Edit-Delete Position Categories
#Under Human Resources Setup
#Admin User should be able to Add Position Categories, Edit Position Categories and Delete Position Categories for setting up human resources details for management of schools.
#Position Categories tab should be under Human Resources > Setup tab. And we should have search function for this page.

Feature: Human Resources Setup Functionality
As an Admin User I should be able to Add-Edit-Delete Position Categories Under Human Resources Setup

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Human Resources page
    And Click on Setup
    And Click on Positions


  Scenario: Add a new position
    When Add a new position
    Then Success message should be displayed


  Scenario: Edit a new position
    When Edit a new position
    Then Success message should be displayed

  Scenario: Delete a new position
    When Delete a new position
    Then Success message should be displayed

.