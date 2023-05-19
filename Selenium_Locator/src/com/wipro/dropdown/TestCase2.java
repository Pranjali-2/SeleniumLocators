package com.wipro.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.helper;

public class TestCase2
{
	WebDriver driver;
@Test
public void FBlaunch() throws Exception
{
	 driver=helper.startBrowser("GC");
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
	 
	 WebElement month_dropdown=driver.findElement(By.id("month"));
	 Select month_dd=new Select(month_dropdown);
	 
	 List<WebElement> month_list=month_dd.getOptions();
	 int total_month=month_list.size();
	 System.out.println("Total months count in list:"+total_month);
	 
	 for(WebElement wb:month_list)
	 {
		 String month_name=wb.getText();
		 System.out.println("Months Names are:"+month_name);
	 }
	 driver.quit();
}
}
