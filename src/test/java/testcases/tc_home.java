package testcases;

 import org.testng.annotations.Test;

import pageObj.homePage;
import setup.SeleniumSetup;

public class tc_home extends SeleniumSetup {
	
	@Test
	public void homeTC() throws Exception{
		
    	new homePage(driver).enterUsername();
	}





}
