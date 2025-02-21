package org.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium.FunctionalLibrary.BaseClass;

public class SignupPage extends BaseClass {
	
	@FindBy(id="id_gender1")
	private WebElement mr;
	
	@FindBy(id="customer_firstname")
	private WebElement firstName;
	
	@FindBy(id="customer_lastname")
	private WebElement lastName;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="days")
	private WebElement days;
	
	@FindBy(id="months")
	private WebElement months;
	
	@FindBy(id="years")
	private WebElement year;
	
	@FindBy(id="newsletter")
	private WebElement checkNewsletter;
	
	@FindBy(id="optin")
	private WebElement checkOthrOpt;
	
	@FindBy(id="company")
	private WebElement company;
	
	@FindBy(id="address1")
	private WebElement address1;
	
	@FindBy(id="address2")
	private WebElement address2;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement stateDrop;
	
	@FindBy(id="postcode")
	private WebElement postalCode;
	
	@FindBy(id="id_country")
	private WebElement countryDrop;
	
	@FindBy(id="other")
	private WebElement other;
	
	public WebElement getMr() {
		return mr;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonths() {
		return months;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCheckNewsletter() {
		return checkNewsletter;
	}

	public WebElement getCheckOthrOpt() {
		return checkOthrOpt;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getStateDrop() {
		return stateDrop;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCountryDrop() {
		return countryDrop;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAlias() {
		return alias;
	}

	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(id="phone_mobile")
	private WebElement mobile;
	
	@FindBy(id="alias")
	private WebElement alias;

	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
}
