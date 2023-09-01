#As an Admin User I should be able to Add-Edit-Delete Document Types under Parameters Setup
#Admin User should be able to Add Document Types, Edit Document Types and Delete Document Types for setting up parameters for different schools and environments.
#Document Types tab should be under Setup > Parameters tab. We should also have a search functionality for this page.


Feature: Add-Edit-Delete Document Types under Parameters Setup
  As an Admin User I should be able to Add-Edit-Delete Document Types under Parameters Setup

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to SetUp
    And Navigate to Parameters
    And Click on Document Types

  Scenario: Add a new Document Type
    When Add a new Document Type
    Then Success message should be displayed

  Scenario: Edit a new Document Type
    When Edit a new Document Type
    Then Success message should be displayed

  Scenario: Delete a new Document Type
    When Delete a new Document Type
    Then Success message should be displayed