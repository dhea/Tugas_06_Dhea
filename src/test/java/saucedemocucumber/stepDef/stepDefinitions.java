package saucedemocucumber.stepDef;

import io.cucumber.java.PendingException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class stepDefinitions {

    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("User mengakses web aplikasi")
    public void user_Mengakses_Web_Aplikasi() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @When ("User input username")
    public void user_Input_Username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @Then("User input password")
    public void user_Input_Password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("User klik tombol Login")
    public void user_Klik_Tombol_Login() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("User melihat halaman Products")
    public void user_Melihat_Halaman_Products() {
        ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='header_secondary_container']/span[@class='title']"));
        driver.close();
    }

    @When("User input username yang tidak terdaftar")
    public void user_Input_Username_Yang_Tidak_Terdaftar() {
        driver.findElement(By.id("user-name")).sendKeys("testing_user");
    }

    @Then("User mendapatkan Alert error")
    public void user_Mendapatkan_Alert_Error() {
        driver.findElement(By.className("error-button"));
        driver.close();
    }

    @Then("User klik addtocart produk yang dipilih")
    public void user_Klik_Addtocart_Produk_Yang_Dipilih() {

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }


    @Then("User melihat tombol remove pada produk yang dipilih")
    public void user_Melihat_Tombol_Remove_Pada_Produk_Yang_Dipilih() {
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
        driver.close();
    }

    @Then("User klik sort icon")
    public void user_Klik_Sort_Icon() {
        driver.findElement(By.xpath("//select")).click();
    }

    @Then("User memilih sort harga tertinggi")
    public void user_Memilih_Sort_Harga_Tertinggi() {
        String option = "Price (high to low)";
        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));
        dropdown.click();
    }

    @Then("User melihat produk harga tertinggi")
    public void user_Melihat_Produk_Harga_Tertinggi() {
        driver.findElement(By.xpath("//span[contains(text(),'Price (high to low)')]"));
        driver.close();
    }

    @When("User klik shoppingcart icon")
    public void user_Klik_Shoppingcart_Icon() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("User melihat halaman Yourcart")
    public void user_Melihat_Halaman_Yourcart() {
        driver.findElement(By.xpath(" //span[contains(text(),'Your Cart')]"));
    }

    @When("User klik tombol Checkout")
    public void user_Klik_Tombol_Checkout() {
        driver.findElement(By.id("checkout")).click();
    }

    @Then("User input First Name")
    public void user_Input_First_Name() {
        driver.findElement(By.id("first-name")).sendKeys("testing");
    }

    @Then("User input Last Name")
    public void user_Input_Last_Name() {
        driver.findElement(By.id("last-name")).sendKeys("user");
    }

    @Then("User input zip")
    public void user_Input_Zip() {
        driver.findElement(By.id("postal-code")).sendKeys("123456");
    }

    @When("User klik tombol Continue")
    public void user_Klik_Tombol_Continue() {
        driver.findElement(By.id("continue")).click();
    }

    @Then("User melihat halaman Overview")
    public void user_Melihat_Halaman_Overview() {
        driver.findElement(By.xpath("//span[contains(text(),'Checkout: Overview')]"));
    }

    @Then("User klik tombol Finish")
    public void user_Klik_Tombol_Finish() {
        driver.findElement(By.id("finish")).click();
    }

    @Then("User melihat halaman Checkoutcomplete")
    public void user_Melihat_Halaman_Checkoutcomplete() {
        driver.findElement(By.xpath("//span[contains(text(),'Checkout: Complete!')]"));
        driver.close();
    }
}
