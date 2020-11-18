package Junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPom extends BaseClass {
	
	public FlipkartPom()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")
	private WebElement userName;

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input")
	private WebElement password;

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	

}
