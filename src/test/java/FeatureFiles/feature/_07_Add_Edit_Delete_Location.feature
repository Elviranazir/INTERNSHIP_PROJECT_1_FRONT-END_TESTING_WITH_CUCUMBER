Feature: Add-Edit-Delete School Locations under School Setup

  As an Admin User I should be able to Add-Edit-Delete School Locations under School Setup

  Background:   Login and Navigate to School Location
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button



  Scenario: Add School Locations under School Setup
    And Navigate to School Setup
    And Navigate to School Location
    When Add new location
    Then New location should be displayed

  Scenario: Edit School Locations under School Setup
    And Navigate to School Setup
    And Navigate to School Location
    When Edit location
    Then Edited location should be displayed

  Scenario: Delete School Locations under School Setup
    And Navigate to School Setup
    And Navigate to School Location
    When Delete location
#    Then New Location shouldn't be displayed






