Feature: Complete Purchase Flow on OpenCart
  As a guest user
  I want to add products to the shopping cart and complete the checkout
  So that I can confirm that the purchase flow is working correctly

  Scenario: Complete purchase as a guest user
    Given Sergey go to openCart page
    When Buy a "MacBook" and "iPhone"
    Then He should see a confirmation message