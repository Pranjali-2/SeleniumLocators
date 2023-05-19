package com.wipro.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.helper;

public class FacebookDD 
	{
	WebDriver driver;
	@Test
	public void FBluanch() throws Exception
	{
		 driver=helper.startBrowser("GC");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
		 
		 WebElement month_dropdown=driver.findElement(By.id("month"));
		 Select month_dd=new Select(month_dropdown);
		 
		 month_dd.selectByIndex(3);
		 Thread.sleep(10000);
		 month_dd.selectByValue("9");
		 Thread.sleep(10000);
		 month_dd.selectByVisibleText("Jul");
		 Thread.sleep(20000);
	}
}
