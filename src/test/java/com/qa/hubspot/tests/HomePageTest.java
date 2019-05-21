/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.commons.Constants;
import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.util.CommonUtil;

public class HomePageTest {

	BasePage basePage;
	WebDriver driver;
	Properties prop;
	LoginPage loginPage;
	HomePage homePage;

	@BeforeMethod
	public void setUP() {
		basePage = new BasePage();
		prop = basePage.initilize_properties();
		driver = basePage.initilize_driver(prop);
		driver.get(prop.getProperty("url"));
		CommonUtil.longWait();

		loginPage = new LoginPage(driver);
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		CommonUtil.longWait();
	}

	@Test(priority = 1)
	public void verifyHomePageTitle() {
		String title = homePage.getHomePageTitle();
		System.out.println("Home Page title is :: " + title);
		Assert.assertEquals(title, Constants.HOMEPAGE_TITLE, "Wrong home page title");
	}

	@Test(priority = 2)
	public void verifyHomePageHeaderTest() {
		String header = homePage.getHomePageHeaderValue();
		System.out.println("Home Page header is :: " + header);
		Assert.assertEquals(header, Constants.HOMEPAGE_HEADER, "Wrong home page header");
	}

	@Test(priority = 3)
	public void verifyLoggedInAccountNameTest() {
		String accountName = homePage.getLoggedInAccountName();
		System.out.println("Name of the logged in username or account name is :: " + accountName);
		Assert.assertEquals(accountName, prop.getProperty("accountName"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
