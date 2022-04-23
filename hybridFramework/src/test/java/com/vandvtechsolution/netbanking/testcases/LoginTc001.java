package com.vandvtechsolution.netbanking.testcases;

import org.testng.annotations.Test;

import com.vandvtechsolution.netbanking.pageobjects.HomePage;
import com.vandvtechsolution.netbanking.pageobjects.LoginPage;
import com.vandvtechsolution.netbanking.testbase.TestBase;

public class LoginTc001 extends TestBase {

	
	//@Test
//	public void verifyLoginFunctionalityTC001() {

//		LoginPage login = new LoginPage(driver);
//		login.setUserName("mngr395244");
//		login.setPassword("YrYbEjY");
//		login.clickOnLoginBtn();
//	}
	
	@Test
	public void verifyLoginFunctionalityTC001() {

		LoginPage login = new LoginPage(driver);
		login.setUserName(configDataProvider.getUserName());
		login.setPassword(configDataProvider.getPassword());
		HomePage homepage = login.clickOnLoginBtn();
	}
}
