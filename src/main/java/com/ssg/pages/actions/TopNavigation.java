package com.ssg.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ssg.pages.locators.TopNavigationLocators;

public class TopNavigation {
	public TopNavigationLocators tnlocator;
	public TopNavigation(WebDriver driver) {
		this.tnlocator = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.tnlocator);
	}
	
	public void gotoSignin() {
		
	}
	public SigninPage gotoLogin() {
		tnlocator.sighIn.click();
		tnlocator.accLogin.click();	
		return new SigninPage();
	}
	public void gotoCreateAccount() {
		
	}
	public void gotoLastMinDeals() {
		
	}
	public void gotoSupport() {
		
	}
}
