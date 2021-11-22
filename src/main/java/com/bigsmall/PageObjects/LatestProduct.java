package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.LatestProductUI;

public class LatestProduct extends LatestProductUI{
	
	public WebDriver driver;
	
	public LatestProduct(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Latest()
	{
		return driver.findElement(LatestProductClick);
	}

}
