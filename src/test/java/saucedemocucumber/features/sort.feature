Feature: Sorting Product

  @Regression @Positive @Sort
  Scenario: User berhasil sorting product berdasarkan harga
    Given User mengakses web aplikasi
    When User input username
    Then User input password
    When User klik tombol Login
    Then User klik sort icon
    Then User memilih sort harga tertinggi
    Then User melihat produk harga tertinggi