package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import setup.SeleniumSetup;

public class homePage extends SeleniumSetup{
	
	WebDriver driver;
	public homePage(WebDriver driver) throws Exception{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		}
	
	
	
	@FindBy(how = How.XPATH, using = "(//a[@href=\"https://www.globalsqa.com/demo-site/accordion-and-tabs/\"])[1]")
	private WebElement eleUserName;
	
	
	public homePage enterUsername() {
		
		eleUserName.click();
		return this;
	}
	
	
	

}
