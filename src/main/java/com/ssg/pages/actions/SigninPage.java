package com.ssg.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ssg.base.Page;
import com.ssg.pages.locators.SigninPageLocators;

public class SigninPage extends Page{
	public SigninPageLocators sinplocator;
	public SigninPage() {
		this.sinplocator = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.sinplocator);
	}
	
	
	public void doLogin(String userName, String password) throws InterruptedException {
		Thread.sleep(2000);
		//sinplocator.sighInWithFB.click();
		
		
		sinplocator.userId.sendKeys(userName);
		sinplocator.password.sendKeys(password);
		sinplocator.loginSubmit.click();
	}
	
	
}
