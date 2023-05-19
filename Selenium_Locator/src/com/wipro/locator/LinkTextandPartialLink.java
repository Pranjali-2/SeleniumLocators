package com.wipro.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.helper;

public class LinkTextandPartialLink
{
WebDriver driver;

@Test
public void linkTest() throws Exception
{
	WebDriver driver=helper.startBrowser("GC");
	driver.get("https://auth.hollandandbarrett.com/u/login?");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("pranjali.v.bhosale@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Devshri4114");
	driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[3]/button")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Vitamins")).click();
	
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	int nolinks=links.size();
	System.out.println("No of links in holland & barrets application"+nolinks);
	
	
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		String str=links.get(i).getText();
		String str1="Vitamins & Supplements";
		
		if(str==str1)
		{
			driver.findElement(By.linkText("vitamins & supplements")).click();
			driver.findElement(By.xpath(str1)).click();
		}
	}
	
	
}
}
