package Tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utilityclass {
	//1. Default Constructor with PageFactory
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);// To avoid stale element reference exception
	}
	
	//2. FindElement and store element as private
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(id="loginbutton")
	private WebElement btn;

	
	// Getters and Setters
	
	public WebElement getTxtUser() {
		return txtUser;
		
	}

	public void setTxtUser(WebElement txtUser) {
		this.txtUser = txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtn() {
		return btn;
	}

	public void setBtn(WebElement btn) {
		this.btn = btn;
	}
	
	

}
