package com.bigsmall.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.HeaderLinkUI;

public class HeaderLinks extends HeaderLinkUI {
	WebDriver driver;
	
	public HeaderLinks(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement header()
	{
		return driver.findElement(head);
	}
	

}
