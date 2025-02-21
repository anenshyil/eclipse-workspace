package org.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.selenium.FunctionalLibrary.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	@FindBy(xpath="//h3[text()='Create an account']")
	private WebElement createAccount;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signInButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
