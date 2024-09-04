package com.saucedemo;

import org.openqa.selenium.By;

public class SauceDemoLocators {
    public By username= By.xpath("//input[@placeholder='Username']");
    public By password = By.xpath("//input[@placeholder='Password']");
    public By loginBtn = By.xpath("//input[@id='login-button']");
    public By listOfproducts = By.xpath("//*[@id='inventory_container']//div[@class='inventory_item']");
    public By getProduct = By.className("inventory_item_name");
    public By addToCartBtn = By.xpath("//button[text()='Add to cart']");
    public By cart = By.xpath("//a[@class='shopping_cart_link']");
    public By cartQuantity = By.xpath("//*[@class='shopping_cart_badge']");
    public By productIncart = By.xpath("//*[text()='Sauce Labs Backpack']");
    public By checkoutBtn = By.xpath("//*[text()='Checkout']");
    public By firtName = By.xpath("//*[@placeholder='First Name']");
    public By lastName = By.xpath("//*[@placeholder='Last Name']");
    public By postalCode = By.xpath("//*[@name='postalCode']");
    public By continueBtn = By.xpath("//*[@id='continue']");
    public By finishBtn = By.xpath("//*[@id='finish']");
    public By checkoutCompleteMsg = By.xpath("//*[text()='Checkout: Complete!']");

}
