package Junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {
	@Test
	public void tc11()
	{
		System.out.println("Test11");
		Assert.assertTrue(true);
	}
	
	@Ignore
	@Test
	public void tc14()
	{
		Assert.assertTrue(false);
		System.out.println("Test14");
	}
	
	@Test
	public void tc13()
	{
		Assert.assertTrue(true);
		System.out.println("Test13");
	}

}
