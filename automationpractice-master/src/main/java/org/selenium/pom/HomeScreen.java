package org.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium.FunctionalLibrary.BaseClass;

public class HomeScreen extends BaseClass{
	
	@FindBy(className="login")
	private WebElement signInButton;
	
	@FindBy(id="email_create")
	private WebElement createAccountinput;
	
	public WebElement getCreateAccountinput() {
		return createAccountinput;
	}
	public WebElement getCreateAccButton() {
		return createAccButton;
	}
	@FindBy(id="SubmitCreate")
	private WebElement createAccButton;

	public WebElement getSignInButton() {
		return signInButton;
	}
	public HomeScreen() {
		PageFactory.initElements(driver, this);
	}
}