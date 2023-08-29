#As an Admin User
#I should be able to
#Add-Edit-Delete Attestations under Human Resources Setup
#Admin User should be able to Add Attestations, Edit Attestations and Delete Attestations for setting up human resources details for management of schools.
#Attestations tab should be under Human Resources > Setup tab. And we should have search function for this page.


Feature: Add-Edit-Delete Attestations under Human Resources Setup
  As an Admin User I should be able to Add-Edit-Delete Attestations under Human Resources Setup

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Human Resources page
    And Click on Setup
    And Click on Attestations


  Scenario: Add a new Attestations
    When Add a new Attestations
    Then Success message should be displayed

  Scenario: Edit a new Attestations
    When Edit a new Attestations
    Then Success message should be displayed

  Scenario: Delete a new Attestations
    When Delete a new Attestations
    Then Success message should be displayed

