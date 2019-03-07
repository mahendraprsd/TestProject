package calc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplicaton
{

	@Test
	public void startApp()
	{
		Assert.assertEquals(32,42);
		System.out.println("Strating the app");
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		System.out.println("login to the app");
	}
	
	@Test(dependsOnMethods="{loginApp,startApp}")
	public void logoutApp()
	{
		System.out.println("logout the app");
	}
	

}
