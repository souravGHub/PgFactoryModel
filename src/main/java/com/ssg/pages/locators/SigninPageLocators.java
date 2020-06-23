package com.ssg.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {
	
	@FindBy(css = "#gss-signin-login-facebook-button")	
	public WebElement sighInWithFB;
	
	@FindBy(css = "#gss-signin-email")	
	public WebElement userId;	
	@FindBy(css = "#gss-signin-password")	
	public WebElement password;
	
	@FindBy(css = "#gss-signin-submit")	
	public WebElement loginSubmit;
}
