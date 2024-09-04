package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.List;

public class ElementUtils {

    WebDriver driver;
    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL(String url){
        driver.get(url);
    }

    public WebElement getElement(By locator){
       return driver.findElement(locator);
    }

    public void sendKeys(By locator,String text){
      getElement(locator).sendKeys(text);
    }

    public void clickBtn(By locator){
        getElement(locator).click();
    }

    public void findProductToAddToCart(By locator1, By locator2, String productName){
        List<WebElement> productList = driver.findElements(locator1);
        for(WebElement element:productList){
            WebElement getElement = element.findElement(locator2);
            if(getElement.getText().equals(productName)){
                getElement.click();
                break;
            }
        }
    }

    public void addToCart(By locator){
        getElement(locator).click();
    }

    public void checkProductAddedToCart(By cartQuantity,String NoOfProductAdded, By cart,By productIncart,String productName){
        getElement(cartQuantity).getText().equals(NoOfProductAdded);
        getElement(cart).click();
        getElement(productIncart).getText().equals(productName);
        System.out.println(NoOfProductAdded+" "+productName+" Product added in the cart");
    }

    public void checkout(By checkoutBtn, By firtsName, By lastName, By zipCode,By continueBtn, By finishBtn, By checkoutcompleteMsg){
        getElement(checkoutBtn).click();
        getElement(firtsName).sendKeys("Dummy");
        getElement(lastName).sendKeys("Test");
        getElement(zipCode).sendKeys("12345");
        getElement(continueBtn).click();
        getElement(finishBtn).click();
        getElement(checkoutcompleteMsg).getText().equals("Checkout: Complete!");
        System.out.println("Checkout is completed.");

    }





}
