package com.vandvtechsolution.netbanking.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.vandvtechsolution.netbanking.utility.ConfigDataProvider;
import com.vandvtechsolution.netbanking.utility.ExcelDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	static String configdatapath = "./Config/Config.properties";
	static String excelDataProviderPath = "./TestData/Data.xlsx";

	public ConfigDataProvider configDataProvider;
	public ExcelDataProvider excelDataProvider;

	@BeforeSuite
	public void init() {
		configDataProvider = new ConfigDataProvider(configdatapath);
		 excelDataProvider = new ExcelDataProvider(excelDataProviderPath);
	}

	@BeforeMethod
	@Parameters({ "browser"})
	public void setUp(@Optional ("Chrome") String brName) {
		if (brName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (brName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("browser not matched please check with expected browser");
		}

		driver.manage().window().maximize();
		driver.get(configDataProvider.getURL());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
