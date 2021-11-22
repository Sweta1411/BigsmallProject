package com.bigsmall.testData;

import org.openqa.selenium.By;

public class CartUI {
	
	public static By product=By.xpath("//div[@class='grid-product__meta']");
	public static By wish=By.xpath("//button[@aria-label='Add to Wishlist']");
	public static By ACart=By.xpath("//button[@name='add']");
	public static By check=By.xpath("//button[@name='checkout']/span");
	public static By text=By.xpath("//p[@class='wa-optin-widget-title']");

}
