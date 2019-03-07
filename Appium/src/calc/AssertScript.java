package calc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertScript {
	@Test
	public void assert1()
	{
		Assert.assertEquals("Mahi","jackie");
	}

	@Test
	public void assert2()
	{
		System.out.println("test 2 started");
		Assert.assertEquals("Mahi","jackie","Actual and expected doesnot match");
		System.out.println("test 2 completed");
	}
	
	@Test
	public void assert3()
	{
		System.out.println("test 3 started");
		Assert.assertEquals("Mahi","Mahi","Actual and expected doesnot match please raise a bug");
		System.out.println("test 3 completed");
	}
}
