package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtUsername; 
	@FindBy(id="pass")
	private WebElement txtPass; 
	@FindBy(name="login")
	private WebElement clickLogin;
	
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getClickLogin() {
		return clickLogin;
	}
	
	
		

	
	
	

}
