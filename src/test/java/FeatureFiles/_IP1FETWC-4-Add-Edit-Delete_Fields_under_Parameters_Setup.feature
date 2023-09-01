#As an Admin User

#I should be able to Add-Edit-Delete Fields under Parameters Setup

#Admin User should be able to Add Fields, Edit Fields and Delete Fields for setting up parameters for different schools and environments.

#Fields tab should be under Setup > Parameters tab. We should also have a search functionality for this page

Feature: Parameters Setup Functionality
As a admin user I should be able to Add-Edit-Delete Fields under Parameters Setup

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Setup
    And Click on Parameters
    And Click on Fields

Scenario: Add a new Fields
    When Add a new Fields
    Then Success message should be displayed


  Scenario: Edit a new Fields
    When Edit a new Fields
    Then Success message should be displayed

  Scenario: Delete a new Fields
    When Delete a new Fields
    Then Success message should be displayed


