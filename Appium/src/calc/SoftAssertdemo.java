package calc;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertdemo
{
	
	@Test(priority=0)
	public void softAssert1()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 started");
		assertion.assertEquals(12,13);
		System.out.println("Test 1 completes");
		assertion.assertAll();
				
	}
	
	@Test(priority=1)
	public void hardAssert1()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(12,13);
		System.out.println("Test 2 completes");
	}

}
