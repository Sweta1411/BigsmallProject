package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.BlogsUI;

public class Blogs extends BlogsUI{

	public WebDriver driver;
	
	public Blogs(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement ClickBlog()
	{
		return driver.findElement(BlogClick);
	}
	
	public WebElement Statemnt()
	{
		return driver.findElement(phrase);
	}
	
	
	
}
