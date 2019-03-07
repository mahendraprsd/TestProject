package calc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAlert 
{
	@Test
	public void alert() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");			
 	    driver.findElement(By.name("cusid")).sendKeys("53920");					
	    driver.findElement(By.name("submit")).submit();
		Alert pop = driver.switchTo().alert();
		pop.accept();
	    System.out.println("Alert accepted");
	}   

}
