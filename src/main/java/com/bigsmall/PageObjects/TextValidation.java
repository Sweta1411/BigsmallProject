package com.bigsmall.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.TextValidateUI;

public class TextValidation extends TextValidateUI{
	
	public WebDriver driver;
	
	
	public TextValidation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement TextV()
	{
		return driver.findElement(text);
	}

}
