Feature: Retail Page Feature

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username "akmal.walizada@yahoo.com" and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
    
   @Affiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website | taxID | paymentMethod |payeeName|
      |walizada|walizada.us|54321	|Cheque|         walizada|
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
    
    
  
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      |BOA|987654321|741258|SCHOOL|852369741|
    And User click on Continue button
    Then User should see a success message
    @Test
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email | telephone |
      |Omar|Osman|akmal.walizada@yahoo.com|987654321|
    And User click on Continue button
    Then User should see a message Success: Your account has been successfully updated.
