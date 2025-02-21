package org.selenium.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.selenium.FunctionalLibrary.BaseClass;
import org.selenium.pom.HomeScreen;
import org.selenium.pom.SignupPage;

import org.selenium.pom.AddressConfirmationPage;
import org.selenium.pom.HomePage;
import org.selenium.pom.HompageAfterlogin;
import org.selenium.pom.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class StepDefinition extends BaseClass{
	
	@Given("^User clicks Sign-in button from Automation Home Page$")
	public void user_clicks_Sign_in_button_from_Automation_Home_Page() throws Throwable {
		HomeScreen hs=new HomeScreen();
		isElementDisplayed(hs.getSignInButton());
		elementClick(hs.getSignInButton());
	}

	@Then("^User checks Create an Account is present on page$")
	public void user_checks_Create_an_Account_is_present_on_page() throws Throwable {
		HomeScreen hs=new HomeScreen();
		
		
	
	}

	@When("^User gives email id in Create an Create an account buttom$")
	public void user_gives_email_id_in_Create_an_Create_an_account_buttom() throws Throwable {
		HomeScreen hs=new HomeScreen();
		isElementDisplayed(hs.getCreateAccountinput());
		sendKeysToElement(hs.getCreateAccountinput(),elementFromWorkbook("Email",1));
		
	}

	@Then("^Clicks create an account button$")
	public void clicks_create_an_account_button() throws Throwable {
		HomeScreen hs=new HomeScreen();
		elementClick(hs.getCreateAccButton());
	}
	

	@When("^User gives \"([^\"]*)\" in Create an account buttom$")
	public void user_gives_in_Create_an_account_buttom(String arg1) throws Throwable {
		HomeScreen hs=new HomeScreen();
		isElementDisplayed(hs.getCreateAccountinput());
		sendKeysToElement(hs.getCreateAccountinput(),elementFromWorkbook(arg1,1));
		
	   
	}

	@When("^User selects the radio button for \\(mr/mrs\\)$")
	public void user_selects_the_radio_button_for_mr_mrs() throws Throwable {
		 SignupPage sp=new SignupPage();
		  elementClick(sp.getMr());
	    
	    
	}

	@When("^User gives \"([^\"]*)\" and \"([^\"]*)\" of the customer \"([^\"]*)\"$")
	public void user_gives_and_of_the_customer(String arg1, String arg2, int arg3) throws Throwable {
	    SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getFirstName(), elementFromWorkbook(arg1,arg3) );
	    
	    sendKeysToElement(sp.getLastName()	, elementFromWorkbook(arg2,arg3));
	   
	    
	}

	@When("^User gives \"([^\"]*)\" and gives a \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_gives_and_gives_a_for_customer(String arg1, String arg2, int arg3) throws Throwable {
		
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getPassword(), elementFromWorkbook(arg1,arg3) );
	    
	    sendKeysToElement(sp.getCompany(), elementFromWorkbook(arg2,arg3));
	    
	}

	@When("^User gives DOB  \"([^\"]*)\" & \"([^\"]*)\" & \"([^\"]*)\" for customer$")
	public void user_gives_DOB_for_customer(String arg1, String arg2, String arg3) throws Throwable {
		
		SignupPage sp=new SignupPage();
		
		dropDownSelect(sp.getDays(), "Value", arg1);
		dropDownSelect(sp.getMonths(), "Value", arg2);
		dropDownSelect(sp.getYear(), "Value", arg3);
		
		
	    
	}

	@When("^User gives checks on NewsLetter and Options checkbox$")
	public void user_gives_checks_on_NewsLetter_and_Options_checkbox() throws Throwable {
		
		SignupPage sp=new SignupPage();
		elementClick(sp.getCheckNewsletter());
		elementClick(sp.getCheckOthrOpt());
	    
	}

	@When("^User gives company name \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_gives_company_name_for_customer(String arg1, int arg2) throws Throwable {
	    
		SignupPage sp=new SignupPage();
		
		sendKeysToElement(sp.getCompany(), elementFromWorkbook(arg1, arg2));
	}

	@When("^User gives address(\\d+) as \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_gives_address_as_for_customer(String arg1, String arg2, int arg3) throws Throwable {
		
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getAddress1(), elementFromWorkbook(arg2,arg3) );
	    
	    sendKeysToElement(sp.getAddress2()	, elementFromWorkbook(arg2,arg3));
	    
	    
	}

	@When("^User gives City name \"([^\"]*)\" for Customer \"([^\"]*)\"$")
	public void user_gives_City_name_for_Customer(String arg1, int arg2) throws Throwable {
		
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getCity(), elementFromWorkbook(arg1,arg2) );
	    
	    
	}

	@When("^User chooses State name State \"([^\"]*)\" for Customer$")
	public void user_chooses_State_name_State_for_Customer(String arg1) throws Throwable {
		
		SignupPage sp=new SignupPage();
		
		dropDownSelect(sp.getStateDrop(), "value", arg1);
	    
	    
	}

	@When("^User chooses \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_chooses_for_customer(String arg1, int arg2) throws Throwable {
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getPostalCode(), elementFromWorkbook(arg1,arg2) );
	    
	}

	@When("^User chooses Country \"([^\"]*)\" for country$")
	public void user_chooses_Country_for_country(String arg1) throws Throwable {
	    
		SignupPage sp=new SignupPage();
	    dropDownSelect(sp.getCountryDrop(), "value"	, arg1);
	    
	}

	@When("^User gives \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_gives_for_customer(String arg1, int arg2) throws Throwable {
		
		SignupPage sp=new SignupPage();
		
	    
	    sendKeysToElement(sp.getOther(), elementFromWorkbook(arg1,arg2) );
	    

	    
	    
	}

	@When("^user gives \"([^\"]*)\" and \"([^\"]*)\"  number for customer \"([^\"]*)\"$")
	public void user_gives_and_number_for_customer(String arg1, String arg2, int arg3) throws Throwable {
		
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getPhone(), elementFromWorkbook(arg1,arg3) );
	    
	    sendKeysToElement(sp.getMobile(), elementFromWorkbook(arg2,arg3));
	    
	    
	}

	@When("^user gives \"([^\"]*)\" address for customer \"([^\"]*)\"$")
	public void user_gives_address_for_customer(String arg1, int arg2) throws Throwable {
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getAlias(), elementFromWorkbook(arg1,arg2) );
	Thread.sleep(10000);
	    
	}

	@When("^User gives address Line as \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_gives_address_Line_as_for_customer(String arg1, int arg2) throws Throwable {
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getAddress1(), elementFromWorkbook(arg1,arg2) );
	    
	}

	@When("^User gives address Line Additional as \"([^\"]*)\" for customer \"([^\"]*)\"$")
	public void user_gives_address_Line_Additional_as_for_customer(String arg1, int arg2) throws Throwable {
		SignupPage sp=new SignupPage();
	    
	    sendKeysToElement(sp.getAddress2(), elementFromWorkbook(arg1,arg2) );
	}
	
	@Given("^User launches the browser and hit the Automation Practice Application$")
	public void user_launches_the_browser_and_hit_the_Automation_Practice_Application() throws Throwable {
	    //driverLaunch("chrome");
	    //launchUrl("http://automationpractice.com/index.php");
	    
	}

	@Then("^User Check Whether phone number is available on the Home Page$")
	public void user_Check_Whether_phone_number_is_available_on_the_Home_Page() throws Throwable {
	    HomePage hp=new HomePage();	    
	   isElementDisplayed(hp.getPhoneNumber());
	    
	    
	}

	@Then("^User Checks Logo is available on the Home Page$")
	public void user_Checks_Logo_is_available_on_the_Home_Page() throws Throwable {
	    	HomePage hp=new HomePage();
		   isElementDisplayed(hp.getLogo());
	}

	@When("^User Clicks on signin button in top of the Home Page$")
	public void user_Clicks_on_signin_button_in_top_of_the_Home_Page() throws Throwable {
	    
		HomePage hl=new HomePage();
		elementClick(hl.getSiginButton());
	}

	@Then("^User Checks Create an account is available$")
	public void user_Checks_Create_an_account_is_available() throws Throwable {
	    
	    LoginPage lp=new LoginPage();
	    isElementDisplayed(lp.getCreateAccount());
	}

	@Then("^User gives the Username in the Sign-in Page$")
	public void user_gives_the_Username_in_the_Sign_in_Page() throws Throwable {
		LoginPage lp=new LoginPage();
		sendKeysToElement(lp.getEmail(),mySqlRead("CustomerID","aabcddef@gmail.com"));
	    
	}

	@Then("^User gives the password in the Sign-in Page$")
	public void user_gives_the_password_in_the_Sign_in_Page() throws Throwable {
	    
	    LoginPage lp=new LoginPage();
	    sendKeysToElement(lp.getPassword(),mySqlRead("CustomerPwd","password123"));
	}

	@Then("^user click the sign-in button in Home Page$")
	public void user_click_the_sign_in_button_in_Home_Page() throws Throwable {
	    LoginPage lp=new LoginPage();
	    elementClick(lp.getSignInButton());
	    
	}

