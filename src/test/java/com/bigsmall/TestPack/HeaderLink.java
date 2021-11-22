package com.bigsmall.TestPack;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.HeaderLinks;
import com.bigsmall.reusableClass.BaseClass;

public class HeaderLink extends BaseClass {

	public static Logger log=Logger.getLogger(BaseClass.class.getName());
	
	WebDriver driver;
	

	@Test
	public void heading() throws IOException, InterruptedException
	{
		driver = setthings();
		log.info(driver.getTitle());
		
		driver.get(prop.getProperty("url"));
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
        

	}
}
