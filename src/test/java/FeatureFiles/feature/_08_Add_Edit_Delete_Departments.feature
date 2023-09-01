Feature: Add-Edit-Delete Departments under School Setup

  As an Admin User I should be able to Add-Edit-Delete Departments under School Setup
  #comment for merging, delete

  Background: Login and Navigate to School Location
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button


  Scenario: Add-Edit-Delete Departments under School Setup
    And Navigate to School Setup
    And Navigate to Departments

    When Add new Department
    Then New Department should be displayed

  Scenario: Edit Department
    And Navigate to School Setup
    And Navigate to Departments

    When Edit Department
    Then Edited Department should be displayed

  Scenario:
    And Navigate to School Setup
    And Navigate to Departments
    When Delete Department
    #Then Added Department should not be displayed