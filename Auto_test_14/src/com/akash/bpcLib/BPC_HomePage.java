package com.akash.bpcLib;

import org.openqa.selenium.WebDriver;

import com.akash.Lib.ObjectRepository;
import com.akash.common.CommonMethod;

public class BPC_HomePage {

	
	public static void LogInToTheApplication(WebDriver driver)
	{
		
		
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.txtUserName, "Test");
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.txtUserPassword, "Test");
		CommonMethod.ClickOnButton(driver, ObjectRepository.btnSubmit);
		
	}
	public static void LogInToTheApplication(WebDriver driver,String txtUserName,String txtPassword)
	{
		
		
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.txtUserName, txtUserName);
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.txtUserPassword, txtPassword);
		CommonMethod.ClickOnButton(driver, ObjectRepository.btnSubmit);
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.Listpassanger,"4");
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.Listfrom,"New York");
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.DateonMonth,"September");
		CommonMethod.EnterTextInTextBox(driver, ObjectRepository.DateonDay,"fromDay");
		
		
	}
	
}
