Feature: Addtocart Barang Saucedemo

  @Regression @Positive @Cart
  Scenario: User berhasil menambahkan produk dalam keranjang
    Given User mengakses web aplikasi
    When User input username
    Then User input password
    When User klik tombol Login
    Then User klik addtocart produk yang dipilih
    Then User melihat tombol remove pada produk yang dipilih
