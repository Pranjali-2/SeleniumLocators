package com.wipro.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.helper;

public class TestScenario4_Dropdown 
{
	

public class EasyCalculationMethod {

	WebDriver driver;

	@Test
	public void FBLunchMethod() throws InterruptedException {

	driver = helper.startBrowser("Google Chrome");
	driver.get("https://www.easycalculation.com/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[text()='Sign in']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(2000);
	WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
	country.click();
	Thread.sleep(2000);
	Select country1 = new Select(country);
	int countsize = country1.getOptions().size();

	System.out.println(countsize);
	Thread.sleep(2000);
	String text = country.getText();

	System.out.println(text);


	String title=driver.getTitle();

	System.out.println(title);

	String expectedText="Create your HIOX Account";

	try {
	Assert.assertEquals(title, expectedText);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
}



