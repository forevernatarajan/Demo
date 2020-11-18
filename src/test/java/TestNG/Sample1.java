package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	@Test
	private void test1()
	{
		System.out.println(Thread.currentThread().getId());
		Assert.assertTrue(false);
		System.out.println("Test1");
		Assert.assertTrue(true);
		System.out.println("End");
	}
	
	@Test(invocationCount=5)
	private void test2()
	{
		System.out.println(Thread.currentThread().getId());
		SoftAssert s=new SoftAssert();
		s.assertTrue(true);
		System.out.println("test4");
		s.assertEquals(true
				, false);
		System.out.println("End4");
		s.assertAll();
		
	}

	@Test
	private void test3()
	{
		//System.out.println(Thread.currentThread().getId());
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(false, false);
		System.out.println("test4");
		s.assertEquals(true, false);
		System.out.println("End4");
		s.assertAll();
	}
	
}
