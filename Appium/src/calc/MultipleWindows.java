package calc;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows 
{
    @Test
	public  void multipleTabs() throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		String parent = driver.getWindowHandle();
		Thread.sleep(5000);
		driver.switchTo().window((parent));
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
		Thread.sleep(5000);
		driver.switchTo().window((parent));
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Thread.sleep(5000);
		driver.switchTo().window((parent));
		Thread.sleep(5000);
		Set<String>windows = driver.getWindowHandles();
		ArrayList<String>tabs = new ArrayList(windows);
		driver.switchTo().window(tabs.get(3));
		System.out.println("Second tab is successfully opened");
		Thread.sleep(5000);
		driver.quit();
		
	}


}
