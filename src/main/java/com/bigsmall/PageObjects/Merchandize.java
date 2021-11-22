package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.MerchandizeUI;

public class Merchandize extends MerchandizeUI{
	
	WebDriver driver;

	public Merchandize(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement merch()
	{
		return driver.findElement(Mer);
	}
	
	public WebElement Dcmerch()
	{
		return driver.findElement(DcMer);
	}
	
	public WebElement DcLink()
	{
		return driver.findElement(LinkC);
	}


}
