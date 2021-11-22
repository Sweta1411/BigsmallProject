package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.AllOfItUI;

public class AllOfIt extends AllOfItUI {
	
	WebDriver driver;
	
	
	public AllOfIt(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Allof()
	{
		return driver.findElement(all);
	}
	
	public WebElement Auto()
	{
		return driver.findElement(auto);
	}
	
}
