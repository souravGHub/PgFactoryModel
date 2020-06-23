package com.ssg.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ssg.base.Page;
import com.ssg.pages.actions.HomePage;

public class FlightSearchTest {
	@Test
	public void flightSearchTest() throws InterruptedException {
		Page.initConfiguration();
		HomePage hp = new HomePage();
		Assert.assertEquals(hp.findTabCount(),5);
		hp.gotoFlight();		
		hp.bookFlight("ccu","yyz","23/07/2020","24/08/2020",3,1);
		Page.quitBrowser();
	}
}

