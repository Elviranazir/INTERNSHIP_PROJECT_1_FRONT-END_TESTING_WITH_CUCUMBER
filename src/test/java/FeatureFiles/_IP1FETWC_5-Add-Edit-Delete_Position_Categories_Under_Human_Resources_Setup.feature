Feature: Position Categories Functionality
  As an Admin User I should be able to Add-Edit-Delete Position Categories

  Background: Background for Position Categories Functionality
    Given Navigate to Campus
    And Enter "turkeyts" for username and "TechnoStudy123" for password
    And Click on Login Button
    And Navigate to Human Resources page
    And Click on Setup under Human Resources
    And Click on Position Categories under Setup under Human Resources

  Scenario: Add a new Position Category
    And Clicked on Add button
    And Fill the form with this Position Categories Data
      | Mark |
    When Clicked on Save button
    Then Success message should be displayed

  Scenario: Edit a new Position Categories
    And Clicked on Edit button
    And Change the name with "John"
    When Clicked on Save button
    Then Success message should be displayed

  Scenario: Delete a new Subject Category
    And Search for "John" in Position Categories
    And Click on Delete button
    When Clicked on Confirm Delete button
    Then Success message should be displayed

