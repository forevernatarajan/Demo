package TestNG;

import java.awt.AWTException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.LoginPage;

public class Parameter extends BaseClass{
	@Parameters({"username","password"})
	@Test
	private void test1(String s1, String s2) throws AWTException
	{
		loadDriver();
		launchUrl("https://www.facebook.com");
		LoginPage l=new LoginPage();
		insert(l.getTxtUser(),s1);
		insert(l.getTxtPass(),s2);
		click(l.getBtn());
	}
	

}
