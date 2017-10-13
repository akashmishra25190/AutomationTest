package aug_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.akash.Lib.ObjectRepository;
import com.akash.bpcLib.BPC_HomePage;
import com.akash.common.CommonMethod;

public class TC_01_Login 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CommonMethod objcom =new CommonMethod();
		WebDriver driver=objcom.IntializeBrowser();
		
		
		
		BPC_HomePage.LogInToTheApplication(driver);
		
		
		CommonMethod.ClickOnButton(driver, ObjectRepository.btnReservation);
		CommonMethod.ClickOnButton(driver, ObjectRepository.btnOneWay);
	//	CommonMethod.SelectandClickoption(driver, ObjectRepository.Listpassanger,"4");		
		CommonMethod.SelectandClickOnOptionByText(driver, ObjectRepository.Listpassanger, "2");
		CommonMethod.SelectandClickOnOptionByText(driver, ObjectRepository.Listfrom, "London");
		CommonMethod.SelectandClickOnOptionByText(driver, ObjectRepository.DateonMonth, "September");
		CommonMethod.SelectandClickOnOptionByText(driver, ObjectRepository.DateonDay, "30");
		CommonMethod.SelectandClickOnOptionByText(driver, ObjectRepository.Listto, "San Francisco");
		CommonMethod.ClickOnButton(driver, ObjectRepository.SeatClass);
		CommonMethod.SelectandClickOnOptionByText(driver, ObjectRepository.Airlinecompany, "Unified Airlines");
		CommonMethod.ClickOnButton(driver, ObjectRepository.sumit);
		
	    driver.close();
		
	}
}
