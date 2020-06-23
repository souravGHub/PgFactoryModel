package com.ssg.testcases;

import org.testng.annotations.Test;

import com.ssg.base.Page;
import com.ssg.pages.actions.SigninPage;

public class SignInTest {
	@Test
	public  void signInTest() throws InterruptedException {
		Page.initConfiguration();
		SigninPage sp= Page.topNav.gotoLogin();
		sp.doLogin("babloo@gmail.com","tabloo");
		Thread.sleep(2000);
		Page.quitBrowser();
	}
}
