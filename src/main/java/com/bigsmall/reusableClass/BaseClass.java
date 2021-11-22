package com.bigsmall.reusableClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass{


	public static WebDriver driver;
	
	//creating properties folder
	public Properties prop;
	
	@SuppressWarnings("deprecation")
	public WebDriver setthings() throws IOException
	{

		prop=new Properties();
		
		String pathin=System.getProperty("user.dir");

		//Taking names from file
		FileInputStream input=new FileInputStream(pathin+"\\src\\main\\resources\\config.properties");

		//loading file
		prop.load(input);

		//getting Browser Name
		String browsername=prop.getProperty("browser");
		
		String pathi=prop.getProperty("path");

		//getting url
		
		//printing browser name
		System.out.println(browsername);

		//invoking Browser
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", pathin+pathi);
			driver=new ChromeDriver();
		}
		
		else
		{
			
		}
		

		driver.manage().window().maximize();
		
		return driver;		
	}
}
