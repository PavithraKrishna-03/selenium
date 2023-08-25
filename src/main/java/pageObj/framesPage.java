package pageObj;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import setup.SeleniumSetup;

public class framesPage extends SeleniumSetup{
	
	WebDriver driver;
	
	public framesPage(WebDriver driver) throws Exception{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		}
	
	
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),\"Frames\")])[2]")
	private WebElement frameTab;
	
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),\"Click Here\")])[1]")
	private WebElement clickHere;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),\"iFrame\")]")
	private WebElement iframe;
	
	
	public framesPage tab() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		frameTab.click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		clickHere.click();
		Thread.sleep(2000);
		driver.switchTo().window(windows.get(0));
		return this;
	}
	
public framesPage frame() throws InterruptedException {
		

	iframe.click();
		return this;
	}
	
	
	

}
