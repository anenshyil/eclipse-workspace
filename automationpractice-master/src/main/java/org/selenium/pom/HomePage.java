package org.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.selenium.FunctionalLibrary.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement logo;
	
	public WebElement getLogo() {
		return logo;
	}



	public WebElement getSiginButton() {
		return siginButton;
	}



	public WebElement getPhoneNumber() {
		return phoneNumber;
	}



	@FindBy(xpath="//a[@class='login']")
	private WebElement siginButton;
	
	@FindBy(xpath="//strong[text()='0123-456-789']")
	private WebElement phoneNumber;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
