package aug_test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Autotest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.firefox.marionette","D:\\jars_for_eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		driver.get(baseUrl);
		
		//User  loggin 
		driver.findElement(By.name("userName")).sendKeys("Test");
		driver.findElement(By.name("password")).sendKeys("Test");
		driver.findElement(By.name("submit")).click();
		driver.manage().window().maximize();//window to max size.		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//User routed for booking for one way.
		driver.findElement(By.xpath("//a[@href='reservation.php']")).click();		
	    driver.findElement(By.xpath("//input[@value='oneway']")).click();
	    
	    //User requirement insert
	    Select Passcount = new Select(driver.findElement(By.name("passCount")));
	    Passcount.selectByVisibleText("3");
	    Select fromPort = new Select(driver.findElement(By.name("fromPort")));
	    fromPort.selectByVisibleText("New York");
	    Select frommonth = new Select (driver.findElement(By.name("fromMonth")));
	    frommonth.selectByVisibleText("September");
	    Select fromDay = (new Select (driver.findElement(By.name("fromDay"))));//.selectByVisibleText("30");
	    fromDay.selectByVisibleText("30");
	    Select toPort = new Select(driver.findElement(By.name("toPort")));
	    toPort.selectByVisibleText("San Francisco");
	    driver.findElement(By.xpath("//input[@VALUE='Business']")).click();
	    //Select Airline
	    Select airline = new Select(driver.findElement(By.name("airline")));
	    airline.selectByVisibleText("Unified Airlines");
	    
	    //User request Submision
	    driver.findElement(By.name("findFlights")).click();
	    
	    
	    //Page Close
	    driver.close();
		
	}
}
