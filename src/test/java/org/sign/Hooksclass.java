package org.sign;

import java.io.IOException;

import org.helper.Baseclass;
import org.junit.After;
import org.junit.Before;

import cucumber.api.Scenario;

public class Hooksclass extends Baseclass {
	
	@Before()
	public void browserOpen() {
		chromeBrowser();
		maxwindow();
		passUrl("https://www.facebook.com");
	}
	
	
	@After()
	public void closeBrowser(Scenario s) throws IOException {
		String name = s.getName();
		String sName= name.replace(" ", "_");
		takeScreenshot(sName);
		driver.close();
	}


}
