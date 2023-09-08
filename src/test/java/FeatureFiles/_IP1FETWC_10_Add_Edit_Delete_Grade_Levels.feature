Feature: Grade Levels Functionality
  As an Admin User I should be able to Add-Edit-Delete Grade Levels under Parameters Setup

  Background: Background for Grade Levels Functionality
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Click on Setup
    And Click on Parameters
    And Click on Grade Levels

  Scenario: Add a new grade level
    When Clicked on Add button
    And Fill the form with Grade Levels Data
      | Ashley |
      | Ash    |
      | 295    |
    And Clicked on Save button
    Then Success message should be displayed

  Scenario: Edit a grade level
    When Clicked on Grade Levels Edit button
    And Edit the name with "Amy"
    And Clicked on Save button
    Then Success message should be displayed

  Scenario: Delete a grade level
    And Delete a grade level
    Then Success message should be displayed