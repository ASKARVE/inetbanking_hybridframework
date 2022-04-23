package com.vandvtechsolution.netbanking.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vandvtechsolution.netbanking.pageobjects.LoginPage;
import com.vandvtechsolution.netbanking.testbase.TestBase;

public class LoginTc002 extends TestBase {

	@DataProvider
	public Object[][] getData() {
		return excelDataProvider.getExcelData("Login");
	}

	@Test(dataProvider = "getData")
	public void verifyLoginFunctionalityDDTest(Object username, Object password) {
		LoginPage login = new LoginPage(driver);
		login.setUserName((String) username);
		login.setPassword((String) password);
		login.clickOnLoginBtn();
	}
//	@Test
//	public void verifyLoginFunctionalityTC001() {
//
//		LoginPage login = new LoginPage(driver);
//		login.setUserName(excelDataProvider.getStringCellValue("Login", 1, 0));
//		login.setPassword(excelDataProvider.getStringCellValue("Login", 1, 1));
//		
//		login.clickOnLoginBtn();
//		login.setUserName(configDataProvider.getUserName());
//		login.setPassword(configDataProvider.getPassword());
//		HomePage homepage = login.clickOnLoginBtn();
//	}

}
