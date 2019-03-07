package calc;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

  
	   @Test
	   public void verifyPageTitle()
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com");
	       //Actual value
	       String mytitle = driver.getTitle();
	       System.out.println("Title is "+ mytitle);
	       //Expected value
	       //String expectedtitle = "Google";
	       //Assert.assertEquals(mytitle, expectedtitle);
	       Assert.assertTrue(mytitle.contains("gle"));
	       System.out.println("Title verfied");
	       driver.quit();
	   
	  }
	   
	   @Test
	   public void primeNumber() 
	   {
		   boolean isPrime = true;
		   int i,num=25;
		   for(i=2;i<num;i++)
		   {
			   if(num%i==0)
			   {
				   isPrime = false;
				   break;
			   }
			   if(isPrime)
			   {
				   System.out.println(num +"is a Prime Number");
			   }
			   else
				   System.out.println(num +" is not a Prime Number");
		   }
		   
		   
	   }
   
}
