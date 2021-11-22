package com.bigsmall.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.CartUI;

public class Cart extends CartUI{

	public WebDriver driver;
	
	public Cart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickProduct()
	{
		return driver.findElement(product);
	}
	
	public WebElement WishList()
	{
		return driver.findElement(wish);
	}
	
	public WebElement AddCart()
	{
		return driver.findElement(ACart);
	}
	
	public WebElement CheckOut()
	{
		return driver.findElement(check);
	}
	
	public WebElement Texture()
	{
		return driver.findElement(text);
	}
	
}
