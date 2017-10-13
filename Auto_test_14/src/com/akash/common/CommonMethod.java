package com.akash.common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethod 
{
	
	
	public WebDriver IntializeBrowser()
	{
		
		    System.setProperty("webdriver.firefox.marionette","D:\\jars_for_eclipse\\geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			String baseUrl = "http://demo.guru99.com/selenium/newtours/";
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			return driver;
	}
	
	
	public static void EnterTextInTextBox(WebDriver driver,String xpath,String textToEnter)
	{
	
		WebElement objElement =driver.findElement(By.xpath(xpath));
		objElement.clear();
		objElement.sendKeys(textToEnter);
	}

	public static void EnterTextInTextBox(WebDriver driver,By locator,String textToEnter)
	{
	
		WebElement objElement =driver.findElement(locator);
		objElement.clear();
		objElement.sendKeys(textToEnter);
	}
	public static void ClickOnButton(WebDriver driver,By locator)
	{
	
		WebElement objElement =driver.findElement(locator);
		objElement.click();
	}
	public static void SelectandClickOnOptionByText(WebDriver driver ,By locator,String textToEnter)
	{
//		WebElement objElement =driver.findElement(name);
//		objElement.click();
		  Select Passcount = new Select(driver.findElement(locator));
		  Passcount.selectByVisibleText(textToEnter);
		  //Passcount.
	}
}

