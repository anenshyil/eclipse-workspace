package org.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.selenium.FunctionalLibrary.BaseClass;

public class HompageAfterlogin extends BaseClass
{
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[@title='Casual Dresses']")
	private WebElement casualDress;
	
	@FindBy(xpath="//span[text()='Greens Tech']")
	private WebElement greendTitle;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactUs;
	
	@FindBy(xpath="//span[@class='cat-name']")
	private WebElement casualDressTitle;
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	private WebElement sortProduct;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement printedDress;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceed1ProductAddPage;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement iconPlus;
	
	@FindBy(xpath="//ul[@class='address first_item item box']")
	private WebElement deliveryAddress;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed to checkout')])[2]")
	private WebElement proceed2CheckOut;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement searchField;
	
	@FindBy(xpath="(//span[text()='Add to cart'])[3]")
	private WebElement searchAddtoCart;
	
	public WebElement getSearchAddtoCart() {
		return searchAddtoCart;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	private	WebElement searchButton;
	
	public WebElement getSearchField() {
		return searchField;
	}


	public WebElement getProceed2CheckOut() {
		return proceed2CheckOut;
	}


	public WebElement getDeliveryAddress() {
		return deliveryAddress;
	}


	public WebElement getIconPlus() {
		return iconPlus;
	}





	public WebElement getProceed1ProductAddPage() {
		return proceed1ProductAddPage;
	}


	public WebElement getPrintedDress() {
		return printedDress;
	}


	public WebElement getSortProduct() {
		return sortProduct;
	}


	public WebElement getAddToCart() {
		return addToCart;
	}


	public WebElement getCasualDressTitle() {
		return casualDressTitle;
	}


	public WebElement getWomen() {
		return women;
	}


	public WebElement getCasualDress() {
		return casualDress;
	}


	public WebElement getGreendTitle() {
		return greendTitle;
	}


	public WebElement getContactUs() {
		return contactUs;
	}


	public HompageAfterlogin() {
		PageFactory.initElements(driver, this);
	}

}
