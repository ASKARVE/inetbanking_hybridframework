package com.vandvtechsolution.netbanking.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vandvtechsolution.netbanking.utility.Helper;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//		OR HomePage Layer
	@FindBy(linkText ="New Customer")
	@CacheLookup
	WebElement newCustomer_link;

	@FindBy(linkText = "Edit Customer")
	WebElement editCustomer_link;

	@FindBy(linkText = "Delete Customer")
	WebElement deleteCustomer_link;

	@FindBy(linkText = "New Account")
	WebElement newAccount_link;

	@FindBy(linkText = "Log out")
	WebElement logout_link;

	public  AddNewCustomerPage clickonNewCustomerLink() {
		try {
			newCustomer_link.click();
			return new AddNewCustomerPage(driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public EditCustomerPage clickOnEditCustomer() {
		try {
			editCustomer_link.click();
			return new EditCustomerPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public NewAccountPage clickOnNewAccount() {
		try {
			newAccount_link.click();
			return new NewAccountPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public LogoutPage clickOnLogoutLink() {
		try {
			logout_link.click();
			if(Helper.isAlertPresent(driver)){
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
			}
			return new LogoutPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
