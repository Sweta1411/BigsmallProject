package com.bigsmall.TestPack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.Cart;
import com.bigsmall.reusableClass.BaseClass;
import com.bigsmall.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CartTest extends BaseClass {
	

	static ExtentTest test;
	static ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReportResults-"+ System.currentTimeMillis() + "-.html");
	public static Logger log=Logger.getLogger(BaseClass.class.getName());
	
	@Test
	public void merchen() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		test = report.startTest("Home Page");
		
		Cart cp=new Cart(driver);
		log.info("Class Instantiated");
		
		cp.clickProduct().click();
		log.info("Click on the product diplayed");
		Thread.sleep(4000l);
		
		cp.WishList().click();
		log.info("Add product to the wishList");
		
		cp.AddCart().click();
		log.info("Add product to the cart");
		Thread.sleep(4000l);
		
		cp.CheckOut().click();
		log.info("confirmation");
		Thread.sleep(4000l);
		
		String str=cp.Texture().getText();
		log.info("Displayed txt is:"+str);
		System.out.println(str);
		
		driver.close();
		
		report.endTest(test);
		report.flush();
		
		
	}


}
