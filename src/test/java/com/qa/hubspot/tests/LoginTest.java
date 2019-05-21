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
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.util.CommonUtil;

public class LoginTest {

	BasePage basePage;
	WebDriver driver;
	Properties prop;
	LoginPage loginPage;

	@BeforeMethod
	public void setUP() {
		basePage = new BasePage();
		prop = basePage.initilize_properties();
		driver = basePage.initilize_driver(prop);
		driver.get(prop.getProperty("url"));
		CommonUtil.longWait();

		loginPage = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page title is :: " + title);
		Assert.assertEquals(title, Constants.LOGINPAGE_TITLE, "login page title is not correct");
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(loginPage.verifySignUpLink(), "Signup link is not visible");
	}

	@Test(priority = 3)
	public void loginTest() {

		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
