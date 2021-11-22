package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.testData.OfficialMerchantUI;

public class OfficialMerchant extends OfficialMerchantUI {
	
	public WebDriver driver;
	

	public OfficialMerchant(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Merchant()
	{
		return driver.findElement(officialMer);
	}
	

}
