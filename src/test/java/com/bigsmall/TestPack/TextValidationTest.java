package com.bigsmall.TestPack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.TextValidation;
import com.bigsmall.reusableClass.BaseClass;

public class TextValidationTest extends BaseClass {
	
	public static Logger log=Logger.getLogger(BaseClass.class.getName());
	
	@Test
	public void merchen() throws IOException, InterruptedException
	{
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		log.info(driver.getTitle());
		
		TextValidation tv=new TextValidation(driver);
		log.info("Class Instantiated");
		
		String str=tv.TextV().getText();
		log.info("Getting Text:"+str);
		
		log.info("Doing Assertion");
		Assert.assertEquals(str, "What's new");
		
		log.info("Operation done");
		
		
	}

}
