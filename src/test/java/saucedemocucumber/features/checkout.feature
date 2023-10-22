Feature: Checkout product

  @Regression @Positive @Checkout
  Scenario: User berhasil checkout product
    Given User mengakses web aplikasi
    When User input username
    Then User input password
    When User klik tombol Login
    Then User klik addtocart produk yang dipilih
    When User klik shoppingcart icon
    Then User melihat halaman Yourcart
    When User klik tombol Checkout
    Then User input First Name
    Then User input Last Name
    Then User input zip
    When User klik tombol Continue
    Then User melihat halaman Overview
    Then User klik tombol Finish
    Then User melihat halaman Checkoutcomplete


