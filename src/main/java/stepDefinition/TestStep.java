package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObj.framesPage;
import setup.SeleniumSetup;

public class TestStep {
	WebDriver driver;

	String b="chrome";
	
	@Given("User is in home page")
	public void user_is_on_Home_Page() throws Throwable {
		
		SeleniumSetup ss = new SeleniumSetup();
		ss.startApp(b);
	}
	
	@And("Click tab button and perform function close the tab")
	public void user_Navigate() throws Throwable 
	{
		 new framesPage(driver).tab();
		
	}
	@Then("Click frame tab and manual testing")
	public void user_navigate_frame() throws Throwable
	{
		framesPage f1 = new framesPage(driver);
		f1.frame();
	} 
	
} 
