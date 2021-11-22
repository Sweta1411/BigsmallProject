package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.AccountUI;

public class Account extends AccountUI {

	WebDriver driver;
	
	
	public Account(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(sign);
	}
	
	public WebElement nam()
	{
		return driver.findElement(name);
	}
	
	public WebElement pssw()
	{
		return driver.findElement(pass);
	}
	
	public WebElement done()
	{
		return driver.findElement(sbmit);
	}
	

}
