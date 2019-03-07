package calc;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.internal.Utils;

public class StringReverse {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}
    
	@AfterMethod
	public void ScreenShots()
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("D://image.png");
        Utils.copyFile(scrFile, destFile);
	}
	
	public void multipleWindows()
	{
		Set<String> windows= driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList(windows);
		driver.switchTo().window( tabs.get(1));
	}
	
	public void handlePopups()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
	}
	
	
}


