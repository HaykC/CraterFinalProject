@LoginPage
Feature: Login Page UI

  @VerifyingLoginPageUI_Components
  Scenario: Verifying Login Page UI components
    Given I navigate to the Crater Login Page
    Then I should be directed to the Crater Login Page
    Then I should verify The Page title is "Crater"
    Then I should verify a Text-Box with the Label "Email"
    Then I should verify A Text box with the Label "Password"
    Then I should see A link titled "Forgot Password?"
    Then I should see a button labeled "Login"
    Then The footer text should be following: "Copyright @ Crater Invoice, Inc. 2023"
    Then I should see A heading located to the right with the following text "Simple Invoicing for Individuals Small Businesses"
    Then I should see A Heading located underneath Heading 1 with the following text "Crater helps you track expenses, record payments & generate beautiful invoices & estimates."
    
    

