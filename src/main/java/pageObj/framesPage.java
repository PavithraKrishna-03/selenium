package pageObj;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import setup.SeleniumSetup;

public class framesPage {
	
	public WebDriver driver;
	public JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public framesPage(WebDriver driver) throws Exception{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
		}
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),\"Frames\")])[2]")
	public WebElement frameTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),\"DraggableBox\")]")
	private WebElement frameTab1;
	
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),\"Click Here\")])[1]")
	private WebElement clickHere;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),\"iFrame\")]")
	private WebElement iframe;
	
	@FindBy(how = How.TAG_NAME, using = "iframe")
	private List <WebElement> iframe1;
	
	@FindBy(how = How.XPATH, using = "//iframe[@name=\"globalSqa\"]")
	private WebElement switch1;
	
	@FindBy(how = How.XPATH, using = "//a[@href=\"https://www.globalsqa.com/training/manual-testing-training/\"]")
	private WebElement manual_test;
	
	public void tab() throws InterruptedException {
		
System.out.println("sdfsdfsfsf");
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("hrlllooo");
		frameTab.click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		clickHere.click();
		Thread.sleep(2000);
		driver.switchTo().window(windows.get(0));
		//return this;
	}
	
public framesPage frame() throws InterruptedException {

	iframe.click();
	driver.switchTo().frame(3);
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,500)");
	manual_test.click();
	
		return this;
	}
	
	
	

}
