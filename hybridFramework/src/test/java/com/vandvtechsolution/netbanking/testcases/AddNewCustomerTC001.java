package com.vandvtechsolution.netbanking.testcases;

import org.testng.annotations.Test;

import com.vandvtechsolution.netbanking.pageobjects.AddNewCustomerPage;
import com.vandvtechsolution.netbanking.pageobjects.HomePage;
import com.vandvtechsolution.netbanking.pageobjects.LoginPage;
import com.vandvtechsolution.netbanking.testbase.TestBase;

public class AddNewCustomerTC001 extends TestBase {

	@Test
	public void addNewCustomerTest() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.setUserName(configDataProvider.getUserName());
		login.setPassword(configDataProvider.getPassword());
		HomePage homepage = login.clickOnLoginBtn();

		Thread.sleep(3000);

		AddNewCustomerPage addcust = homepage.clickonNewCustomerLink();
		addcust.setCustomerName("ABCD"); 
		addcust.clickOnGendrRadioBtn("male");
		
		addcust.setDob("12");
		Thread.sleep(3000);
		addcust.setDob("05");
		Thread.sleep(3000);
		addcust.setDob("2010");
		
		addcust.setAddress("TV centre, Abd");
		addcust.setCity("Aurangabad");
		addcust.setState("Maharashtra");
		addcust.setPinCode("431001");
		
		addcust.setTelePhoneNo("9823454546");
		addcust.setEmailId("askp@gmail.com");
		addcust.setPassword("Anit12AS");
		addcust.clickOnSubmit();

	}
}
