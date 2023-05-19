package com.wipro.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.helper;

public class TestScenario3_Locator {
	WebDriver driver;
	 
	@Test
	public void ageCalculation() throws InterruptedException
	{
	 
	String expectedTitle = "Free Online Math Calculator and Converter";
	 
	// 1. Open Url
	 
	 
	driver=helper.startBrowser("gc");
	driver.navigate().to("https://www.easycalculation.com/index.php");
	driver.manage().window().maximize();
	 
	 
	// 2. Verify Title
	String currentTitle = driver.getTitle();
	Assert.assertEquals(currentTitle, expectedTitle);
	 
	driver.findElement(By.xpath("//a[@href='//www.easycalculation.com/date-day/age-calculator.php']")).click();
	 
	Thread.sleep(5000);
	 
	 
	 
	List<WebElement> links=driver.findElements(By.tagName("a"));
	 
	System.out.println(""+links.size());
	 
	Thread.sleep(5000);
	 
	for (int i = 0; i < 10; i++)
	{
	 
	System.out.println(links.get(i).getText());
	}
	 
	List<WebElement> img=driver.findElements(By.xpath("//img"));
	 
	System.out.println(""+img.size());
	 
	Thread.sleep(5000);
	 
	for (int j = 0; j < 10; j++)
	{
	 
	System.out.println(img.get(j).getText());
	 
	}
	 
	 
	 
	driver.findElement(By.id("i21")).sendKeys("15");
	driver.findElement(By.id("i22")).sendKeys("08");
	driver.findElement(By.id("i23")).sendKeys("1947");
	 
	 
	 
	driver.findElement(By.name("but")).click();
	 
	String age="75 years, 9 months, and 3 days";
	String ageinDays="27670 days since your birth";
	String ageinHours="664080 hours since your birth";
	String ageinMinute="";
	 
	System.out.println("Your age is "+driver.findElement(By.xpath("//input[@id='r1']")).getAttribute("value"));
	 
	System.out.println("Your age in Days "+driver.findElement(By.xpath("//input[@id='r4']")).getAttribute("value"));
	System.out.println("Your age in Hours "+driver.findElement(By.xpath("//input[@id='r3']")).getAttribute("value"));
	System.out.println("Your age in Hours "+driver.findElement(By.xpath("//input[@id='r2']")).getAttribute("value"));
	 
	 
	driver.findElement(By.xpath("//input[@value='Reset']")).click();
	 
	 
	 
	}


}
