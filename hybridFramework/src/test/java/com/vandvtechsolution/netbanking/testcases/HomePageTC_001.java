package com.vandvtechsolution.netbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vandvtechsolution.netbanking.pageobjects.HomePage;
import com.vandvtechsolution.netbanking.pageobjects.LoginPage;
import com.vandvtechsolution.netbanking.testbase.TestBase;

public class HomePageTC_001 extends TestBase {

	HomePage homepage;

	@Test(priority = 1)
	public void verifyLoginFunctionalityTC001() {

		LoginPage login = new LoginPage(driver);
		login.setUserName(configDataProvider.getUserName());
		login.setPassword(configDataProvider.getPassword());
		homepage = login.clickOnLoginBtn();
	}

	

	@Test(priority = 2)
	public void verifyLogoutFunctionality() {

		homepage.clickOnLogoutLink();
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 3, enabled = false)
	public void navigateToEditCustomerPage() {

		homepage.clickOnEditCustomer();
	}
}
