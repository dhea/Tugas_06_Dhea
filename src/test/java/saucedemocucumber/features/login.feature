Feature: Log in saucedemo

  @Regression @Positive @Login
  Scenario: User login menggunakan username dan password yang telah terdaftar
    Given User mengakses web aplikasi
    When User input username
    Then User input password
    When User klik tombol Login
    Then User melihat halaman Products

  @Regression @Negative @Login
  Scenario: User login menggunakan password yang tidak terdaftar
    Given User mengakses web aplikasi
    When User input username yang tidak terdaftar
    Then User input password
    When User klik tombol Login
    Then User mendapatkan Alert error
