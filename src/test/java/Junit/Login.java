package Junit;

import java.awt.AWTException;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public static void main(String[] args) throws AWTException
	{
		loadDriver();
		launchUrl("https://www.flipkart.com/account/login");
		
		FlipkartPom fp=new FlipkartPom();
		insert(fp.getUserName(),"forevernatarajan@gmail.com");
		insert(fp.getPassword(),"THATSMYSECRET1988");
		click(fp.getLogin());
		
		
		
		
		
	}


}