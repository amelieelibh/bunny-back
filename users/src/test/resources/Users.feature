#Author: amelieelibh@gmail.com
#Keywords Summary : Test for users services

Feature: User Tests for Bunny Studio
  I want to test CRUD methods for users rest ws

  Scenario: Adding a new user
    Given A new user data with name "Amelie"
    When I try to add it to db via ws
    Then I validate that userId is 1 and name matches to "Amelie"

  Scenario Outline: Retrieving existing user
    Given An existent user named as "Amelie" with userId 1
    When I call the service with GET method with userId 1
    Then I validate that userId is 1 and name matches to "Amelie"

  Scenario Outline: Updating existing user
    Given An existent user named as "Amelie" with userId 1
    When I call the service with PUT method with userId 1 and name "Amelie Barbosa"
    Then I validate that userId is 1 and name matches to "Amelie Barbosa"

  Scenario Outline: Deleting existing user
    Given An existent user named as "Amelie" with userId 1
    When I call the service with DELETE method with userId 1
    And I call the service with GET method with userId 1
    Then I validate that userId 1 doesn't exist