//************************************Senerio2**************************************************//
	
	@Given("^User checks User name is correct$")
	public void user_checks_User_name_is_correct() throws Throwable {
	    HompageAfterlogin ha=new HompageAfterlogin();
	   isElementDisplayed(ha.getGreendTitle());
	}

	@Given("^User checks contact us is present$")
	public void user_checks_contact_us_is_present() throws Throwable {
	    HompageAfterlogin ha=new HompageAfterlogin();
	    isElementDisplayed(ha.getContactUs());
	    		
	  
	}

	@Then("^User Clicks then women menu in the Order Page$")
	public void user_Clicks_then_women_menu_in_the_Order_Page() throws Throwable {
	    
	  HompageAfterlogin ha=new HompageAfterlogin();
	  mouseHover(ha.getWomen());
	}

	@When("^User Clicks Casual dress sub menu in Order Page$")
	public void user_Clicks_Casual_dress_sub_menu_in_Order_Page() throws Throwable {
		 HompageAfterlogin ha=new HompageAfterlogin();
	
		  mouseHoverClick(ha.getCasualDress());
	  
	}

	@Then("^User Sorts in the list of results in ascending order$")
	public void user_Sorts_in_the_list_of_results_in_ascending_order() throws Throwable {
	    HompageAfterlogin ha=new HompageAfterlogin();
	    dropDownSelect(ha.getSortProduct(), "value", "price:asc");
	}

	@Then("^User checks that Casual dress is present in the Order Page$")
	public void user_checks_that_Casual_dress_is_present_in_the_Order_Page() throws Throwable {
		 HompageAfterlogin ha=new HompageAfterlogin();
		    isElementDisplayed((ha.getCasualDressTitle()));
	  
	}

	@Then("^User clicks the Add to cart opton over the selected product$")
	public void user_clicks_the_Add_to_cart_opton_over_the_selected_product() throws Throwable {
	    
	  HompageAfterlogin ha=new HompageAfterlogin();
	  //scrollIt(ha.getPrintedDress());
	  mouseHover(ha.getPrintedDress());
	  elementClick(ha.getAddToCart());
	}
