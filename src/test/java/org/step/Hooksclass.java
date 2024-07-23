package org.step;

import org.helper.Baseclass;
import org.junit.After;
import org.junit.Before;

public class Hooksclass extends Baseclass {
	
	@Before()
	public void browserOpen() {
		chromeBrowser();
		maxwindow();
		passUrl("https://www.facebook.com");
	}
	
	@Before()
	public void t1() {
		System.out.println("order2");
	}
	@After()
	public void closeBrowser() {
		driver.close();
	}
	
	@After()
	public void tc3() {
		System.out.println("order4");
	}

}
