package com.akash.Lib;

import org.openqa.selenium.By;

public class ObjectRepository 
{
	
	
	public static By txtUserName =By.name("userName");
	public static By txtUserPassword =By.name("password");
	public static By btnSubmit =By.name("submit");
	public static By btnReservation = By.xpath("//a[@href='reservation.php']");
	public static By btnOneWay = By.xpath("//input[@value='oneway']");
	public static By Listpassanger =By.name("passCount");	
	public static By Listfrom = By.name("fromPort");
	public static By DateonMonth	= By.name("fromMonth");
	public static By DateonDay = By.name("fromDay");
	public static By Listto = By.name("toPort");
	public static By SeatClass = By.xpath("//input[@VALUE='Business']");
	public static By Airlinecompany = By.name("airline");
	public static By sumit = By.name("findFlights");
	

}
