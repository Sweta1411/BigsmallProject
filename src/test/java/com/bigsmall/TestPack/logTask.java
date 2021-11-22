package com.bigsmall.TestPack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.Account;
import com.bigsmall.reusableClass.BaseClass;





public class logTask extends BaseClass{
	
	public static Logger log=Logger.getLogger(BaseClass.class.getName());

	@Test
	public void LoginTest() throws IOException
	{

		//setting driver
		driver = setthings();
		log.info(driver.getTitle());
		
		//Getting Url
		driver.get(prop.getProperty("url"));
		log.info(driver.getTitle());
		
		//Instantiating AccountUi
		Account Au=new Account(driver);
		log.info("Class Instantiated");
		
		Au.SignIn().click();
		log.info("Clicked on Login");
		
		Au.nam().sendKeys("shubhampan1411@gmail.com");
		log.info("UserName Entered");
		
		Au.pssw().sendKeys("Shubham@123");
		log.info("Password Entered");
		
		Au.done().click();
		log.info("Clicked on Submit");
		
	}




}
