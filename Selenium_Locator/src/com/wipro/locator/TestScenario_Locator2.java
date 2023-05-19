package com.wipro.locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.helper;


public class TestScenario_Locator2 {
	WebDriver driver;

    @Test
    public void testName()
    {

        //1. Open Browser
        driver=helper.startBrowser("GC");
        driver.navigate().to("https://www.easemytrip.com/flights.html");
        driver.findElement(By.xpath("//div[@class='emt_nav']//a[normalize-space()='Holidays']")).click();

        //2. Click on Holiday link and Verify Text

      String expectedText="Turn Your Dream Holiday Into A Reality";

      WebElement holidayText=driver.findElement(By.xpath("//*[text()='Turn Your Dream Holiday Into A Reality']"));

      String actualText=holidayText.getText();

      Assert.assertEquals(actualText, expectedText);


    //3 Handling Popup

    Alert alert = driver.switchTo().alert();

    driver.switchTo().alert().accept();

    //4. Click on Hotel link and Verify Text


    String expectedText1="Same hotel, Cheapest price. Guaranteed!";



    driver.findElement(By.xpath("//a[@class='active_n']")).click();

    WebElement hotelText1=driver.findElement(By.linkText("Same hotel, Cheapest price. Guaranteed!"));

    String actualText1=holidayText.getText();

    Assert.assertEquals(actualText1, expectedText1);


    }

 


}
