package org.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Implementation extends BaseClass{
	
	@Test
	public void test1() {
		
		browsers("Chrome");
		impWait(10);
		urlLaunch("https://www.facebook.com/");
		LoginPage lo=new LoginPage();
		sendKeys(lo.getTxtUsername(), "hari");
		sendKeys(lo.getTxtPass(), "12234");
		click(lo.getClickLogin());

	}

	

}
