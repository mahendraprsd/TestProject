package calc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreatingDependencies
{
    WebDriver driver;
   
    @BeforeClass
    public void startBrowser()
    {
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    	driver = new ChromeDriver();
    	System.out.println("======Browser started======");
    }
    
    @Test
	public void startApp()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("auth/login"));
		System.out.println("Application launced");
		
		
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		boolean status = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("login successful");
	}
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='txtUsername']")).isDisplayed());
		System.out.println("Logout done");
		
	}
	
	@AfterClass
	public void closeApp()
	{
		driver.quit();
		System.out.println("=======Browser closed======");
	}

}
