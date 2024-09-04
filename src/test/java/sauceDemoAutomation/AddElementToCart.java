package sauceDemoAutomation;

import com.saucedemo.ElementUtils;
import com.saucedemo.SauceDemoLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class AddElementToCart {

    By username= By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginBtn = By.xpath("//input[@id='login-button']");
    public static  void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ElementUtils util = new ElementUtils(driver);
        SauceDemoLocators locators = new SauceDemoLocators();
        util.openURL("https://www.saucedemo.com/");
        util.getElement(locators.username).sendKeys("standard_user");
        util.getElement(locators.password).sendKeys("secret_sauce");
        util.clickBtn(locators.loginBtn);
        util.findProductToAddToCart(locators.listOfproducts,locators.getProduct, "Sauce Labs Backpack");
        util.addToCart(locators.addToCartBtn);
        util.checkProductAddedToCart(locators.cartQuantity,"1",locators.cart,locators.productIncart,"Sauce Labs Backpack");
        util.checkout(locators.checkoutBtn,locators.firtName,locators.lastName,locators.postalCode,locators.continueBtn,locators.finishBtn, locators.checkoutCompleteMsg);





    }


}
