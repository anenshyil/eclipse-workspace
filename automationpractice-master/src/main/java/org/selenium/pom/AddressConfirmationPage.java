package org.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.selenium.FunctionalLibrary.BaseClass;

public class AddressConfirmationPage extends BaseClass {
	
	@FindBy(xpath="//select[@id='id_address_delivery']")
	private WebElement mySameAddr;
	
	public WebElement getMySameAddr() {
		return mySameAddr;
	}

	public WebElement getCheckboxDeliverySameAddr() {
		return checkboxDeliverySameAddr;
	}

	public WebElement getAggreeTerms() {
		return aggreeTerms;
	}

	@FindBy(xpath="//input[@id='addressesAreEquals']")
	private WebElement checkboxDeliverySameAddr;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement aggreeTerms;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirmOrder;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement payBYWire;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	

	
	
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getPayBYWire() {
		return payBYWire;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public AddressConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	


}
