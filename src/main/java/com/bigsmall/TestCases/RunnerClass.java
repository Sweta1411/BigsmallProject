package com.bigsmall.TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.AboutUs;
import com.bigsmall.PageObjects.Account;
import com.bigsmall.PageObjects.AllOfIt;
import com.bigsmall.PageObjects.Blogs;
import com.bigsmall.PageObjects.Cart;
import com.bigsmall.PageObjects.HeaderLinks;
import com.bigsmall.PageObjects.LatestProduct;
import com.bigsmall.PageObjects.Merchandize;
import com.bigsmall.PageObjects.OfficialMerchant;
import com.bigsmall.PageObjects.TextValidation;
import com.bigsmall.reusableClass.BaseClass;
import com.bigsmall.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RunnerClass extends BaseClass {

	
	static ExtentTest test;
	static ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReportResults-"	+ System.currentTimeMillis() + "-.html");
	
	public static Logger log=Logger.getLogger(BaseClass.class.getName());

	@Test(priority=1)
	public void merchen() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());

		Cart cp=new Cart(driver);
		log.info("Class Instantiated");
		test.log(LogStatus.PASS,"Class Instantiated");

		cp.clickProduct().click();
		log.info("Click on the product diplayed");
		Thread.sleep(5000l);
		test.log(LogStatus.PASS,"Click on the product diplayed");

		cp.WishList().click();
		log.info("Add product to the wishList");
		test.log(LogStatus.PASS,"Add product to the wishList");

		cp.AddCart().click();
		log.info("Add product to the cart");
		Thread.sleep(4000l);
		test.log(LogStatus.PASS,"Add product to the cart");

		cp.CheckOut().click();
		log.info("confirmation");
		Thread.sleep(4000l);
		test.log(LogStatus.PASS,"confirmation");

		String str=cp.Texture().getText();
		log.info("Displayed txt is:"+str);
		System.out.println(str);
		test.log(LogStatus.PASS,"Displayed txt is"+str);
		
		report.endTest(test);
		report.flush();
		
		
		driver.close();
		log.info("Driver Closed");
	}

	@Test(priority=2)
	public void heading() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver = setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());

		HeaderLinks ci=new HeaderLinks(driver);
		log.info("Class Instatiated");

		WebElement con=ci.header();
		int n=con.findElements(By.tagName("a")).size();
		System.out.println("Number of links present in the page are:"+n);
		log.info("Number of links present in the page are"+n);

		//clicking on the link separately
		for(int i=1;i<5;i++)
		{
			String keytab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			con.findElements(By.tagName("a")).get(i).sendKeys(keytab);
			log.info(driver.getTitle());
		}

		Thread.sleep(5000L);

		//getting all tabs title
		Set<String> ab=driver.getWindowHandles();
		Iterator<String> bc=ab.iterator();
		while(bc.hasNext())
		{
			driver.switchTo().window(bc.next());
			System.out.println(driver.getTitle());
			log.info(driver.getTitle());
		}
		
		report.endTest(test);
		report.flush();
		
		driver.close();
		log.info("Driver Closed");
	}
	
	@Test(priority=3)
	public void LoginTest() throws IOException
	{
		test = report.startTest("Home Page");
		
		//setting driver
		driver = setthings();
		log.info(driver.getTitle());
		
		//Getting Url
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		//Instantiating AccountUi
		Account Au=new Account(driver);
		log.info("Class Instantiated");
		
		Au.SignIn().click();
		log.info("Clicked on Login");
		
		Au.nam().sendKeys("SwetaBharti1411@gmail.com");
		log.info("UserName Entered");
		
		Au.pssw().sendKeys("Sweta@123");
		log.info("Password Entered");
		
		Au.done().click();
		log.info("Clicked on Submit");
		
		report.endTest(test);
		report.flush();
		
		driver.close();
		log.info("Driver Closed");
	}
	
	@Test(priority=4)
	public void merchen1() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		Merchandize mp=new Merchandize(driver);
		log.info("Class Instantiated");
		
		Actions act=new Actions(driver);
		log.info("Hovering over a Dynamaic Dropdown");
		WebElement ele=mp.merch();
		act.moveToElement(ele).perform();
		Thread.sleep(7000L);
		mp.Dcmerch().click();
		log.info("Value Selected in dynamic DropDown");
		log.info(driver.getTitle());
		
		WebElement ele1=mp.DcLink();
		if(ele1.isDisplayed())
		{
			System.out.println("Expected Result Found");
			log.info("Expected Value Matched");
		}
		
		report.endTest(test);
		report.flush();
		
		driver.close();
		log.info("Driver Closed");
	}
	
	@Test(priority=5)
	public void merchen2() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());

		OfficialMerchant omp=new OfficialMerchant(driver);
		log.info("Class Instantiated");

		WebElement ele=omp.Merchant();

		int n=ele.findElements(By.tagName("a")).size();
		log.info("TOtal number of links are:"+n);

		for(int i=1;i<n;i++)
		{
			String keytab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ele.findElements(By.tagName("a")).get(i).sendKeys(keytab);
			log.info(driver.getTitle());
		}
		
		 //getting all tabs title
        Set<String> ab=driver.getWindowHandles();
        Iterator<String> bc=ab.iterator();
        while(bc.hasNext())
        {
        	driver.switchTo().window(bc.next());
        	System.out.println(driver.getTitle());
        	log.info(driver.getTitle());
        }
        
        report.endTest(test);
		report.flush();
        
        driver.close();
		log.info("Driver Closed");
	}
	

	@Test(priority=6)
	public void merchen4() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		TextValidation tv=new TextValidation(driver);
		log.info("Class Instantiated");
		
		String str=tv.TextV().getText();
		log.info("Getting Text:"+str);
		
		log.info("Doing Assertion");
		Assert.assertEquals(str, "What's New");
		
		log.info("Operation done");	
		
		driver.close();
		log.info("Driver Closed");
		
		report.endTest(test);
		report.flush();

	}
	
	@Test(priority=7)
	public void Statements() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		Blogs bp=new Blogs(driver);
		log.info("Class Instantiated");
		
		bp.ClickBlog().click();
		log.info("Clicked on Blog:");
		
		String str1=bp.Statemnt().getText();
		log.info("Quote is:"+str1);
		System.out.println("Quote is:"+str1);
		
		log.info("Operation done");	
		
		report.endTest(test);
		report.flush();
		
		driver.close();
		log.info("Driver Closed");

	}
	
	@Test(priority=8)
	public void LatestProd() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		LatestProduct lpm=new LatestProduct(driver);
		log.info("Class Instantiated");
		
		WebElement ele1=lpm.Latest();
		int n=ele1.findElements(By.tagName("a")).size();
		
		for(int i=0;i<n;i++)
		{
			String str2=ele1.findElements(By.tagName("a")).get(i).getText();
			System.out.println("new Products are:"+str2);
			log.info("new Products are:"+str2);
		}
		
		report.endTest(test);
		report.flush();
		
		driver.close();
		log.info("Driver Closed");

	}

	
	@Test(priority=9)
	public void AllOfItClick() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		AllOfIt lpm=new AllOfIt(driver);
		log.info("Class Instantiated");
		
	
	lpm.Allof().click();
	if(lpm.Auto().isDisplayed()) {
		System.out.println("Desired Product is displayed");
	}
	
	report.endTest(test);
	report.flush();
	
		driver.close();
		log.info("Driver Closed");

	}
	
	
	@Test(priority=10)
	public void AboutUsClick() throws IOException, InterruptedException
	{
		test = report.startTest("Home Page");
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		
		AboutUs lp=new AboutUs(driver);
		log.info("Class Instantiated");
		
	
	lp.About1().click();
	if(lp.Wel().isDisplayed()) {
		System.out.println("Desired text is displayed");
	}
	
	report.endTest(test);
	report.flush();
		driver.close();
		log.info("Driver Closed");

	}

}
