package com.w2a.rough;

import com.ssg.base.Page;
import com.ssg.pages.actions.SigninPage;

public class SignInTest {
	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
		SigninPage sp= Page.topNav.gotoLogin();
		sp.doLogin("sourav2u06@gmail.com","4rfvsssFV");
		Thread.sleep(2000);
		Page.quitBrowser();
	}
}
