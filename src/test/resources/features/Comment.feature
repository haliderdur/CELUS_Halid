@CEL02
Feature: Travel Blog card pages comment feature
  Agile Story: As a user, when I am on any Travel card page
  I should be able to add, edit and delete comment

  Background: User already logged in
    Given User is on Travel Blog main page

  @CEL02-01
  Scenario: User goes first card page and add comment
    When User clicks first travel card
    And User types "CELUS IS COOL AMAZING" in comment input box and send
    Then User should see "CELUS IS COOL AMAZING" comment under comments section


  @CEL02-02
  Scenario: User can delete comment
    When User clicks first travel card
    And User should be able to delete "CELUS IS COOL AMAZING" comment by clicking delete icon
    Then User should not be seeing "CELUS IS COOL AMAZING" comment under comments section