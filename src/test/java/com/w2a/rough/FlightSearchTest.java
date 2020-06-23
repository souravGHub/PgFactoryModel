package com.w2a.rough;
import com.ssg.base.Page;
import com.ssg.pages.actions.HomePage;

public class FlightSearchTest {
	
	public static void main(String[] args) {
		Page.initConfiguration();
		HomePage hp = new HomePage();
		hp.gotoFlight();		
		try {
			hp.bookFlight("ccu","yyz","23/07/2020","24/08/2020",3,1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}		
		Page.quitBrowser();
	}
}

