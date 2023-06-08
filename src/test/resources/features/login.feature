@regression
@login
Feature: Login
  #As a user, I should be able to login with my credentials
  #so that I can reach out to the app to use.
  #Acceptance Criteria:
  #       1.user should be able to login with valid credentials.
  #       2.User should not be able to login with invalid credentials.
  #       3. ...
  #       4. ...
  #Not: bu bir user story, bu user story ye bakarak scenario yu yazıyoruz.

  #Not!!! Eddie Murphy ve Morgan Freeman yi source code dan aldık, almazsan hata verir.

  Background:
    Given The user is on the login page

  @teacher @krafttech @smoke
  Scenario: Login as Mike
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to login




