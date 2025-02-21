package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {
	WebDriver driver;	
	@FindBy(name = "email")
	WebElement input_mailid;

	

public PageFactoryLogin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}