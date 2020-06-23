package com.ssg.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

	@FindBy(css = "#gc-custom-header-nav-bar-acct-menu")	
	public WebElement sighIn;
	@FindBy(css = "#account-signin")	
	public WebElement accLogin;
	
	
}
