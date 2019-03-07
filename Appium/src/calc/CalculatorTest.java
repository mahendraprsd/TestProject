package calc;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
	
	public	AppiumDriver<MobileElement> driver;
	
	@Test
	public void launchCalculator() throws MalformedURLException 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
	
		//Device configuration
		capabilities.setCapability("deviceName","lenovo vibe");
		capabilities.setCapability("udid", "f02be47a");
		capabilities.setCapability("platforName", "Android");
		capabilities.setCapability("platformVersion","5.1.1");
		
		
		
		
		//Application Information
		capabilities.setCapability("appPackage", "com.wingtech.calc");
		capabilities.setCapability("appActivity", "com.wingtech.calc.Calculator");
		
		
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}
	


}


