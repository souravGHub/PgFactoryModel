package com.ssg.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.ssg.base.Page;
import com.ssg.pages.locators.HomePageLocators;
public class HomePage extends Page{
	
	public HomePageLocators hplocator;
	public HomePage() {
		this.hplocator = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.hplocator);
	}
	
	public void gotoHotel() {
	}
	public void bookHotel() {
	}
	public HomePage gotoFlight() {		
		hplocator.flightTab.click();
		hplocator.roundTrip.click();
		return this;
	}
	public void bookFlight(String fromCity, String toCity, String departDt,
		String returnDt,int noOfAdults,int noOfChildren) throws InterruptedException {
		hplocator.fromCity.sendKeys(fromCity);
		Thread.sleep(2000);
		hplocator.clickCity.click();
		hplocator.toCity.sendKeys(toCity);
		Thread.sleep(2000);
		hplocator.clickCity.click();
		hplocator.departDate.sendKeys(departDt);
		hplocator.returnDate.sendKeys(returnDt);		
		hplocator.noOfTravelersButton.click();
		for (int i = 1;i<noOfAdults;i++) {
			hplocator.noOfAdults.click();			
		}
		for (int i = 1;i<=noOfChildren;i++) {
			hplocator.noOfChildren.click();			
		}
		Select dropdown = new Select(hplocator.ageOfChild); 
		dropdown.selectByVisibleText("13"); 

		Thread.sleep(2000);
		hplocator.searchBtn.click();
		Thread.sleep(2000);
		Page.quitBrowser();
	}
}