//******************************************Scenerio 3*****************************//
	@Given("^User clicks Proceed to payment to continue order placement$")
	public void user_clicks_Proceed_to_payment_to_continue_order_placement() throws Throwable {
	    
	    HompageAfterlogin ha=new HompageAfterlogin();
	    elementClick(ha.getProceed1ProductAddPage());
	}

	@Then("^User clicks on Plus sign to add one more quantity$")
	public void user_clicks_on_Plus_sign_to_add_one_more_quantity() throws Throwable {
	    HompageAfterlogin ha=new HompageAfterlogin();
	    
	    elementClick(ha.getIconPlus());
	    
	}

	@Then("^User checks Address is displayed in the order confirmation Page$")
	public void user_checks_Address_is_displayed_in_the_order_confirmation_Page() throws Throwable {
	    
	    HompageAfterlogin ha=new HompageAfterlogin();
	    
	    isElementDisplayed(ha.getDeliveryAddress());
	}

	@Then("^User clicks Proceed to payment to continue order placements$")
	public void user_clicks_Proceed_to_payment_to_continue_order_placements() throws Throwable {
	    
		HompageAfterlogin ha=new HompageAfterlogin();	    
	    elementClick(ha.getProceed2CheckOut());
	    
	}


	@Given("^User selects my same address from drop down$")
	public void user_selects_my_same_address_from_drop_down() throws Throwable {
		AddressConfirmationPage ap=new AddressConfirmationPage();
		
		dropDownSelect(ap.getMySameAddr(),"value","277858");
		
	}
	@Then("^User clicks checkbox to agree terms and conditions$")
	public void user_clicks_checkbox_to_agree_terms_and_conditions() throws Throwable {
		AddressConfirmationPage ap=new AddressConfirmationPage();
		elementClick(ap.getAggreeTerms());
	}

//*************************************** secenrio 4************************//
	
	@Given("^User clicks Pay by wire option for bank payment page$")
	public void user_clicks_Pay_by_wire_option_for_bank_payment_page() throws Throwable {
		AddressConfirmationPage af=new AddressConfirmationPage();
		elementClick(af.getPayBYWire());
	}

	@When("^User clicks Proceed to confirm my order$")
	public void user_clicks_Proceed_to_confirm_my_order() throws Throwable {
		AddressConfirmationPage af=new AddressConfirmationPage();
		elementClick(af.getConfirmOrder());
	}
	
	@Then("^User logout from the application$")
	public void user_logout_from_the_application() throws Throwable {
		AddressConfirmationPage af= new AddressConfirmationPage();
		elementClick(af.getLogout());
	}


//*********************************************Scenerion by search field**********************//

@When("^User gives required option in search field$")
public void user_gives_required_option_in_search_field() throws Throwable {
	HompageAfterlogin hp=new HompageAfterlogin();
	sendKeysToElement(hp.getSearchField(),"DRESSES");
}

@When("^User clicks search in Order Page$")
public void user_clicks_search_in_Order_Page() throws Throwable {
	HompageAfterlogin hp=new HompageAfterlogin();
	
	elementClick(hp.getSearchButton());
}

//*************************************************Senario for new Addto cart************//
@Then("^User clicks the Add to cart opton over the selected required product$")
public void user_clicks_the_Add_to_cart_opton_over_the_selected_required_product() throws Throwable {
	
	HompageAfterlogin hp=new HompageAfterlogin();
	mouseHover(hp.getPrintedDress());
	elementClick(hp.getSearchAddtoCart());
	
}
//*************************************************Senerio Outline***********************//
	
	@When("^User gives \"([^\"]*)\" in search field$")
	public void user_gives_in_search_field(String arg1) throws Throwable {
		HompageAfterlogin hp=new HompageAfterlogin();
		
		sendKeysToElement(hp.getSearchField(),arg1);

	}
}


		
	
	
	




 