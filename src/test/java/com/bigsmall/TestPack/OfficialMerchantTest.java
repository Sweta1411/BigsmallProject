package com.bigsmall.TestPack;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bigsmall.PageObjects.OfficialMerchant;
import com.bigsmall.reusableClass.BaseClass;

public class OfficialMerchantTest extends BaseClass {


	public static Logger log=Logger.getLogger(BaseClass.class.getName());

	@Test
	public void merchen() throws IOException, InterruptedException
	{
		driver=setthings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
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


	}


}
