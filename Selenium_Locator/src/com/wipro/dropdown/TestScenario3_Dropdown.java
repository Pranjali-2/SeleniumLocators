package com.wipro.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utils.helper;

public class TestScenario3_Dropdown 
{
	WebDriver driver;
	@Test
	public void FBluanch() throws Exception
	{
		 driver=helper.startBrowser("GC");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
		 
		 WebElement day_dropdown=driver.findElement(By.id("day"));
		 Select day_dd=new Select(day_dropdown);
		 if(day_dropdown.isDisplayed()&&day_dropdown.isEnabled())
		 {
		 int size_day=day_dd.getOptions().size();
		 System.out.println("Size of day dropdown: "+size_day);
		 }
		 else
		 {
			 System.out.println("Dropdown is not displayed or enabled");
		 }
		 
		 WebElement year_dropdown=driver.findElement(By.id("year"));
		 Select year_dd=new Select(year_dropdown);
		 if(year_dropdown.isDisplayed()&&year_dropdown.isEnabled())
		 {
		 int size_year=year_dd.getOptions().size();
		 System.out.println("Size of year dropdown: "+size_year);
		 }
		 else
		 {
			 System.out.println("Dropdown is not displayed or enabled");
		 }
		 
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
