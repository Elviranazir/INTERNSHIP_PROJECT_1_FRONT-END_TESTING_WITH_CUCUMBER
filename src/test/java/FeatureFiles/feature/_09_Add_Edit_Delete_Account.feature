Feature: Add-Edit-Delete Bank Accounts under Parameters Setup

  As an Admin User I should be able to Add-Edit-Delete Document Types under Parameters Setup
  Admin User should be able to Add Bank Accounts, Edit Bank Accounts and Delete Bank Accounts
  for setting up parameters for different schools, students and employees.

  #comment for merging, delete

  Background:    Login and Navigate to campus
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    And Navigate to Setup
    And Navigate to Parameters
    And Navigate to Bank Accounts

  Scenario: Add Accounts under Parameters Setup

    When Add new Account
    Then New Account should be displayed

  Scenario: Edit Accounts under Parameters Setup

    When Edit Account
    Then Edited Account should be displayed

  Scenario: Delete Accounts under Parameters Setup
    When Delete Account