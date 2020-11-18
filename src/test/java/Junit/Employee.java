package Junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Employee {
	@Test
	public void tc1()
	{
		System.out.println("Test1");
		Assert.assertTrue(true);
	}
	
	@Ignore
	@Test
	public void tc4()
	{
		System.out.println("Test4");
	}
	
	@Test
	public void tc3()
	{
		System.out.println("Test3");
	}
	
	@Ignore
	@Test
	public void tc2()
	{
		System.out.println("Test4");
	}
	
	
	
}
