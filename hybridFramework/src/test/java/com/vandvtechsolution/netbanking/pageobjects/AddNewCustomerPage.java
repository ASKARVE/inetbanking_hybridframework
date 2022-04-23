package com.vandvtechsolution.netbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver driver;

	public AddNewCustomerPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(name = "name")
	@CacheLookup
	WebElement customerNameTxt;

	@FindBy(xpath = "//input[@type='radio' and @value= 'm']")
	@CacheLookup
	WebElement maleRadioBtn;

	@FindBy(xpath = "//input[@type='radio' and @value= 'f']")
	@CacheLookup
	WebElement femaleRadioBtn;

	@FindBy(name = "dob")
	@CacheLookup
	WebElement custdobTxt;

	@FindBy(name = "addr")
	@CacheLookup
	WebElement addrTxt;

	@FindBy(name = "city")
	@CacheLookup
	WebElement cityTxt;

	@FindBy(name = "state")
	@CacheLookup
	WebElement stateTxt;

	@FindBy(name = "pinno")
	@CacheLookup
	WebElement pinnoText;

	@FindBy(name = "telephoneno")
	@CacheLookup
	WebElement telephonenoTxt;

	@FindBy(name = "emailid")
	@CacheLookup
	WebElement emailidTxt;

	@FindBy(name = "password")
	@CacheLookup
	WebElement passwordTxt;

	@FindBy(name = "sub")
	@CacheLookup
	WebElement subBtn;

	public void setCustomerName(String custName) {
		customerNameTxt.clear();
		customerNameTxt.sendKeys(custName);
	}

	public void clickOnGendrRadioBtn(String gender) {
		if (gender.equals("male")) {
			maleRadioBtn.click();
		} else {
			femaleRadioBtn.click();
		}
	}

	public void setDob(String dob) {
		custdobTxt.sendKeys(dob);
	}

	public void setAddress(String address) {
		addrTxt.clear();
		addrTxt.sendKeys(address);
	}

	public void setCity(String city) {
		cityTxt.clear();
		cityTxt.sendKeys(city);
	}

	public void setState(String state) {
		stateTxt.clear();
		stateTxt.sendKeys(state);
	}

	public void setPinCode(String pin) {
		pinnoText.clear();
		pinnoText.sendKeys(pin);
	}

	public void setTelePhoneNo(String telephoneno) {
		telephonenoTxt.clear();
		telephonenoTxt.sendKeys(telephoneno);
	}

	public void setEmailId(String email) {
		emailidTxt.clear();
		emailidTxt.sendKeys(email);
	}

	public void setPassword(String pass) {
		passwordTxt.clear();
		passwordTxt.sendKeys(pass);
	}

	public void clickOnSubmit() {
		subBtn.click();
	}

}
