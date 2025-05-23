#This feature is to test switching between tabs
Feature: Testing PLP


  Scenario: Setup one session login
  Given Open Sellerlab
  When User enters Email and click next
  And User re-enter Email, password and next
  And Wait for Mobile_auth
  Then User can choose idp
