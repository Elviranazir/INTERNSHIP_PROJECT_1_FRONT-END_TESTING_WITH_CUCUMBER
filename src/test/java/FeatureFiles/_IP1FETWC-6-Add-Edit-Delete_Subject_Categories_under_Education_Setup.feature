Feature: Education Setup Functionality
  As an Admin User I should be able to Add-Edit-Delete Subject Categories under Education Setup

  Background: Background for Education Setup Functionality
    Given Navigate to Campus
    And Enter "turkeyts" for username and "TechnoStudy123" for password
    And Click on Login Button
    And Navigate to Education page
    And Click on Setup under Education
    And Click on Subject Categories under Setup under Education

  Scenario: Add a new Subject Category
    And Clicked on Add button
    And Fill the form
      | Mark |
      | 293  |
    When Clicked on Save button
    Then Success message should be displayed

  Scenario: Edit a new Subject Category
    And Clicked on Edit button
    And Change the name with "John"
    When Clicked on Save button
    Then Success message should be displayed

  Scenario: Delete a new Subject Category
    And Search for "293"
    And Click on Delete button
    When Clicked on Confirm Delete button
    Then Success message should be displayed

