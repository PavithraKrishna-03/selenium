package testcases;

 import org.testng.annotations.Test;

import pageObj.framesPage;
import setup.SeleniumSetup;


public class tc_home extends SeleniumSetup {
	
	@Test
	public void frameTC() throws Exception{
		
		new framesPage(driver).tab().frame();
	}
				
	





}
