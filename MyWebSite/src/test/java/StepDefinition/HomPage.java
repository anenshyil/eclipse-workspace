package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class HomPage {
	
	public WebDriver driver=new ChromeDriver();
	
	@Given("Verify User able to launch browser with url {string}")
	public void verify_user_able_to_launch_browser_with_url(String string) {
		String loc = System.getProperty("user.dir");
		System.out.println(loc+"Driver/chromedriver.exe");
		System.setProperty("WebDriver.chrome.driver", loc+"Driver/chromedriver.exe");
		driver.get(string);
		driver.manage().window().maximize();

	}


}
