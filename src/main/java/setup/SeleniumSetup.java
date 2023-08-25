package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumSetup {
	
	public static  WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void startApp(String browser) throws Exception {
		try {
			if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = (WebDriver) new FirefoxDriver();
				driver.get("https://www.globalsqa.com/demo-site/");
			}
			else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=(WebDriver) new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/");
			}
		}
		catch(WebDriverException e)
		{
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
}
