package com.bigsmall.TestPack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.Merchandize;
import com.bigsmall.reusableClass.BaseClass;

public class MerchandizeTest extends BaseClass {
	
	public static Logger log=Logger.getLogger(BaseClass.class.getName());
	
	@Test
	public void merchen() throws IOException, InterruptedException
	{
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		log.info(driver.getTitle());
		
		Merchandize mp=new Merchandize(driver);
		log.info("Class Instantiated");
		
		Actions act=new Actions(driver);
		log.info("Hovering over a Dynamaic Dropdown");
		WebElement ele=mp.merch();
		act.moveToElement(ele).perform();
		Thread.sleep(5000L);
		mp.Dcmerch().click();
		log.info("Value Selected in dynamic DropDown");
		log.info(driver.getTitle());
		
		WebElement ele1=mp.DcLink();
		if(ele1.isDisplayed())
		{
			System.out.println("Expected Result Found");
			log.info("Expected Value Matched");
		}
	}

}
