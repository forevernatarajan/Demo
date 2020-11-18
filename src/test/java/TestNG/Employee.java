package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {
	@Test
	private void test1()
	{
		Assert.assertTrue(true);
		System.out.println("test1");
	}
	
	@Test(retryAnalyzer=Hello.class)
	private void test2()
	{
		Assert.assertTrue(false);
		System.out.println("test2");
	}
	
	@Test
	private void test3()
	{
		Assert.assertTrue(false);
		System.out.println("test4");
	}

}
