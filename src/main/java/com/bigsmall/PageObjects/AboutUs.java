package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.AboutUsUI;

public class AboutUs extends AboutUsUI{
	
	WebDriver driver;
	
	
	public AboutUs(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement About1()
	{
		return driver.findElement(About);
	}
	
	public WebElement Wel()
	{
		return driver.findElement(Welcome);
	}
	


}
