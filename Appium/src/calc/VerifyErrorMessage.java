package calc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.gmail.com");
	     driver.findElement(By.xpath(""));
	}
	

}
